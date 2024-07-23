package com.okkysqlite.sqlite_okky_table_crud.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}