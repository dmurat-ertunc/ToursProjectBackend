package com.dme.ToursProject.business.manager;

import com.dme.ToursProject.business.service.IUserService;
import com.dme.ToursProject.dto.LoginDto;
import com.dme.ToursProject.dto.RegisterDto;
import com.dme.ToursProject.entity.Role;
import com.dme.ToursProject.entity.User;
import com.dme.ToursProject.repository.IRoleDao;
import com.dme.ToursProject.repository.IUserDao;
import com.dme.ToursProject.result.ErrorResult;
import com.dme.ToursProject.result.Result;
import com.dme.ToursProject.result.SuccesDataResult;
import com.dme.ToursProject.result.SuccesResult;
import com.dme.ToursProject.security.CustomUserDetailService;
import com.dme.ToursProject.security.JWTGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserManager implements IUserService {

    private AuthenticationManager authenticationManager;
    private IUserDao userDao;
    private IRoleDao roleDao;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;
    private CustomUserDetailService customUserDetailService;

    @Autowired
    public UserManager(AuthenticationManager authenticationManager, IUserDao userDao,
                          IRoleDao roleDao, PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator
                          ,CustomUserDetailService customUserDetailService) {
        this.authenticationManager = authenticationManager;
        this.userDao = userDao;
        this.roleDao = roleDao;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
        this.customUserDetailService=customUserDetailService;
    }


    @Override
    public Result signUp(RegisterDto registerDto) {
        List<User> userList = userDao.findAll();

        for (User user : userList){
            if (user.getUserName().equals(registerDto.getUserName())){
                return new ErrorResult("Bu kullanıcı adı önceden alınmış",false);
            }
            if (user.getMail().equals(registerDto.getMail())){
                return new ErrorResult("Bu e-posta adresi önceden alınmış",false);
            }
        }

        User user = new User();

        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.setMail(registerDto.getMail());
        user.setUserName(registerDto.getUserName());
        user.setName(registerDto.getName());
        user.setNationality(registerDto.getNationality());
        user.setSurName(registerDto.getSurName());
        Role roles = roleDao.findByName("user").get();
        user.setRoles(Collections.singletonList(roles));

        userDao.save(user);

        return new SuccesResult("Kayıt olma işlemi başarılı",true);
    }

    @Override
    public Result signIn(LoginDto loginDto) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginDto.getUsername(),
                            loginDto.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String token = jwtGenerator.generateToken(authentication);
            UserDetails userDetails = customUserDetailService.loadUserByUsername(loginDto.getUsername());

            Map<String,Object> loginResponse = new HashMap<>();
            loginResponse.put("token",token);
            loginResponse.put("username",userDetails.getUsername());
            loginResponse.put("roles",userDetails.getAuthorities());

            return new SuccesDataResult("Giriş Başarılı",true,loginResponse);
        } catch (Exception e) {
            return new ErrorResult("Kullanıcı adı veya şifre yanlış",false);
        }
    }
}
