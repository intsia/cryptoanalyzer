package com.javarush.cryptanalyzer.platonov;

public class Support
{
    public static boolean IsNumber(String s)
    {
        for(char c : s.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static void SetArrayOfRotor(int indexOfRotor, char[][] rotors, char[] alphabet, int shiftSize)
    {
        for (int i = 0; i < alphabet.length; i++)
        {
            rotors[indexOfRotor][i] = alphabet[(i+shiftSize) % alphabet.length];
        }
    }

    public static int IndexOfSymbol(char[] alphabet, char symbol)
    {
        return alphabet.toString().indexOf(symbol);

//        for (int i = 0; i < alphabet.length; i++)
//        {
//            if(alphabet[i] == symbol)
//            {
//                return i;
//            }
//        }
//        return -1;
    }

    public static int[] generateKeysFromKeyword(String keyword, char[] alphabet)
    {
        int[] result = new int[keyword.length()];
        char[] keySymbols = keyword.toCharArray();

        for (int i = 0; i < result.length; i++)
        {
            result[i] = IndexOfSymbol(alphabet, keySymbols[i]);
        }

        return result;
    }
}
