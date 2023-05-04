package com.javarush.cryptanalyzer.platonov;

public abstract class EncryptionRotorMachine implements Encryption
{
    char[] alphabet;
    char[][] rotors;
    int[] keys;


    String text;

    protected void setKeys(int key)
    {
        keys = new int[]{key};
    }

    protected void setKeys(String keyword)
    {
        keys = Support.generateKeysFromKeyword(keyword, alphabet);
    }

    protected void setAlphabet(char[] alphabet)
    {
        this.alphabet = alphabet;
    }

    protected void setText(String text)
    {
        this.text = text;
    }

    @Override
    public String Encrypt()
    {
        // Заполнить все линии ротора. Для этого нужна функция заполнить одну линию, затем обернуть ее в цикл
        // Создаем новый массив чаров, туда присваиваем строку текста через .toCharArray()

        //вариант 1
        // Берем символ текста, вычисляем индекс нужной линии ротора путем деления на размер ключа с остатком, находим индекс символа в алфавите и берем значение под этим индексом с найденного ротора


        //Вариант 2
        // Создаем новый массив интов, размером с длину текста. В него подгружаем ключи во всю длину
        // Берем символ из текста, сдвиг из массива ключей, ищем символ в алфавите, берем символ из алфавита с учетом сдвига

        return new String();
    }

    @Override
    public String Decrypt()
    {
        // Просто запустить алгоритм шифрования с отрицательеыми значениями ключей
        return new String();
    }

}
