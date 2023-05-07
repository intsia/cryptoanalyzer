package com.javarush.cryptanalyzer.platonov.application.console;

import java.io.Console;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ConsoleStoryTeller
{
    ResourceBundle text;
    Locale locale;
    Scanner console;

    public ConsoleStoryTeller(Locale locale)
    {
        this.locale = locale;
        text = ResourceBundle.getBundle("consolestoryteller", locale);
        console = new Scanner(System.in);
    }

    public void ai(String string)
    {
        SetConsoleColor.purple();
        System.out.printf("%s%s%n", text.getString("ai"), string);
    }

    public void creator(String string)
    {
        SetConsoleColor.purple();
        System.out.printf("%s %10s%n", text.getString("creator"), string);
    }

    public void pressEnterToContinue()
    {
        SetConsoleColor.white();
        System.out.printf("%s", text.getString("pressEnterToContinue"));
        console.nextLine();

        System.out.println("\033[1А");


    }
}
