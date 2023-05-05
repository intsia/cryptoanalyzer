package com.javarush.cryptanalyzer.platonov.applicationController;

import com.javarush.cryptanalyzer.platonov.languages.SupportingLanguages;

import java.util.Scanner;

public class mainController implements IController
{
    public static Scanner console = new Scanner(System.in); //TODO тут должен быть какой-то универсальный поток ввода, чтобы мог принимать данные, как из консоли, так и с GUI
    public static SupportingLanguages language;

    @Override
    public void Exit()
    {

    }

    @Override
    public void Help()
    {

    }

    @Override
    public void setLanguage(SupportingLanguages language)
    {
        this.language = language;
    }

    @Override
    public void launchCryptoalphabetConstructor()
    {

    }

    @Override
    public void launchCaesarApplication()
    {

    }

    @Override
    public void launchVigenereApplication()
    {

    }
}
