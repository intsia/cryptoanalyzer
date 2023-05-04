package com.javarush.cryptanalyzer.platonov.core.machines.devices;


import com.javarush.cryptanalyzer.platonov.core.machines.RotorMachine;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Alphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;

public class Caesar extends RotorMachine
{

    public Caesar(Alphabet alphabet, Key key, String text)
    {
        super(alphabet, key, text);                                        // TODO почитать что значит эта фигня, спасибо IDE за помощь конечно, но я нихрена не понял
    }

    @Override
    public String Encrypt()
    {
        key.generateKeysFromKeyword();
        rotors.setOnPosition(key.);
    }

    @Override
    public String Decrypt()
    {
        return null;
    }
}
