package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class program {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Stories available:" +
                "\ngoldielocks.txt" +
                "\nhansel_and_gretel.txt" +
                "\nmary_had_a_little_lamb.txt");

        System.out.println("enter the name of the story");
        String fileName = keyboard.nextLine().trim();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String storyLine = bufferedReader.readLine();

        int number = 1;

        while(storyLine != null){

            System.out.println(number++ +"." + storyLine);
            storyLine = bufferedReader.readLine();


        }
        bufferedReader.close();
    }
}
