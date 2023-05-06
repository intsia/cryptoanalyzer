package com.javarush.cryptanalyzer.platonov.main;

import com.javarush.cryptanalyzer.platonov.core.constants.alphabets;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.Caesar;
import com.javarush.cryptanalyzer.platonov.core.domain.devices.Vigenere;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;
import org.w3c.dom.ls.LSOutput;

import java.security.Key;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleApp
{
    public static void Launch()
    {
//        Scanner console = new Scanner(System.in);
        EncryptionAlphabet encryptionAlphabet = new EncryptionAlphabet(alphabets.alphabetEnLowerCase);

//        System.out.println("Введите ключ число");
        EncryptionKey key = new EncryptionKey("nikita");

//        System.out.println("Введите текст");
        EncryptionText text = new EncryptionText("nikita");

//        Caesar caesar = new Caesar(encryptionAlphabet, key, text);
        Vigenere vigenere = new Vigenere(encryptionAlphabet, key, text);

        System.out.println("Запускаю машину Виженера");


//        String result = caesar.Decrypt();
        String result = vigenere.Encrypt();


        System.out.println("Результат шифрования:");
        System.out.println(result);

    }
}
