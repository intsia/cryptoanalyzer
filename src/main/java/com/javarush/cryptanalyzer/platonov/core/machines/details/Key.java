package com.javarush.cryptanalyzer.platonov.core.machines.details;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Alphabet;

import java.util.Arrays;

public class Key
{
    int[] keys;
    int key;
    String keyword;

    public Key(int[] keys)
    {
        this.keys = Arrays.copyOf(keys, keys.length);
    }

    public Key(int key)
    {
        this.key = key;
    }

    public Key(String keyword)
    {
        this.keyword = keyword;
    }

    public void generateKeysFromKeyword(Alphabet alphabet)
    {
        int size = alphabet.getSize();
        char[] keywordCharArray = keyword.toCharArray();
        keys = new int[size];
        for (int i = 0; i < size; i++)
        {
            keys[i] = alphabet.charOfIndex(i);
        }
    }

}

