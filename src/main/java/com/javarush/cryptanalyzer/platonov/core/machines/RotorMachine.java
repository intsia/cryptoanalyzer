package com.javarush.cryptanalyzer.platonov.core.machines;

import com.javarush.cryptanalyzer.platonov.core.machines.details.Alphabet;
import com.javarush.cryptanalyzer.platonov.core.machines.details.Key;

import java.util.Arrays;

public abstract class RotorMachine implements Encryption
{
    Key key;
    Alphabet alphabet;
    String text; //TODO пока что так, как доберусь до потоков ввода данных может есть смысл зашить в класс со своими методами
}
