package com.javarush.cryptanalyzer.platonov.core.domain.variables;

import java.util.HashMap;

public class EncryptionAlphabet
{
    private final HashMap<Integer, Character> alphabetKeyIntegerValueCharacter = new HashMap<>();
    private final HashMap<Character, Integer> alphabetKeyCharacterValueInteger = new HashMap<>();
    private final int alphabetSize;

    public EncryptionAlphabet(char[] alphabet)
    {
        alphabetSize = alphabet.length;

        for (int i = 0; i < alphabetSize; i++)
        {
            alphabetKeyIntegerValueCharacter.put(i, alphabet[i]);
            alphabetKeyCharacterValueInteger.put(alphabet[i], i);
        }
    }

    public HashMap<Integer, Character> getAlphabet()
    {
        return alphabetKeyIntegerValueCharacter;
    }
    public int getSize()
    {
        return alphabetSize;
    }

    public int getIndexOfChar(char ch)
    {
        return alphabetKeyCharacterValueInteger.get(ch);
    }

    public char getCharOfIndex(int index)
    {
        return alphabetKeyIntegerValueCharacter.get(index);
    }

}
