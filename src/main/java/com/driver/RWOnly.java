package com.driver;
import java.util.*;
public class RWOnly {

    private String member;

    RWOnly(String member)
    {
        this.member=member;
    }

    public String getMember() {
        return member;
    }
//
    public void setMember(String member) {
        this.member = member;
    }
}
