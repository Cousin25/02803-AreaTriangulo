/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        try {
            System.out.printf("Introduce la base......: ");
            base = SCN.nextDouble();
            SCN.nextLine();
            System.out.printf("Introduce la altura....: ");
            altura = SCN.nextDouble();
            SCN.nextLine();

            area = base * altura / 2;

            System.out.printf("Área triángulo.........: %.2f %n", area);

        } catch (Exception e) {
            System.out.println("OIIII!");

        }

    }

}
