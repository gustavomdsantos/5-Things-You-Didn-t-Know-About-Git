package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit.controller.RepositoryController;

/**
 * Created by gustavosotnas on 05/05/16.
 */
public class CommittingPersonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcommits);
        getSupportActionBar().setTitle("CommittingPersonActivity");
        RepositoryController.verifySetRepositoryName(this, MainActivity.getRepository());
    }
}
