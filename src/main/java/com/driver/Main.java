package com.driver;
import java.util.*;
public class Main {

    public static void main(String [] args)
    {
        RWOnly rw = new RWOnly("shiva");
        //  java: cannot find symbol
       //  symbol: variable memeber
       rw.setName("parsha shiva sai");
       System.out.println(rw.getName());
    }
}