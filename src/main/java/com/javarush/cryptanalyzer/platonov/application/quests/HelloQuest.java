package com.javarush.cryptanalyzer.platonov.application.quests;

import java.io.IOException;
import java.util.Locale;

public class HelloQuest extends Quest
{
    public HelloQuest(String resourceBundle, Locale locale)
    {
        super(resourceBundle, locale);
    }

    public void launch()

    {
        storyTeller.ai(text.getString("hello"));







        storyTeller.pressEnterToContinue();
        storyTeller.ai(text.getString("robotLaws"));
        storyTeller.pressEnterToContinue();
        storyTeller.ai(text.getString("robotZeroLaw"));
    }
}
