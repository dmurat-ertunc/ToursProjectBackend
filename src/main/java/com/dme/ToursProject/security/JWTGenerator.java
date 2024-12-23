package com.dme.ToursProject.security;

import io.jsonwebtoken.*;

import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JWTGenerator {
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private CustomUserDetailService customUserDetailService;

    @Autowired
    public JWTGenerator(CustomUserDetailService customUserDetailService){
        this.customUserDetailService=customUserDetailService;
    }

    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + SecurityConstants.JWT_EXPIRATION);
        UserDetails userDetails = customUserDetailService.loadUserByUsername(username);

        String token = Jwts.builder()
                .setSubject(username)
                .claim("role",userDetails.getAuthorities())
                .setIssuedAt( new Date())
                .setExpiration(expireDate)
                .signWith(key,SignatureAlgorithm.HS256)
                .compact();
        System.out.println("New token :");
        System.out.println(token);
        System.out.println(key.getAlgorithm());
        return token;
    }
    public String getUsernameFromJWT(String token){
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    public boolean validateToken(String token) {
        try {
            System.out.println(key);
            Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build();
            try {
                Claims claims = Jwts.parser()
                        .setSigningKey(key) // Gizli anahtarın doğru olduğundan emin olun
                        .parseClaimsJws(token)
                        .getBody();
                // Claims ile işlemler
            } catch (ExpiredJwtException e) {
                System.out.println("Token süresi dolmuş.");
            } catch (SignatureException e) {
                System.out.println("Token imzası geçersiz.");
            } catch (MalformedJwtException e) {
                System.out.println("Token biçimi bozuk.");
            } catch (IllegalArgumentException e) {
                System.out.println("Token boş veya geçersiz.");
            }
            return true;
        } catch (Exception ex) {
            throw new AuthenticationCredentialsNotFoundException("JWT was exprired or incorrect",ex.fillInStackTrace());
        }
    }
}
