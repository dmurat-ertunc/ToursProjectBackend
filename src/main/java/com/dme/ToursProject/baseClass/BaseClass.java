package com.dme.ToursProject.baseClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public abstract class BaseClass{
    public <D, T> T dtoToEntity(D dto, Function<D, T> mapper) {
        return mapper.apply(dto);
    }

    public <T, D> D entityToDto(T entity, Function<T, D> mapper){
        return mapper.apply(entity);
    }

    public <T, D> List<D> entityToDtoList(List<T> entities, Function<T, D> mapper){
        List<D> dtoList = new ArrayList<>();

        for (T entity : entities){
            D dto = mapper.apply(entity);
            dtoList.add(dto);
        }
        return dtoList;
    }

//    public <T, D> boolean uniqueControl(List<T> entities, D dto, String metotName){
//        try {
//            Method dtoMethod = dto.getClass().getMethod(metotName);
//            Object dtoValue = dtoMethod.invoke(dto);
//            for (T entity : entities) {
//                Method methot = entity.getClass().getMethod(metotName);
//                Object value = methot.invoke(entity);
//                if (value.equals(dtoValue)) {
//                    return true;
//                }
//            }
//        } catch (NoSuchMethodException e) {
//            System.err.println("Belirtilen metot bulunamadı: " + e.getMessage());
//        } catch (IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
