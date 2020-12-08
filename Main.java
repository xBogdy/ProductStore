package com.company;

import java.text.ParseException;

import static com.company.MagazinDataManager.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        //CE VA FI EVALUAT IN PRIMUL RAND:
        //1. Respectarea principiilor OOP și separarea responsabilităților pe clasele necesare.
        //2. Prezența metodelor necesare pentru a efectua operațiile descrise mai sus (chiar daca metoda nu este chemata sau nu este implementata logica de executie, va fi analizata solutia descrisa in metoda).
        //
        //FUNCȚIONALITĂȚI OPȚIONALE:
        //Afisarea meniului si introducerea datelor de la tastatură nu sunt obligatorii - prezentați funcționalitatea aplicației in mod manual într-o clasă principală Main.
        //
        //
        //
        //IMPORTANT: Sarcina trebuie incarcata intr-un repozitoriu Github (ProductStore) pana la ora 21:00.

        addProducts();
        displaystoc();
        buystoc();
        displaystoc();
        displayprofit();
        displayTotalProfit();
    }
}
