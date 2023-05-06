package com.javarush.cryptanalyzer.platonov.application;

import com.javarush.cryptanalyzer.platonov.core.constants.EncryptionMachineTypes;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;
import com.javarush.cryptanalyzer.platonov.core.usecases.input.CreateCustomEncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.usecases.input.EncryptionMachineCreator;
import com.javarush.cryptanalyzer.platonov.core.usecases.input.TextFileUploader;
import com.javarush.cryptanalyzer.platonov.core.usecases.result.ResultGet;

public class ApplicationController implements IApplication
{
    private IEncryptionMachine encryptionMachine;
    private EncryptionAlphabet encryptionAlphabet;
    private EncryptionKey encryptionKey;
    private EncryptionText encryptionText;
    private String result;

    public ApplicationController() {}

    @Override
    public IEncryptionMachine createEncryptionMachine(EncryptionMachineTypes type)
    {
        EncryptionMachineCreator creator = new EncryptionMachineCreator(encryptionAlphabet, encryptionKey, encryptionText);
        return creator.createEncryptionMachine(type);
    }

    @Override
    public EncryptionAlphabet setEncryptionAlphabet()
    {
        return null;
    }

    @Override
    public EncryptionKey setEncryptionKey()
    {
        return null;
    }

    @Override
    public EncryptionText setEncryptionText()
    {
        return null;
    }

    @Override
    public EncryptionAlphabet createEncryptionAlphabet()
    {
        CreateCustomEncryptionAlphabet createCustomEncryptionAlphabet = new CreateCustomEncryptionAlphabet();
        return createCustomEncryptionAlphabet.createCustomEncryptionAlphabet();
    }

    @Override
    public EncryptionText uploadEncryptionText(String path)
    {
        TextFileUploader uploader = new TextFileUploader(path);
        return uploader.uploadTextFile();
    }

    @Override
    public String Encryption()
    {
        ResultGet encryption = new ResultGet();
        return encryption.Encrypt(encryptionMachine);
    }

    @Override
    public String Decryption()
    {
        ResultGet decryption = new ResultGet();
        return decryption.Decrypt(encryptionMachine);
    }

    @Override
    public void saveResult()
    {

    }
}
