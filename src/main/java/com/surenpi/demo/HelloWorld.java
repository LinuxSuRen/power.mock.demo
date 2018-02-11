package com.surenpi.demo;

import java.io.File;

public class HelloWorld
{
    public void hello()
    {
        System.out.println("say hello to everyone.");
    }

    public boolean fileExists(File file)
    {
        return file.exists();
    }

    public String word()
    {
        return "This is my word.";
    }
}