package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit.controller;

import android.app.Activity;
import android.util.Log;

import com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit.model.Repository;

/**
 * Created by gustavosotnas on 08/05/16.
 */
public class RepositoryController {
    public static void verifySetRepositoryName(Activity activityToShow, Repository repository)
    {
        if (repository.getName().isEmpty()) {
            Log.w("informacao", "Repositório está vazio");
        }
    }
}
