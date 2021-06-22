package com.company;

import java.util.Scanner;

public class Main {

    public static String[] strings;

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String [] y = strings;
        strings = new String[6];
        for (int i = 0; i <6; i++){
            strings[i] = x.nextLine();
        }
        //System.out.println(strings[0].equals(strings[1]));
        //System.out.println(strings[0].equals(strings[2]));
        //System.out.println(strings[0].equals(strings[3]));
        if (strings[0].equals(strings[1]) == true){
            strings[0]=strings[1] = null;

        }
        if (strings[2].equals(strings[5]) == true){
            strings[2]=strings[5] = null;

        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
