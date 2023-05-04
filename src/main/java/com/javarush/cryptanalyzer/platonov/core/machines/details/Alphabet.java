package com.javarush.cryptanalyzer.platonov.core.machines.details;

public class Alphabet
{
    private char[] alphabet;
    private int size;

    public int getSize()
    {
        return size;
    }

    public int indexOfChar(char ch)
    {
        for (int i = 0; i < size; i++)
        {
            if (alphabet[i] == ch)
            {
                return i;
            }
        }
        return -1;
    }

    public char charOfIndex(int index)
    {
        return alphabet[index];
    }
}
