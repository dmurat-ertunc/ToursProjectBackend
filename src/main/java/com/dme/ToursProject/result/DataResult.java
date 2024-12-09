package com.dme.ToursProject.result;

public class DataResult<T> extends Result{

    private T data;

    public DataResult(String message, Boolean status, T data) {
        super(message, status);
        this.data = data;
    }
    public DataResult(String message, Boolean status) {
        super(message, true);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
