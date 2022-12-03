package com.nmjava.chatapp.Models;

public class modelAdminList {
    private int AdminID;
    private int GroupAdID;

    private String AdminName;
    private String GroupAdName;

    public modelAdminList(int adminID, String adminName,  int groupAdID,  String groupAdName) {
        AdminID = adminID;
        GroupAdID = groupAdID;
        AdminName = adminName;
        GroupAdName = groupAdName;
    }

    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int adminID) {
        AdminID = adminID;
    }

    public int getGroupAdID() {
        return GroupAdID;
    }

    public void setGroupAdID(int groupAdID) {
        GroupAdID = groupAdID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getGroupAdName() {
        return GroupAdName;
    }

    public void setGroupAdName(String groupAdName) {
        GroupAdName = groupAdName;
    }
}