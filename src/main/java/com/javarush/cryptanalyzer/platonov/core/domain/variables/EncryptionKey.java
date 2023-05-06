package com.javarush.cryptanalyzer.platonov.core.domain.variables;

import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;

import java.util.Arrays;

public class EncryptionKey
{
    int[] keys;
    int key;
    String keyword;

    public EncryptionKey(int[] keys)
    {
        this.keys = Arrays.copyOf(keys, keys.length);
    }

    public EncryptionKey(int key)
    {
        this.key = key;
    }

    public EncryptionKey(String keyword)
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

    public String getKeyword()
    {
        return keyword;
    }
    public void generateKeysFromKeyword(EncryptionAlphabet alphabet)
    {
        System.out.println("Начинаю генерацию последовательности ключей из ключевого слова...");
        int size = alphabet.getSize();
        char[] keywordCharArray = keyword.toCharArray();
        keys = new int[keywordCharArray.length];
        System.out.println("Длина последовательности ключей = " + keywordCharArray.length);
        for (int i = 0; i < keys.length; i++)
        {
            keys[i] = alphabet.getIndexOfChar(keywordCharArray[i]);
            System.out.println(i + " значение ключа = " + keys[i]);
        }
        System.out.print("Последовательность ключей успешно сгенерирована: ");
        for (int i = 0; i < keys.length; i++)
        {
            System.out.print(keys[i] + " ");
        }
        System.out.println();
    }

}

