package com.javarush.cryptanalyzer.platonov.core.usecases.input;

import com.javarush.cryptanalyzer.platonov.core.constants.EncryptionMachineTypes;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.Caesar;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.Vigenere;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

public class EncryptionMachineCreator
{
    EncryptionAlphabet encryptionAlphabet;
    EncryptionKey encryptionKey;

    EncryptionText encryptionText;

    public EncryptionMachineCreator(EncryptionAlphabet encryptionAlphabet, EncryptionKey encryptionKey, EncryptionText encryptionText)
    {
        this.encryptionAlphabet = encryptionAlphabet;
        this.encryptionKey = encryptionKey;
        this.encryptionText = encryptionText;

    }

    public IEncryptionMachine createEncryptionMachine(EncryptionMachineTypes type)
    {

        switch (type)
        {
            case caesar ->
            {
                return new Caesar(encryptionAlphabet, encryptionKey, encryptionText);
            }
            case vigenere ->
            {
                return new Vigenere(encryptionAlphabet, encryptionKey, encryptionText);
            }
            default ->
            {
                //TODO как-то обрабатывать надо если ввели не то
                return null;
            }
        }
    }
}
