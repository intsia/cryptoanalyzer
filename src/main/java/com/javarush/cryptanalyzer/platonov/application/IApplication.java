package com.javarush.cryptanalyzer.platonov.application;

import com.javarush.cryptanalyzer.platonov.core.constants.EncryptionMachineTypes;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

public interface IApplication
{
    public IEncryptionMachine createEncryptionMachine(EncryptionMachineTypes type);
    public EncryptionAlphabet setEncryptionAlphabet();
    public EncryptionKey setEncryptionKey();
    public EncryptionText setEncryptionText();
    public EncryptionAlphabet createEncryptionAlphabet();
    public EncryptionText uploadEncryptionText();
    public String Encryption();
    public String Decryption();
    public void saveResult();
}
