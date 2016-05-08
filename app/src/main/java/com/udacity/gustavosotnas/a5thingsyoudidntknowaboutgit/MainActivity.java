package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit.model.Repository;

public class MainActivity extends AppCompatActivity {

    private static Repository repository = new Repository();

    public static Repository getRepository() {
        return repository;
    }

    public static void setRepository(Repository repository) {
        MainActivity.repository = repository;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonLinks();
    }

    /**
     * Sets onClick event programmatically instead of setting it in XML files
     * (both Landscape XML and Portrait XML)
     */
    private void setButtonLinks(){
        Button thing1 = (Button) findViewById(R.id.thing1);
        thing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick_AnyButtonInMainActivity(R.id.thing1);
            }
        });

        Button thing2 = (Button) findViewById(R.id.thing2);
        thing2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick_AnyButtonInMainActivity(R.id.thing2);
            }
        });

        Button thing3 = (Button) findViewById(R.id.thing3);
        thing3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick_AnyButtonInMainActivity(R.id.thing3);
            }
        });

        Button thing4 = (Button) findViewById(R.id.thing4);
        thing4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick_AnyButtonInMainActivity(R.id.thing4);
            }
        });

        Button thing5 = (Button) findViewById(R.id.thing5);
        thing5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick_AnyButtonInMainActivity(R.id.thing5);
            }
        });
    }

    /**
     * Opens the activity related to the button in the row of buttons in MainActivity View
     * @param R_id_thingX The ID of the pressed button
     */
    public void onClick_AnyButtonInMainActivity(int R_id_thingX)
    {
        Intent intent;
        Class desiredActivity = null; // Target Java class (an Activity)

        switch (R_id_thingX)
        {
            case R.id.thing1:
                desiredActivity = NewCommitsActivity.class;
                break;
            case R.id.thing2:
                desiredActivity = CommittingPersonActivity.class;
                break;
            case R.id.thing3:
                desiredActivity = CommittingDateActivity.class;
                break;
            case R.id.thing4:
                desiredActivity = MasteringGitTagsActivity.class;
                break;
            case R.id.thing5:
                desiredActivity = BestPracticesActivity.class;
                break;
        }
        intent = new Intent(MainActivity.this, desiredActivity);
        startActivity(intent);
    }
}
