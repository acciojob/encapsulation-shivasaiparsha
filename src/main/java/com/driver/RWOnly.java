package com.driver;
import java.util.*;
public class RWOnly {

    private String name;

    RWOnly(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }
//
    public void setName(String name) {
        this.name = name;
    }
}
