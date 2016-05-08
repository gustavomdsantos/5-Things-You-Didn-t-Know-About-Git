package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gustavosotnas on 08/05/16.
 */
public class RepositoryNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_name);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(RepositoryNameActivity.this, MainActivity.class));
        finish();
    }
}
