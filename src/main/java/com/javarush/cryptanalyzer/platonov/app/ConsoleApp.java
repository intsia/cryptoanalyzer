package com.javarush.cryptanalyzer.platonov.app;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Alphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;
import com.javarush.cryptanalyzer.platonov.core.machines.devices.Caesar;
import com.javarush.cryptanalyzer.platonov.core.machines.devices.Vigenere;


import static com.javarush.cryptanalyzer.platonov.constants.alphabets.alphabetRUlowerCase;

public class ConsoleApp
{
    public static void Launch()
    {
        Alphabet alphabet = new Alphabet(alphabetRUlowerCase);
        Key key = new Key("поздравляю, ты сделал это");
        String text = "съешь же ещё этих мягких французских булок да выпей чаю";
        Vigenere caesar = new Vigenere(alphabet, key, text);
        System.out.println("Результат шифрования:");
        String result = caesar.Encrypt();
        System.out.println(result);
        Vigenere caesar1 = new Vigenere(alphabet, key, result);
        System.out.println("Результат дешифрования:");
        System.out.println(caesar1.Decrypt());
    }
}
