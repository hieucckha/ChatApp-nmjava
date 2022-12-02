package com.chatapp.model;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class modelGroupID {
    private int GroupID;
    private String GroupName;
    private String GroupUserName;

    public modelGroupID(int GroupID, String GroupName, String GroupUserName) {
        this.GroupID = GroupID;
        this.GroupName = GroupName;
        this.GroupUserName = GroupUserName;
    }

    public int getGroupID() {
        return GroupID;
    }

    public void setGroupID(int groupID) {
        GroupID = groupID;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getGroupUserName() {
        return GroupUserName;
    }

    public void setGroupUserName(String groupUserName) {
        GroupUserName = groupUserName;
    }
}
