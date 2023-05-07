package com.javarush.cryptanalyzer.platonov.application;


import com.javarush.cryptanalyzer.platonov.adaptors.ApplicationController;
import com.javarush.cryptanalyzer.platonov.application.constants.ResourseBundleNames;
import com.javarush.cryptanalyzer.platonov.application.quests.HelloQuest;
import com.javarush.cryptanalyzer.platonov.ports.IApplication;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleApp
{
    public static void Launch()
    {
        IApplication controller = new ApplicationController();
//        ResourceBundle speech = ResourceBundle.getBundle("consoleapp");
        Scanner console = new Scanner(System.in);
        Locale locale = new Locale("ru", "RU");

//        System.out.println(speech.getString("selectLanguage"));
//        controller.setLanguage();
//        System.out.println(speech.getString("hello"));

//        String[] answers = {"Как дела?", "Пока", "Сколько времени?"};
//
//
//        switch (ConsoleValidator.getStringFromUser(answers, console))
//        {
//            case "Как дела?" ->
//            {
//                System.out.println("Я программа, мне в целом все ок");
//            }
//            case "Пока" ->
//            {
//                System.out.println("Проваливай мешок мяса");
//            }
//            case "Сколько времени?" ->
//            {
//                System.out.println("Не скажу, сам посмотри");
//            }
//            default ->
//            {
//                System.out.println("я вас не понимаю");
//            }
//
//        }
//        controller.uploadEncryptionKey("C:\\Program\\text.txt");
//        controller.uploadEncryptionText("C:\\Program\\key.txt");
//        controller.setEncryptionAlphabet(AlphabetsCollection.alphabetEnUpperCase);
//
//
//        controller.createEncryptionMachine(EncryptionMachineTypes.valueOf("vigenere"));
//        controller.Encryption();
//    }
//
//
//
//        return inputData;

        HelloQuest helloQuest = new HelloQuest(ResourseBundleNames.HELLO_QUEST, locale);
        helloQuest.launch();
    }
}
