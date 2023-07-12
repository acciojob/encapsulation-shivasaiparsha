package com.driver;

public class Main {

    public static void main(String [] args)
    {
        RWOnly rw = new RWOnly("shiva");
        //  java: cannot find symbol
       //  symbol: variable memeber
       rw.setMember("parsha shiva sai");
       rw.getMember();
    }
}