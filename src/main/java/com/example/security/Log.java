package com.example.security;

import java.io.FileOutputStream;
import java.io.IOException;

public class Log{
    private static FileOutputStream log=null;
    public Log(){}

    public void log(String s) {
        if(log==null) {
            try {
                log = new FileOutputStream("log.txt");
                log.write(s.getBytes());
            } catch (IOException e) {
                System.out.println("Сan not open log file!");
            }
        }else{
            try{
                log.write(s.getBytes());
            } catch (IOException e) {
                System.out.println("Сan not open log file!");
            }
        }
    }
}

