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

    public int[] getKeys()
    {
        return keys;
    }
    public int[] getKeys(boolean mode)
    {
        if (mode)
        {
            return keys;
        }
        else
        {
            int[] reverseKeys = Arrays.copyOf(keys, keys.length);
            for (int i = 0; i < reverseKeys.length; i++)
            {
                reverseKeys[i] *= -1;
            }
            return reverseKeys;
        }
    }

    public int getKey()
    {
        return key;
    }
    public int getKey(boolean mode)
    {
        if (mode)
        {
            return getKey();
        }
        else
        {
            return getKey() * -1;
        }
    }
//    public void reverseKey()
//    {
//        key *= -1;
//    }
//
//    public void reverseKeys()
//    {
//        for (int key : keys)
//        {
//            key *= -1;
//        }
//    }

    public String getKeyword()
    {
        return keyword;
    }
    public void generateKeysFromKeyword(Alphabet alphabet)
    {
        int size = alphabet.getSize();
        char[] keywordCharArray = keyword.toCharArray();
        keys = new int[size];
        for (int i = 0; i < size; i++)
        {
            keys[i] = alphabet.getCharOfIndex(i);
        }
    }

}

