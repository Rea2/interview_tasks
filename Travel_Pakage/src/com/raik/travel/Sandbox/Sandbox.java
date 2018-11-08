package com.raik.travel.Sandbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Rea1 on 11.10.2018.
 */
public class Sandbox {
    File file  = new File ("");

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

    PrintWriter writer = new PrintWriter("%^##76 / // \\ ^^ [ ] : .jpg", "UTF-8");
    writer.println("The first line");
    writer.println("The second line");
    writer.close();
    }

}
