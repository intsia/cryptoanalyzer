package com.javarush.cryptanalyzer.platonov.core.machines.devices;

import com.javarush.cryptanalyzer.platonov.core.machines.SimpleRotorMachine;

public class Vigenere extends SimpleRotorMachine
{
    public Vigenere(String text, String key, char[] alphabet)
    {
        setAlphabet(alphabet);
        setKeys(key);
        setText(text);
    }

}
