package com.javarush.cryptanalyzer.platonov.core.domain.alphabetbuilder.constans;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AlphabetsCollection
{
    public final static ArrayList <Character> alphabetRuLowerCase = new ArrayList<>(Arrays.asList('а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'));
    public final static ArrayList <Character> alphabetRuUpperCase = new ArrayList<>(Arrays.asList('А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'));
    public final static ArrayList <Character> alphabetEnLowerCase = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
    public final static ArrayList <Character> alphabetEnUpperCase = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
    public final static ArrayList <Character> arabicNumeralsZeroEnd = new ArrayList<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));


    public static final ArrayList<ArrayList<Character>> alphabetsCollection =  new ArrayList<>(Arrays.asList(alphabetEnUpperCase, alphabetEnLowerCase, alphabetRuUpperCase, alphabetRuLowerCase, arabicNumeralsZeroEnd));

    public static void printSeparateLine(int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print("-----");
        }
        System.out.println();
    }


    public static void printIndexIntLine(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            System.out.printf(" %03d ", array.get(i));
        }
        System.out.println();
    }
    public static void printIndexLine(ArrayList<Character> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            System.out.printf(" %03d ", i);
        }
        System.out.println();
    }

    public static void printValueLine(ArrayList<Character> array)
    {
        for (Character character : array)
        {
            System.out.printf("[ %c ]", character);
        }
        System.out.println();
    }
    public static void printIndexValueBlockLine(ArrayList<Character> array)
    {
        printSeparateLine(array.size());
        printIndexLine(array);
        printValueLine(array);
        printSeparateLine(array.size());
    }
}
