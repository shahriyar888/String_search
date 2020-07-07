package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String filePath=args[1];
        File file = new File("/home/xeus/IdeaProjects/search_string/test.txt");
        String sample = args[0];
        System.out.println("sample string is "+ sample);

        try {
            Scanner scanner = new Scanner(file);// Adding file to scanner

            int countInt=0;
            //now read the file line by line...
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if(line.contains(args[0])) {
                    int indexInt=0;
                    while (true){
                        int pos = line.indexOf(sample,indexInt);
                        if (pos<0) break;
                        countInt++;
                        System.out.println(Integer.toString(countInt)+"found in text");
                        indexInt = pos +1;

                    }

                }
            }
            System.out.println("finally "+ countInt +" times found \""+sample+"\" in "+ file.getAbsolutePath());
        } catch(FileNotFoundException e) {
            System.out.println("file not found");
        }


        }


    }

