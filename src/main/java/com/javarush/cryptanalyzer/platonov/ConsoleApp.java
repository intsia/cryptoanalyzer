package com.javarush.cryptanalyzer.platonov;

public class ConsoleApp
{
    public static void Launch()
    {
        String inputData = "Можно еще";
        int key = 22;
        String keyword = "да";

        Caesar caesar = new Caesar(inputData, key, Alphabet.alphabetRUlowerCase);
        String resultCaesar = caesar.Encrypt();

        Vigenere vigenere = new Vigenere(inputData, keyword, Alphabet.alphabetRUlowerCase);
        String resultVigenere = vigenere.Encrypt();
    }
}
