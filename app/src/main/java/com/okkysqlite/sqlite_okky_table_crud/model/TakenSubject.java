package com.okkysqlite.sqlite_okky_table_crud.model;

public class TakenSubject extends Subject{

    private boolean isTaken;

    public TakenSubject(int id, String name, int code, double credit, boolean isTaken) {
        super(id, name, code, credit);
        this.isTaken = isTaken;
    }

    public boolean isTaken() {
        return isTaken;
    }
}
