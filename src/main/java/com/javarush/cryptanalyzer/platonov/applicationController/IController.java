package com.javarush.cryptanalyzer.platonov.applicationController;

import com.javarush.cryptanalyzer.platonov.languages.SupportingLanguages;

public interface IController
{
    public void Exit();
    public void Help();
    public void setLanguage(SupportingLanguages language);

    public void launchCryptoalphabetConstructor();
    public void launchCaesarApplication();
    public void launchVigenereApplication();
}
