package com.javarush.cryptanalyzer.platonov.app;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Alphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;
import com.javarush.cryptanalyzer.platonov.core.machines.devices.Caesar;


import static com.javarush.cryptanalyzer.platonov.constants.alphabets.alphabetRUlowerCase;

public class ConsoleApp
{
    public static void Launch()
    {
        Alphabet alphabet = new Alphabet(alphabetRUlowerCase);
        Key key = new Key(260694);
        String text = "съешь же ещё этих мягких французских булок да выпей чаю";
        Caesar caesar = new Caesar(alphabet, key, text);
        System.out.println("Результат шифрования:");
        String result = caesar.Encrypt();
        System.out.println(result);
        Caesar caesar1 = new Caesar(alphabet, key, result);
        System.out.println("Результат дешифрования:");
        System.out.println(caesar1.Decrypt());
    }
}
