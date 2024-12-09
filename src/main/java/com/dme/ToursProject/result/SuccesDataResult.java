package com.dme.ToursProject.result;

public class SuccesDataResult<T> extends DataResult {
    public SuccesDataResult(String message, boolean status, T data){
        super(message, true, data);
    }
}
