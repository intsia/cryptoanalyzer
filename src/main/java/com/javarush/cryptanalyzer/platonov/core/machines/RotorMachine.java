package com.javarush.cryptanalyzer.platonov.core.machines;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Cryptoalphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Rotors;

public abstract class RotorMachine implements IEncryptionMachine
{
    protected Key key;
    protected Cryptoalphabet alphabet;
    protected Rotors rotors;
    protected String text; //TODO пока что так, как доберусь до потоков ввода данных может есть смысл зашить в класс со своими методами

    public RotorMachine(Cryptoalphabet alphabet, Key key, String text)
    {
        this.alphabet = alphabet;
        this.key = key;
        this.text = text;
        rotors = new Rotors(alphabet);
        rotors.setOnStartPosition();
    }
}
