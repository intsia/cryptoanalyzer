package com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces;

public interface IEncryptionMachine
{
    public String Encrypt ();
    public String Decrypt();

    public String EncryptWithComments();
    public String DecryptWithComments();

}
