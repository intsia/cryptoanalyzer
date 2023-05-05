package com.javarush.cryptanalyzer.platonov.constants.UIConstants;

import com.javarush.cryptanalyzer.platonov.languages.SupportingLanguages;

public class helloPageConstants
{
    public String Hello (SupportingLanguages language)
    {
        switch (language)
        {
            case EN ->
            {
                return "Hello";
            }
            case RU ->
            {
                return "Привет";
            }
            default ->
            {
                return "input exception"; //тут надо бы наверное просто эксепшен кидать, я хз
            }
        }
    }
}
