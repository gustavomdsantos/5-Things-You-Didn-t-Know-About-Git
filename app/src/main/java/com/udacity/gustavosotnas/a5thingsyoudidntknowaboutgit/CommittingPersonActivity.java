package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit.controller.RepositoryController;

/**
 * Created by gustavosotnas on 05/05/16.
 */
public class CommittingPersonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committing_person);
        RepositoryController.verifySetRepositoryName(this, MainActivity.getRepository());
        setClicableLinksInTextView(R.id.committing_person_textView1);
    }

    /**
     * text2 has links specified by putting <a> tags in the string
     * resource.  By default these links will appear but not
     * respond to user input.  To make them active, you need to
     * call setMovementMethod() on the TextView object.
     *
     * @param R_id_targetTextView The ID of the TextView that contains links
     *                            like this: "<a href="http://www.google.com">Google</a>"
      */
    private void setClicableLinksInTextView(int R_id_targetTextView)
    {
        TextView t2 = (TextView) findViewById(R.id.committing_person_textView1);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
