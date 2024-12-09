package com.dme.ToursProject.result;

public class ErrorResult extends Result{
    public ErrorResult(String message,Boolean status){
        super(message,false);
    }
}