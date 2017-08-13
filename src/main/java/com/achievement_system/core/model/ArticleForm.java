package com.achievement_system.core.model;

public class ArticleForm {

    private Integer updateForm_articleID;
    private String updateForm_tittle;
    private String updateForm_author;
    private String updateForm_content;

    private String insertForm_tittle;
    private String insertForm_author;
    private String insertForm_content;

    private Integer deleteForm_articleID;

    public Integer getUpdateForm_articleID() {
        return updateForm_articleID;
    }

    public void setUpdateForm_articleID(Integer updateForm_articleID) {
        this.updateForm_articleID = updateForm_articleID;
    }

    public void setDeleteForm_articleID(Integer deleteForm_articleID) {
        this.deleteForm_articleID = deleteForm_articleID;
    }

    public String getUpdateForm_tittle() {
        return updateForm_tittle;
    }

    public void setUpdateForm_tittle(String updateForm_tittle) {
        this.updateForm_tittle = updateForm_tittle;
    }

    public String getUpdateForm_author() {
        return updateForm_author;
    }

    public void setUpdateForm_author(String updateForm_author) {
        this.updateForm_author = updateForm_author;
    }

    public String getUpdateForm_content() {
        return updateForm_content;
    }

    public void setUpdateForm_content(String updateForm_content) {
        this.updateForm_content = updateForm_content;
    }

    public String getInsertForm_tittle() {
        return insertForm_tittle;
    }

    public void setInsertForm_tittle(String insertForm_tittle) {
        this.insertForm_tittle = insertForm_tittle;
    }

    public String getInsertForm_author() {
        return insertForm_author;
    }

    public void setInsertForm_author(String insertForm_author) {
        this.insertForm_author = insertForm_author;
    }

    public String getInsertForm_content() {
        return insertForm_content;
    }

    public void setInsertForm_content(String insertForm_content) {
        this.insertForm_content = insertForm_content;
    }

    public Integer getDeleteForm_articleID() {
        return deleteForm_articleID;
    }
}
