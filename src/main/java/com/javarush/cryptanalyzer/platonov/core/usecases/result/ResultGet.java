package com.javarush.cryptanalyzer.platonov.core.usecases.result;

import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;

public class ResultGet
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
