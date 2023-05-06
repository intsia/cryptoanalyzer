package com.javarush.cryptanalyzer.platonov.application;


import com.javarush.cryptanalyzer.platonov.adaptors.ApplicationController;
import com.javarush.cryptanalyzer.platonov.core.domain.alphabetbuilder.constans.AlphabetsCollection;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionKey;
import com.javarush.cryptanalyzer.platonov.core.domain.variables.EncryptionText;
import com.javarush.cryptanalyzer.platonov.core.usecases.launcher.constants.EncryptionMachineTypes;
import com.javarush.cryptanalyzer.platonov.ports.IApplication;

import java.nio.file.Path;

public class ConsoleApp
{
    public static void Launch()
    {

        IApplication controller = new ApplicationController();

        controller.uploadEncryptionKey("C:\\Program\\text.txt");
        controller.uploadEncryptionText("C:\\Program\\key.txt");
        controller.setEncryptionAlphabet(AlphabetsCollection.alphabetEnUpperCase);


        controller.createEncryptionMachine(EncryptionMachineTypes.valueOf("vigenere"));
        controller.Encryption();
    }
}
