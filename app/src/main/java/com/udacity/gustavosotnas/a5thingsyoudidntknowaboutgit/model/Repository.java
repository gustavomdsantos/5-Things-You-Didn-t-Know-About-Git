package com.udacity.gustavosotnas.a5thingsyoudidntknowaboutgit.model;

/**
 * Model class to store user's repository name.
 * Created by gustavosotnas on 08/05/16.
 */
public class Repository {

    private String repositoryName = "";
    private String authorName = "";
    private String authorEmail = "";

    public String getName() {
        return repositoryName;
    }

    public void setName(String name) {
        this.repositoryName = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }
}
