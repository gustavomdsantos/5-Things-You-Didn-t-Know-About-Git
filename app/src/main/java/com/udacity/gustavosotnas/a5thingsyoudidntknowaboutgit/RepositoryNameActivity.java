package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by gustavosotnas on 08/05/16.
 */
public class RepositoryNameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_name);

        focusKeyboard(R.id.repositoryEditText);
    }

    /**
     * Force keyboard to show focused in a specific EditText.
     */
    private void focusKeyboard(int R_id_editText)
    {
        EditText editText = (EditText) findViewById(R_id_editText);
        editText.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    /**
     * Forces Android to hide the virtual keyboard, unfocusing the focused element.
     */
    private void unfocusKeyboard()
    {
        // Check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /**
     * When user clicks in "use_default_name_button", the app sets the hint
     * text of the editText to the name of the Git repository in the static
     * Repository variable in MainActivity.
     * @param view not used here, it's necessary param to work with XML View.
     */
    public void onClick$defaultRepositoryName(View view)
    {
        MainActivity.getRepository().setName(getResources().getString(R.string.hint_activity_repository));

        unfocusKeyboard(); // hides keyboard
        finish(); // closes the activity
    }

    /**
     * When user clicks in "save_button", the app sets the name of the Git
     * repository entered in editText to the static Repository variable in
     * MainActivity.
     * @param view not used here, it's necessary param to work with XML View.
     */
    public void onClick$saveRepositoryName(View view)
    {
        EditText editText = (EditText) findViewById(R.id.repositoryEditText);
        MainActivity.getRepository().setName(editText.getText().toString());

        unfocusKeyboard(); // hides keyboard
        finish(); // closes the activity
    }

    /**
     * When user press "Back" button in this activity, the app will go to
     * MainActivity.
     */
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(RepositoryNameActivity.this, MainActivity.class));
        finish();
    }
}
