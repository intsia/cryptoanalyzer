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
    public void setOnPosition(int shift)
    {
        setOnStartPosition();
        for (int i = 0; i < size; i++)
        {
            rotors[i].setOnPosition((rotors[i].getActiveSymbolIndex() + shift) % size);
        }
    }

    public void setOnStartPosition()
    {
        for (int i = 0; i < size; i++)
        {
            rotors[i].setOnPosition(i);
        }
    }

    public char getActiveValueFromIndex(int index)
    {
        return rotors[index].getActiveSymbolValue();
    }

    public void printActiveLineValue()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(getActiveValueFromIndex(i));
        }
        System.out.println();
    }
}
