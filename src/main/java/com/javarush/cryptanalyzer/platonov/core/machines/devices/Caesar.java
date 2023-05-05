package com.javarush.cryptanalyzer.platonov.core.machines.devices;


import com.javarush.cryptanalyzer.platonov.core.machines.RotorMachine;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Cryptoalphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;

public class Caesar extends RotorMachine
{

    public Caesar(Cryptoalphabet alphabet, Key key, String text)
    {
        super(alphabet, key, text);                                        // TODO почитать что значит эта фигня, спасибо IDE за помощь конечно, но я нихрена не понял
    }

    private String encryptionAlgorithm(boolean mode)
    {
        rotors.setOnPosition(key.getKey(mode));
        char[] buffer = text.toCharArray();
        for (int i = 0; i < buffer.length; i++)
        {
            buffer[i] = rotors.getActiveValueFromIndex(alphabet.getIndexOfChar(buffer[i]));
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
