package LabPackages.main;

import LabPackages.packageone.ClassOne;
import LabPackages.packagetwo.ClassTwo;
import LabPackages.packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args) {
        ClassOne c1 = new ClassOne();
        ClassTwo c2 = new ClassTwo();
        ClassThree c3 = new ClassThree();

        System.out.println(c1.greet());
        System.out.println(c2.greet());
        System.out.println(c3.greet());
    }
}