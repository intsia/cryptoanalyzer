package com.javarush.cryptanalyzer.platonov;

public class Vigenere extends EncryptionRotorMachine
{
    public Vigenere(String text, String key, char[] alphabet)
    {
        setAlphabet(alphabet);
        setKeys(key);
        setText(text);
    }
}
