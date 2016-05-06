package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonLinks();
    }

    private void setButtonLinks(){
        Button thing1 = (Button) findViewById(R.id.thing1);
        thing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick$NewCommitsActivity(view);
            }
        });

        Button thing2 = (Button) findViewById(R.id.thing2);
        thing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick$CommittingPersonActivity(view);
            }
        });

        Button thing3 = (Button) findViewById(R.id.thing3);
        thing3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick$CommittingDateActivity(view);
            }
        });

        Button thing4 = (Button) findViewById(R.id.thing4);
        thing4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick$MasteringGitTagsActivity(view);
            }
        });

        Button thing5 = (Button) findViewById(R.id.thing5);
        thing5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick$BestPracticesActivity(view);
            }
        });
    }

    public void onClick$NewCommitsActivity(View view) {

        Intent intent = new Intent(MainActivity.this, NewCommitsActivity.class);
        startActivity(intent);
    }

    public void onClick$CommittingPersonActivity(View view) {

        Intent intent = new Intent(MainActivity.this, CommittingPersonActivity.class);
        startActivity(intent);
    }

    public void onClick$CommittingDateActivity(View view) {

        Intent intent = new Intent(MainActivity.this, CommittingDateActivity.class);
        startActivity(intent);
    }

    public void onClick$MasteringGitTagsActivity(View view) {

        Intent intent = new Intent(MainActivity.this, MasteringGitTagsActivity.class);
        startActivity(intent);
    }

    public void onClick$BestPracticesActivity(View view) {

        Intent intent = new Intent(MainActivity.this, BestPracticesActivity.class);
        startActivity(intent);
    }
}
