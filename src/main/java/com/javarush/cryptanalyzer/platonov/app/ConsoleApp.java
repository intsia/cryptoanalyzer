package com.javarush.cryptanalyzer.platonov.app;

import com.javarush.cryptanalyzer.platonov.constants.alphabets;
import com.javarush.cryptanalyzer.platonov.core.machines.devices.Caesar;
import com.javarush.cryptanalyzer.platonov.core.machines.devices.Vigenere;

public class ConsoleApp
{
    public static void Launch()
    {
        String inputData = "Можно еще";
        int key = 22;
        String keyword = "да";

        Caesar caesar = new Caesar(inputData, key, alphabets.alphabetRUlowerCase);
        String resultCaesar = caesar.Encrypt();

        Vigenere vigenere = new Vigenere(inputData, keyword, alphabets.alphabetRUlowerCase);
        String resultVigenere = vigenere.Encrypt();
    }
}
