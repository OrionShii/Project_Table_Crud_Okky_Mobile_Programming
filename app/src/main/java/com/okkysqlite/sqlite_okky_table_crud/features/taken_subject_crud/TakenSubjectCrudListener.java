package com.okkysqlite.sqlite_okky_table_crud.features.taken_subject_crud;

public interface TakenSubjectCrudListener {
    void onSubjectListUpdate(boolean isUpdated);

    void onTakenSubjectUpdated(boolean isUpdated);
}
