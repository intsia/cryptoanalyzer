package com.javarush.cryptanalyzer.platonov.core.usecases.showmewhatyoudo;

import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;

public class ShowMeWhatYouDo
{
    IEncryptionMachine encryptionMachine;

    public ShowMeWhatYouDo(IEncryptionMachine encryptionMachine)
    {
        this.encryptionMachine = encryptionMachine;
    }

    public String Encrypt()
    {
       return encryptionMachine.EncryptWithComments();
    }

    public String Decrypt()
    {
        return encryptionMachine.DecryptWithComments();
    }
}
