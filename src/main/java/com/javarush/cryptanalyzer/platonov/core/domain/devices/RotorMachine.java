package com.javarush.cryptanalyzer.platonov.core.domain.devices;

import com.javarush.cryptanalyzer.platonov.core.domain.devices.interfaces.IEncryptionMachine;
import com.javarush.cryptanalyzer.platonov.core.domain.details.Rotors;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

public abstract class RotorMachine implements IEncryptionMachine
{
    protected EncryptionKey key;
    protected EncryptionAlphabet alphabet;
    protected Rotors rotors;
    protected EncryptionText text; //TODO пока что так, как доберусь до потоков ввода данных может есть смысл зашить в класс со своими методами

    public RotorMachine(EncryptionAlphabet alphabet, EncryptionKey key, EncryptionText text)
    {
        this.alphabet = alphabet;
        this.key = key;
        this.text = text;
        rotors = new Rotors(alphabet);
        rotors.setOnStartPosition();
    }
}
