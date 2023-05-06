package com.javarush.cryptanalyzer.platonov.core.domain.devices;


import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

import java.util.Locale;

public class Caesar extends RotorMachine
{

    public Caesar(EncryptionAlphabet alphabet, EncryptionKey key, EncryptionText text, Locale locale)
    {
        super(alphabet, key, text, locale);
    }

    private String encryptionAlgorithm(boolean mode)
    {
        rotors.setOnPosition(key.getKey(mode));
        char[] buffer = text.getText().toCharArray();
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
}
