package com.ifandika.data;

import java.util.ArrayList;

public class Response {
    private String message;
    private int code;
    private ArrayList<Object> arrayList;

    public Response() {
        arrayList = new ArrayList<>();
    }

    public Response(String message, int code, ArrayList<Object> arrayList) {
        this.message = message;
        this.code = code;
        this.arrayList = arrayList;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<Object> getArrayList() {
        return this.arrayList;
    }

    public void setArrayList(ArrayList<Object> arrayList) {
        this.arrayList = arrayList;
    }

    public void addStudent(Object object) {
        arrayList.add(object);
    }
}
