package com.javarush.cryptanalyzer.platonov.core.usecases.launcher;

import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;

public class EncryptionMachineLauncher
{
    public String Encrypt(IEncryptionMachine encryptionMachine)
    {
        return encryptionMachine.Encrypt();
    }

    public String Decrypt(IEncryptionMachine encryptionMachine)
    {
        return encryptionMachine.Decrypt();
    }
}
