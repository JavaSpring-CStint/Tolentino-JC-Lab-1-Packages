package LabPackages.main;

import LabPackages.packageone.ClassOne;
import LabPackages.packagetwo.ClassTwo;
import LabPackages.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        ClassTwo c2 = new ClassTwo();
        ClassThree c3 = new ClassThree();

        c1.greet();
        c2.greet();
        c3.greet();
    }
}