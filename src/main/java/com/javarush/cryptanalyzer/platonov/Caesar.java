package com.javarush.cryptanalyzer.platonov;


public class Caesar extends EncryptionRotorMachine
{
    public Caesar(String text, int key, char[] alphabet)
    {
        setAlphabet(alphabet);
        setKeys(key);
        setText(text);
    }

}
