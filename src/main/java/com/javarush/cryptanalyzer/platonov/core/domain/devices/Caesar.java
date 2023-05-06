package com.javarush.cryptanalyzer.platonov.core.domain.devices;


import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

public class Caesar extends RotorMachine
{

    public Caesar(EncryptionAlphabet alphabet, EncryptionKey key, EncryptionText text)
    {
        super(alphabet, key, text);                                        // TODO почитать что значит эта фигня, спасибо IDE за помощь конечно, но я нихрена не понял
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

    @Override
    public String EncryptWithComments()
    {
        return null;
    }

    @Override
    public String DecryptWithComments()
    {
        return null;
    }

    public String getText()
    {
        return text.getText();
    }
}
