package com.javarush.cryptanalyzer.platonov.core.machines.devices;


import com.javarush.cryptanalyzer.platonov.core.machines.SimpleRotorMachine;

public class Caesar extends SimpleRotorMachine
{
    public Caesar(String text, int key, char[] alphabet)
    {
        setAlphabet(alphabet);
        setKeys(key);
        setText(text);
    }

}
