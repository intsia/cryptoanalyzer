package com.javarush.cryptanalyzer.platonov.applicationUI;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Cryptoalphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;
import com.javarush.cryptanalyzer.platonov.core.machines.devices.Vigenere;


import static com.javarush.cryptanalyzer.platonov.constants.applicationConstants.alphabets.alphabetRuLowerCase;

public class ConsoleApp
{
    public static void Launch()
    {
        Cryptoalphabet alphabet = new Cryptoalphabet(alphabetRuLowerCase);
        Key key = new Key("поздравляю, ты сделал это");
        String text = "съешь же ещё этих мягких французских булок да выпей чаю";
        Vigenere v = new Vigenere(alphabet, key, text);
        System.out.println("Результат шифрования:");
        String result = v.Encrypt();
        System.out.println(result);
        Vigenere v1 = new Vigenere(alphabet, key, result);
        System.out.println("Результат дешифрования:");
        System.out.println(v1.Decrypt());
    }
}
