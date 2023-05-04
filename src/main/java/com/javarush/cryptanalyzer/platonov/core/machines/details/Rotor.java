package com.javarush.cryptanalyzer.platonov.core.machines.details;

import java.util.Arrays;
import java.util.HashMap;

public class Rotor
{
    private HashMap<Integer, Character> symbols;
    private int size;
    private char activeSymbol;

    public void setSymbols(Alphabet alphabet)
    {

    }
    public Rotor(Alphabet alphabet)
    {
        size = alphabet.getSize();
        symbols = Arrays.copyOf(alphabet.getAlphabet(), size);
        setOnPosition(0);
    }

    public char getActiveSymbol()
    {
        return activeSymbol;
    }
    public void setOnPosition(int shift)
    {
        activeSymbol = symbols[shift % size];
    }
}
