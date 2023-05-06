package com.javarush.cryptanalyzer.platonov.main;

import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;
import com.javarush.cryptanalyzer.platonov.core.usecases.input.TextFileUploader;

public class ConsoleApp
{
    public static void Launch()
    {
////        Scanner console = new Scanner(System.in);
//        EncryptionAlphabet encryptionAlphabet = new EncryptionAlphabet(alphabets.alphabetEnLowerCase);
//
////        System.out.println("Введите ключ число");
//        EncryptionKey key = new EncryptionKey("nikita");
//
////        System.out.println("Введите текст");
//        EncryptionText text = new EncryptionText("nikita");
//
////        Caesar caesar = new Caesar(encryptionAlphabet, key, text);
//        Vigenere vigenere = new Vigenere(encryptionAlphabet, key, text);
//
//        System.out.println("Запускаю машину Виженера");
//
//
////        String result = caesar.Decrypt();
//        String result = vigenere.Encrypt();
//
//
//        System.out.println("Результат шифрования:");
//        System.out.println(result);

        TextFileUploader file = new TextFileUploader("C:\\Program\\text.txt");
        EncryptionText text = file.uploadTextFile();
        System.out.println(text.getText());


    }
}
