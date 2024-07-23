package com.okkysqlite.sqlite_okky_table_crud.features.taken_subject_crud.subject_assign;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.okkysqlite.sqlite_okky_table_crud.R;

public class SubjectAssignViewHolder extends RecyclerView.ViewHolder {

    CheckBox checkBox;
    TextView subjectNameTextView;
    TextView courseCodeTextView;
    TextView creditTextView;

    public SubjectAssignViewHolder(View itemView) {
        super(itemView);
        checkBox = itemView.findViewById(R.id.checkbox);
        subjectNameTextView = itemView.findViewById(R.id.subjectNameTextView);
        courseCodeTextView = itemView.findViewById(R.id.courseCodeTextView);
        creditTextView = itemView.findViewById(R.id.creditTextView);
    }
}