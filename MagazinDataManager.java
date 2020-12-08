package com.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagazinDataManager {
    static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d-MMM-yyyy");
    static List<Magazin> magazin = new ArrayList<Magazin>();

    //6. Sortare: afișați produsele
    //1. După nume - în ordine alfabetică
    //2. După data de expirare - în ordine inversă (produsele cu cea mai apropiata dată de expirare merg primele)
    //3. După preț în ordine crescătoare.
    //4. După preț în ordine descrescătoare.


    public static void addProducts()
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0, x = 1; i < x; i++, x++) {
            System.out.println("Enter product[" + magazin.size() + "]");
            System.out.println("Enter product name :");
            String name = scanner.next();
            System.out.println("Enter product buying price :");
            float bPrice = scanner.nextFloat();
            System.out.println("Enter product selling price :");
            float sPrice = scanner.nextFloat();
            System.out.println("Enter expiration date (00-Month-0000) :");
            LocalDate expirationDate = LocalDate.parse(scanner.next(), dateFormat);
            scanner.next();
            System.out.println("Enter product description :");
            String description = scanner.nextLine();
            System.out.println("Enter product stock size :");
            int stoc = scanner.nextInt();
            Magazin magazin1 = new Magazin(name, bPrice, sPrice, expirationDate, description, stoc);
            magazin.add(magazin1);
            System.out.println("continue adding products?(True/False)");
            boolean y = scanner.nextBoolean();
            if (y == false) {
                break;
            } else {
                continue;
            }
        }
    }

    public static void displaystoc() {
        for (int i = 0; i < magazin.size(); i++) {
            System.out.println("Displaying product[" + i + "]");
            String name;
            float bPrice;
            float sPrice;
            LocalDate expirationDate;
            String description;
            int stoc;
            name = magazin.get(i).getNume();
            bPrice = magazin.get(i).getPretC();
            sPrice = magazin.get(i).getPretV();
            expirationDate = magazin.get(i).getData();
            description = magazin.get(i).getDescrierea();
            stoc = magazin.get(i).getStoc();
            System.out.println("Name :"+name);
            System.out.println("Buying price :"+bPrice);
            System.out.println("Selling price :"+sPrice);
            System.out.println("Expiration-date :"+expirationDate);
            System.out.println("Description :"+description);
            System.out.println("Stock size :"+stoc);
        }
    }

    public static void displayprofit() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What product's profit do you want to see :");
            int i = scanner.nextInt();
            System.out.println("Displaying product[" + i + "]");
            String name;
            float bPrice;
            float sPrice;
            LocalDate expirationDate;
            String description;
            int stoc;
            float profit = 0.00f;
            name = magazin.get(i).getNume();
            bPrice = magazin.get(i).getPretC();
            sPrice = magazin.get(i).getPretV();
            expirationDate = magazin.get(i).getData();
            description = magazin.get(i).getDescrierea();
            stoc = magazin.get(i).getStoc();
            profit = magazin.get(i).getProfit();
            System.out.println("Name :"+name);
            System.out.println("Buying price :"+bPrice);
            System.out.println("Selling price :"+sPrice);
            System.out.println("Expiration-date :"+expirationDate);
            System.out.println("Description :"+description);
            System.out.println("Stock size :"+stoc);
            System.out.println("Profit :"+ profit);
    }

    public static void displayTotalProfit(){
        for (int i = 0; i < magazin.size(); i++) {
            float p =+ magazin.get(i).getProfit();
            if(i == magazin.size()) {
                System.out.println("Total profit : " + p);
            }
        }
    }

    public static void buystoc() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buying product...");
        System.out.println("Enter product position :");
        int n = scanner.nextInt();
        System.out.println("Enter the amount you want to purchase :");
        int nn = scanner.nextInt();
        magazin.get(n).setProfit((magazin.get(n).getPretV()-magazin.get(n).getPretC())*nn);

        if(magazin.get(n).getStoc()>=nn) {
            magazin.get(n).setStoc(magazin.get(n).getStoc() - nn);
            System.out.println("Product purchased successfully!");
        }else{
            System.out.println("not enough products in stock, choose a lesser amount");
        }

    }
}

