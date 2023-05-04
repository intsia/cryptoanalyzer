package com.javarush.cryptanalyzer.platonov.core.machines.details;

public class Rotors
{
    private Rotor[] rotors;
    private int size;

    private void setRotors(Alphabet alphabet)
    {
        rotors = new Rotor[alphabet.getSize()];
        for (int i = 0; i < alphabet.getSize(); i++)
        {
            rotors[i] = new Rotor(alphabet);
        }
    }

    private void setSize(Alphabet alphabet)
    {
        size = alphabet.getSize();
    }

    public Rotors(Alphabet alphabet)
    {
        setSize(alphabet);
        setRotors(alphabet);
    }

    public void setOnStartPosition()
    {
        for (int i = 0; i < size; i++)
        {
            rotors[i].setOnPosition(i);
        }
    }

    public void setOnPosition(int shift)
    {
        for (int i = 0; i < size; i++)
        {
            rotors[i].setOnPosition();
        }
    }
}
