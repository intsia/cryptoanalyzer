package com.javarush.cryptanalyzer.platonov.core.machines.details;

import java.util.Arrays;
import java.util.HashMap;

public class Rotor
{
    private final HashMap<Integer, Character> symbols;
    private final int rotorSize;
    private int activeSymbol;

    public Rotor(Alphabet alphabet)
    {
        rotorSize = alphabet.getSize();
        symbols = alphabet.getAlphabet();
        setOnPosition(0);
    }

    public char getActiveSymbolValue()
    {
        return symbols.get(activeSymbol);
    }
    public int getActiveSymbolIndex()
    {
        return activeSymbol;
    }
    public void setOnPosition(int shift)
    {
        activeSymbol = (shift + rotorSize) % rotorSize;
    }

    public void setOnStartPosition()
    {
        setOnPosition(0);
    }
}
