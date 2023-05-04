package com.javarush.cryptanalyzer.platonov.core.machines;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Alphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;

import java.util.Arrays;

public abstract class RotorMachine implements Encryption
{
    Key key;
    Alphabet alphabet;
    String text; //TODO пока что так, как доберусь до потоков ввода данных может есть смысл зашить в класс со своими методами

    protected abstract class MatrixRotor //тут короч будет вал с матрицей сдвигов
    {
        static char[] workLine;
        static char[][] rotors;

        protected MatrixRotor(char[] alphabet) // тут заполняем матрицу и иницализируем workline на 0 индекс
        {
            size = alphabet.length;;
            rotors = new char[size][size];
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    // подумать как копировать со сдвигом
                }
            }
            rotate(0);
        }
        protected static void rotate(int i)
        {
            workLine = Arrays.copyOf(rotors[i], size);
        }
    }



    protected void setKeys(int key)
    {
        keys = new int[]{key};
    }

    protected void setKeys(String keyword)
    {
        keys = generateKeysFromKeyword(keyword, alphabet);
    }

    protected void setAlphabet(char[] alphabet)
    {
        this.alphabet = alphabet;
    }

    protected void setText(String text)
    {
        this.text = text;
    }



}
