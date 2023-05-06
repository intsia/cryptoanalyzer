package com.javarush.cryptanalyzer.platonov.core.domain.devices;


import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionAlphabet;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;

public class Vigenere extends RotorMachine
{
    public Vigenere(EncryptionAlphabet alphabet, EncryptionKey key, EncryptionText text)
    {
        super(alphabet, key, text);
    }

    private String encryptionAlgorithm(boolean mode)
    {
        System.out.println("Начинаю работу:");
        System.out.println("Ключом выступает слово" + key.getKeyword());
        key.generateKeysFromKeyword(alphabet);
        int [] keys = key.getKeys(mode);
        int steps = keys.length;
        System.out.println("В соответствии с длинной последовательности ключей, закрепляю " + steps + "рабочих положений ротора");
        char[] buffer = text.getText().toCharArray();
        System.out.println("Загружаю в работу текст " + text);
        System.out.println("Запускаю последовательность шифрования");
        for (int i = 0; i < buffer.length;)
        {
            for (int j = 0; j < steps; j++)
            {
                System.out.println("Беру в работу символ # " + i + " = " + buffer[i]);
                rotors.setOnPosition(keys[j]);
                System.out.print("Высталяю ротор в рабочее положение под индексом " + keys[j] + " ");
                rotors.printActiveLineValue();
                System.out.println("Заменяю символ " + buffer[i] + " на символ " + rotors.getActiveValueFromIndex(alphabet.getIndexOfChar(buffer[i])));
                buffer[i] = rotors.getActiveValueFromIndex(alphabet.getIndexOfChar(buffer[i]));
                i++;
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

    @Override
    public String EncryptWithComments()
    {
        return null;
    }

    @Override
    public String DecryptWithComments()
    {
        return null;
    }

    public String getText()
    {
        return text.getText();
    }

}
