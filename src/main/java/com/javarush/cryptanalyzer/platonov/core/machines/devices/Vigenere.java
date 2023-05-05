package com.javarush.cryptanalyzer.platonov.core.machines.devices;


import com.javarush.cryptanalyzer.platonov.core.machines.RotorMachine;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Cryptoalphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;

public class Vigenere extends RotorMachine
{
    public Vigenere(Cryptoalphabet alphabet, Key key, String text)
    {
        super(alphabet, key, text);
    }

    private String encryptionAlgorithm(boolean mode)
    {
        key.generateKeysFromKeyword(alphabet);
        int [] keys = key.getKeys(mode);
        int steps = keys.length;
        char[] buffer = text.toCharArray();
        for (int i = 0; i < buffer.length; i++)
        {
            for (int j = 0; j < steps; j++)
            {
                rotors.setOnPosition(keys[j]);
                buffer[i] = rotors.getActiveValueFromIndex(alphabet.getIndexOfChar(buffer[i]));
            }
        }
        String result = new String(buffer);
        return result;
    }
    @Override
    public String Encrypt()
    {
        return encryptionAlgorithm(true);
    }

    @Override
    public String Decrypt()
    {
        return encryptionAlgorithm(false);
    }
    public String getText()
    {
        return text;
    }

}
