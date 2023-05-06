package com.javarush.cryptanalyzer.platonov.core.domain.devices;


import com.javarush.cryptanalyzer.platonov.core.domain.alphabetbuilder.constans.AlphabetsCollection;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

import java.util.Locale;
import java.util.ResourceBundle;

public class Vigenere extends RotorMachine
{
    private ResourceBundle comments = ResourceBundle.getBundle("comments", locale);
    public Vigenere(EncryptionAlphabet alphabet, EncryptionKey key, EncryptionText text, Locale locale)
    {
        super(alphabet, key, text, locale);
    }

    private String encryptionAlgorithm(boolean mode)
    {
        System.out.println(comments.getString("hello"));
        System.out.println();
        System.out.println("Начинаю работу:");
        System.out.println();
        System.out.println("Ключом выступает слово" + key.getKeyword());
        System.out.println();
        key.generateKeysFromKeyword(alphabet);
        int [] keys = key.getKeys(mode);
        int steps = keys.length;
        System.out.println();
        System.out.println("В соответствии с длинной последовательности ключей, закрепляю " + steps + "рабочих положений ротора");
        char[] buffer = text.getText().toCharArray();
        System.out.println("Загружаю в работу текст " + text.getText());
        System.out.println("Запускаю последовательность шифрования");

        int step = 0;
        while (step < buffer.length)
        {
            for (int j = 0; j < steps && step < buffer.length; j++)
            {
                System.out.println();
                System.out.println("Беру в работу символ # " + step + " = " + buffer[step]);
                rotors.setOnPosition(keys[j]);
                System.out.println("Базовая последовательность символов:");
                AlphabetsCollection.printIndexValueBlockLine(alphabet.getAlphabet());
                System.out.println("Высталяю ротор в рабочее положение под индексом " + keys[j] + " ");
                rotors.printActiveLineValue();
                System.out.println("Заменяю символ " + buffer[step] + " на символ " + rotors.getActiveValueFromIndex(alphabet.getIndexOfChar(buffer[step])));
                buffer[step] = rotors.getActiveValueFromIndex(alphabet.getIndexOfChar(buffer[step]));
                step++;
            }
        }

        String result = new String(buffer);
        return result;
    }
    @Override
    public String Encrypt()
    {
        return encryptionAlgorithm(true);
    }

    @Override
    public String Decrypt()
    {
        return encryptionAlgorithm(false);
    }

}
