package com.model.day1.company;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Product productFiat = new Product("Fiat Fullback", 82000);
        Product productSkoda = new Product("Skoda Octavia", 45000);
        Product productAudi = new Product("Audi A4", 90000);
        Product productFord = new Product("Ford mustang", 20000);
        Product productFiatTipo = new Product("Fiat Tipo", 52000);
        Product productCatering = new Product("Catering for event", 1300);
        Product productOfficeRent = new Product("Office rent", 25000);
        Product productFuelGasoline = new Product("Fuel, gasoline 95", 5.13);
        Product productFuelON = new Product("Fuel, oil", 5.02);
        Product productScrew = new Product("Screw", 3.2);
        Product productHammer = new Product("Hammer", 15.99);
        Product productPowerbank = new Product("Power bank", 15.99);
        Product productPhoneSamsung = new Product("Samsung Phone", 999.0);
        Product productPhoneApple = new Product("Apple Phone", 1299.99);
        Product productLaptopDell = new Product("Laptop, Dell Latitude", 1399.0);
        Product productLaptopApple = new Product("Laptop, Apple MacBook Pro", 1799.0);
        Product productServerDellPrecision = new Product("Server, Server Dell Precision", 2490.0);
        Product productPC = new Product("PC, Asus", 790.0);
        Product productCase = new Product("Case", 500.0);
        Product productSwitch = new Product("Network Switch", 130.0);
        Product productCoffeA = new Product("Coffee, Arabica", 29.99);
        Product productCoffeR = new Product("Coffee, Robusta", 39.99);
        Product productMug = new Product("Mug", 5.00);
        Product productPen = new Product("Pen", 0.99);
        Product productPencil = new Product("Pencil", 0.50);
        Product productClip = new Product("Clip", 2.49);
        Product productPuncher = new Product("Puncher", 0.79);
        Product productPaper = new Product("Paper", 9.99);
        Product productScisors = new Product("Scisors", 0.99);
        Product productFlour = new Product("Flour", 1.39);
        Product productSugar = new Product("Sugar", 1.87);
        Product productChocolate = new Product("Chocolate", 1.99);

        Company companyFallen = new Company("Fallen", "Detroit", 320, new ArrayList<>(Arrays.asList(
                new Purchase(productFiat, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 4), 18.1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 23.9, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 18), 41.8, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 37.2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 7.3, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 29), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 2), 21.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 43.3, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 10), 13.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 25.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 38.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 111.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 59.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 230.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 26), 18.3, UNIT.UNIT),

                new Purchase(productCoffeA, LocalDate.of(2018, 2, 15), 10.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 20), 10.0, UNIT.UNIT)
        )));

        Company companyPetersWifesCookies = new Company("Peters wifes cookies", "London", 12, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 25, UNIT.KILOGRAM),

                new Purchase(productFlour, LocalDate.of(2018, 1, 7), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 14), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 21), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 21), 25, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 7), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 14), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 21), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 28), 7, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 15), 25, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 28), 25, UNIT.KILOGRAM)
        )));

        Company companyTheOffice = new Company("Dunder Mifflin", "Detroit", 17, new ArrayList<>(Arrays.asList(
                new Purchase(productPaper, LocalDate.of(2018, 1, 1), 20.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 4), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 5), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 6), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 7), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productScisors, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 11), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 12), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 14), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 18), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 19), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 13.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 1, 21), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 25), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 26), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 27), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 28), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 29), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 30), 20.0, UNIT.UNIT),

                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 4), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 5), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 6), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 7), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 10), 20.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 2, 11), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 12), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 13), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 14), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 18), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 19), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 20), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 21), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 25), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 26), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 27), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT)
        )));

        Company transporting = new Company("Take me home", "London", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productSkoda, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFiatTipo, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productAudi, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 330.32, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 5), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 7), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 325.13, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 29), 325.13, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 1), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 7), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 9), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 325.13, UNIT.UNIT)
        )));

        Company companyTonysHardware = new Company("Tony's hardware", "Detroit", 2, new ArrayList<>(Arrays.asList(
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productScrew, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productFord, LocalDate.of(2018, 2, 20), 2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 70.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 20.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 35.0, UNIT.UNIT)
        )));

        Company companyTailor = new Company("Tailor Swift", "New York City", 3, new ArrayList<>(Arrays.asList(
                new Purchase(productScisors, LocalDate.of(2018, 1, 1), 3, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 2, UNIT.KILOGRAM),

                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 13), 3, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 18), 3, UNIT.UNIT)
        )));

        Company companyGoogleDublin = new Company("Google", "Dublin", 91, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 91, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 91, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 3), 20, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 91, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 5, UNIT.UNIT)
        )));


        Company companyGoogleLondon = new Company("Google", "London", 76, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 20, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 76, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 76, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 4, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 4, UNIT.UNIT)
        )));


        Company companyGoogleKijev = new Company("Google", "Kijev", 23, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 23, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 30.0, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));


        Company companyFintech = new Company("Fintech", "London", 9, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 5), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));

        Company companyFintechNewYork = new Company("Fintech", "New York City", 19, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 7, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productPowerbank, LocalDate.of(2018, 1, 1), 10, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 15.0, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 10), 3, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 1, 15), 2, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT)
        )));

        Company bakeryDetroit = new Company("Detroit Bakery", "Detroit", 11, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 200, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 50, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 132.53, UNIT.UNIT),
                new Purchase(productFlour, LocalDate.of(2018, 2, 1), 190, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 62, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 1), 79, UNIT.KILOGRAM)
        )));

        Company baltimoreFishing = new Company("Fisz", "Baltimore", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 500, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 500, UNIT.UNIT)
        )));

        Company solwit = new Company("Solwit", "Kijev", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productAudi, LocalDate.of(2018, 1, 2), 2, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 2), 89, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 12), 73.13, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 29), 67.33, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 13), 91.44, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 2), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 3), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 4), 1, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT)

        )));

        Company solwitGda = new Company("Solwit", "Gdansk", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 7), 1.0, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT)
        )));

        Company intelD = new Company("Intel", "Detroit", 755, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 10), 10, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 23.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 2, 20), 10, UNIT.UNIT)
        )));

        Company intelGda = new Company("Intel", "Gdansk", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        Company intelKij = new Company("Intel", "Kijev", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        List<Company> companies = new ArrayList<>(Arrays.asList(
                companyFallen,
                companyPetersWifesCookies,
                companyTheOffice,
                transporting,
                companyTonysHardware,
                companyTailor,
                companyGoogleDublin,
                companyGoogleLondon,
                companyGoogleKijev,
                companyFintech,
                companyFintechNewYork,
                bakeryDetroit,
                baltimoreFishing,
                solwitGda,
                solwit,
                intelD,
                intelGda,
                intelKij
        ));


//        System.out.println(companies);

// Polecenie 1:
// Dane to Firmy oraz ich zakupy z miesiąca styczeń/luty 2018.

// Wszystkie rozwiązania zapisz w oddzielnych metodach statycznych w klasie Main.
// 1. Wylistuj (system out println) wszystkie firmy
        zad1_ListAllCompanies(companies);
// 2. Wylistuj wszystkie firmy które są z Detroit
        zad2_DetroidCompanies(companies);
// 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
        zad3_LononCompanies(companies);
// 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
        zad4_WarsawCompanies(companies);
// 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
        zad5_KijevCompanies(companies);
// 6. Zwróć firmę z najkrótszą nazwą
        zad6_ShortestCompanyName(companies);
// 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
        zad7(companies);
// 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
        zad8(companies);
// 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie
// (https://howtodoinjava.com/java8/collect-stream-to-map/)
        zad9(companies);

// 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości
// (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
        company_10_companiesFromCities(companies);
// 11. Zwróć firmę która dokonała zakupów na największą kwotę
        company_11_zakupy_najwieksze(companies);
// 12. Zwróć firmę która kupiła najwięcej produktów za kwotę wyższą niż 10 k
        company_12_zakupy_za_10_k(companies);
// 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość,
// a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości
        company_13_najwiecej_hajsu(companies);
// 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
        company_14_network(companies);
// 15. Znajdź firmę która kupuje najwięcej kawy
        company_15_najwiecejKawy(companies);
// 16. Wypisz ile łącznie zostało kupionej kawy Arabica w miesiącu styczniu
        company_16_arabica_january(companies);
// 17. Wypisz ile łącznie kawy (Arabica i Roubsta) zostało kupionej w dni parzyste.
        company_17_arabica_robusta_even(companies);
// 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy (powinny być dwie, Arabica i Robusta) i wartością są listy firm które kupiły podaną kawę chociaż raz.
        Map<Product, Set<Company>> productSetMap = company_18_mapa_kaw(companies);
        System.out.println(productSetMap);
// 19. Zwróć firmę która w styczniu kupiła najwięcej paliwa (ropy)
        company_19_most_oil_january(companies);
// 20. Zwróć firmę której proporcja wydanych pieniędzy do ilości pracowników jest najwyższa
        company_20_money_vs_employees(companies);
// 21. Zwróć firmę która najwięcej wydaje na artykuły biurowe
        company_21_most_sheeets(companies);
// 22. Zwróć firmy posortowane po ilości wydanych pieniędzy na paliwo
        company_22_sort_money(companies);
// 23. Zwróć wszystkie produkty które kupione były na kilogramy
        company_23_wszystkie_produkty_na_kilogramy(companies);
// 24. Zwróć listę zakupów (obiektów purchase) kupionych przez firmy z Detroit w miesiącu lutym. posortuj je po kwocie.
        company_24_detroit_shopping_in_february(companies);
// 25. Zwróć ilość biur które wynajęte były w miesiącu lutym.
        company_25_rent_in_february(companies);
// 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur które wynajęły w dowolnym okresie.
   //     company_26_company_and_offices(companies);
// 27. *Wypisz "Nazwa firmy: XYZ, ilość zakupionych telefonów apple: X" dla każdej firmy która kupiła telefon apple. Wypisy powinny być posortowane (na szczycie powinna być firma która kupiła ich najwięcej).
        //     company_27_apple_lovers(companies);
// 28. Znajdź firme która posiada siedzibę w więcej niż jednym mieście. Posortuj firmy po ilości siedzib, wypisz tylko te które mają więcej niż 1 siedzibę.
//        company_28_rich_multi_city_companies(companies);
// 29. Wypisz ilość kilogramów cukru zużywaną przez "Detroit Bakery"
//        company_29_detroit_bakery(companies);
// 30. Wypisz wszystkie zakupy firmy "Solwit".
// 31. Wypisz wszystkie produkty które są tańsze (jednostkowo) niż 3$.
// 32. Wypisz ile sprzedano najtańszego produktu
// 33. Firma "Take me home" zajmuje się transportem. Na początku działalności kupiła wiele samochodów do użytku. Oblicz ile litrów paliwa (średnio) spalają ich samochody (zakładamy że wszystkie palą benzynę i że tankowane są wszystkie.
// 34. Wypisz firmę która zużywa najwięcej kawy
// 35. Wypisz firmę która zużywa najwięcej na papier.
// 36. Wypisz wszystkie produkty które były kupowane w większych ilościach niż 50 (jednostek/kilogramów)
// 37. Wypisz ile każda z firm zużywa na kawę (ile pieniędzy wydaje) (jako wynik zwróć mapę Map<String, Double> gdzie kluczem jest nazwa firmy, wartością jest ilość pieniędzy wydawanej na kawę
// 38. Wypisz średnie zużycie kawy na pracownika (wypisz w postaci proporcji. Jeśli firma kupiła 30 kilogramów i ma 20 pracowników to ma 1.5 kg / pracownika [w całości okresu])
// 39. Wypisz jaki produkt poza paliwem cieszy się największą popularnością (zwróć go) (find first)
// 40. Znajdź produkty które były kupowane zarówno w kilogramach jak i w sztukach
// 40. Wymyśl 5 ciekawych zapytań i spróbuj je zrealizować. Najciekawsze polecenie otrzyma nagrodę-niespodziankę z Baltimore :P

    }

    // 1. Wylistuj (system out println) wszystkie firmy
    private static void zad1_ListAllCompanies(List<Company> companies) {
        companies.forEach(System.out::println);
    }

    // 2. Wylistuj wszystkie firmy które są z Detroit
    private static void zad2_DetroidCompanies(List<Company> companies) {
        List<Company> result = companies.stream().
                filter(c -> c.getCityHeadquarters().equalsIgnoreCase("Detroit")).
                collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    // 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
    private static void zad3_LononCompanies(List<Company> companies) {
        System.out.println("Zad3");
        List<Company> result = companies.stream()
                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("London"))
                .sorted(Comparator.comparingInt(Company::getEmployees))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    // 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
    private static void zad4_WarsawCompanies(List<Company> companies) {
        System.out.println("zad4");
        List<Company> result = companies.stream()
                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("Detroit"))
                .sorted(new Comparator<Company>() {
                    @Override
                    public int compare(Company c1, Company c2) {
                        int comparisonResult = Integer.compare(c1.getPurchaseList().size(), c2.getPurchaseList().size());
                        if (comparisonResult != 0) {
                            // jeżei wynik jest różny od 0 - nie ma sensu sprawdzanie 2 przypadku - rosnąco
                            return comparisonResult;
                        }
                        // jeżeli pierwzze kryterium wysżło tak samo - malejąco
                        return Integer.compare(c2.getEmployees(), c1.getEmployees());
                    }
                }).collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    // 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
    private static void zad5_KijevCompanies(List<Company> companies) {
        System.out.println("zad5");
        Optional<Company> resultCompany = companies.stream()
                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("Kijev"))
                .max(new Comparator<Company>() {
                    @Override
                    public int compare(Company c1, Company c2) {

                        return Integer.compare(c1.getEmployees(), c2.getEmployees());
                    }
                });
        System.out.println(resultCompany);
    }

    // 6. Zwróć firmę z najkrótszą nazwą
    private static void zad6_ShortestCompanyName(List<Company> companies) {
        System.out.println("Zad6");
        Optional<Company> comppp = companies.stream()
                .min((c1, c2) -> Integer.compare(c1.getName().length(), c2.getName().length()));
        System.out.println(comppp);
    }

    // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
    private static void zad7(List<Company> companies) {
        List<String> excludedCities = Arrays.asList("Kijev", "London", "Detroit");
        System.out.println("Zad7");
        Optional<Company> result = companies.stream()
                .filter(company -> !excludedCities.contains(company.getCityHeadquarters()))
                .min(Comparator.comparing(company -> company.getPurchaseList().size()));
        System.out.println(result);
    }

    // 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
    private static void zad8(List<Company> companies) {
        System.out.println("zad8");
        companies.forEach(System.out::println);
        List<String> includedCities = Arrays.asList("Kijev", "Detroit");
        System.out.println("Zad8");
        companies.stream()
                .filter(company -> includedCities.contains(company.getCityHeadquarters()))
                .forEach(company -> company.setEmployees(company.getEmployees() + 1));
        companies.forEach(System.out::println);
    }

    // 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie
    // (https://howtodoinjava.com/java8/collect-stream-to-map/)
    private static void zad9(List<Company> companies) {
        System.out.println("Zad9");
        Map<String, Integer> resultMap = companies.stream()
                .collect(Collectors.toMap(
                        Company::getName,
                        Company::getEmployees,
                        ((integer, integer2) -> {
                            // jeśli sa 2 firmy o tej samej nazwie to zsumuj ich praowników
                            return integer + integer2;
                        })
                ));
        // Google jest kilkukrotnie więc tworzymy 3 argument - jeżeli jest 2 razy

        resultMap.forEach((c, iloscPracownikow) -> System.out.println("Company:" + c + "ilosc pracownikow:" + iloscPracownikow));
    }

    // 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości
    // (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
    private static void company_10_companiesFromCities(List<Company> companies) {
        System.out.println("zad10");
        Map<String, List<Company>> resultMap = companies.stream()
                .collect(Collectors.toMap(
                        Company::getCityHeadquarters, // klucz - nazwa miejscowosci
                        company -> {
                            List<Company> cpny = new ArrayList<>();
                            cpny.add(company);
                            return cpny;
                        },
                        new BinaryOperator<List<Company>>() {
                            @Override
                            public List<Company> apply(List<Company> companies, List<Company> companies2) { // łaczy listy z ta sama miejscowością w większoś listę
                                List<Company> cmpnies = new ArrayList<>();
                                cmpnies.addAll(companies);
                                cmpnies.addAll(companies2);
                                return cmpnies;
                            }
                        }));
        resultMap.forEach((nazwa, listaFirm) -> System.out.println("Company " + nazwa + " -> " + listaFirm));
    }

    // 11. Zwróć firmę która dokonała zakupów na największą kwotę
    private static void company_11_zakupy_najwieksze(List<Company> companies) {
        System.out.println("zad11");
        Optional<Company> resultCompany = companies.stream()
                .max(new Comparator<Company>() {
                    @Override
                    public int compare(Company c1, Company c2) {
                        double sum1 = c1.getPurchaseList().stream()
                                .mapToDouble(purchase -> (purchase.getQuantity() * purchase.getProduct().getPrice())).sum();
                        double sum2 = c1.getPurchaseList().stream()
                                .mapToDouble(purchase -> (purchase.getQuantity() * purchase.getProduct().getPrice())).sum();
                        return Double.compare(sum1, sum2);
                    }
                });
        System.out.println(resultCompany);

    }

    // 12. Zwróć firmę która kupiła najwięcej produktów za kwotę wyższą niż 10 k
    private static void company_12_zakupy_za_10_k(List<Company> companies) {
        System.out.println("zad12");
        Optional<Company> resultCompany = companies.stream()
                .max(new Comparator<Company>() {
                    @Override
                    public int compare(Company c1, Company c2) {
                        double sum1 = c1.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getPrice() > 10000)
                                .mapToDouble(Purchase::getQuantity)
                                .sum();
                        double sum2 = c1.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getPrice() > 10000)
                                .mapToDouble(Purchase::getQuantity)
                                .sum();
                        return Double.compare(sum1, sum2);
                    }
                });
        System.out.println(resultCompany);
    }

    // 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość,
// a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości
    private static void company_13_najwiecej_hajsu(List<Company> companies) {
        System.out.println("zad13");
        Map<String, Double> resultMap = companies.stream()
                .collect(Collectors.toMap(
                        Company::getCityHeadquarters,
                        company -> company.getPurchaseList().stream().mapToDouble(purchuse -> purchuse.getQuantity() * purchuse.getProduct().getPrice())
                                .sum(),
                        //jesli napotkamy dwie firmy z tej samej miejscowosci, to maja kwoty o i o2
                        // dodajemy do siebie
                        (o, o2) -> o + o2 // Double::sum
                ));
        resultMap.forEach((miejcowosc, sumaKwot) -> System.out.println("Miejscowosc: " + miejcowosc + "->" + sumaKwot));
    }

    // 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
    private static void company_14_network(List<Company> companies) {
        System.out.println("zad14");
        String networkSwitch = "Network Switch";
        companies.stream()
                .filter(company -> company.getPurchaseList().stream()
                        .anyMatch(purchase ->
                                purchase.getPurchaseDate().isEqual(LocalDate.of(2018, 1, 15))
                                        && purchase.getProduct().getName().equals(networkSwitch)))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));
    }

    // 15. Znajdź firmę która kupuje najwięcej kawy
    private static void company_15_najwiecejKawy(List<Company> companies) {

        System.out.println("Zad.15");
        Optional<Company> maxCoffeeCompany = companies.stream()
                .max((o1, o2) -> {

                    Double coffeePurchaseCompany1;
                    Double coffeePurchaseCompany2;

                    coffeePurchaseCompany1 = o1.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().contains("Coffee"))
                            .mapToDouble(Purchase::getQuantity).sum();

                    coffeePurchaseCompany2 = o2.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().contains("Coffee"))
                            .mapToDouble(Purchase::getQuantity).sum();

                    return Double.compare(coffeePurchaseCompany1, coffeePurchaseCompany2);
                });
        maxCoffeeCompany.ifPresent(System.out::println);
    }

    // 16. Wypisz ile łącznie zostało kupionej kawy Arabica w miesiącu styczniu
    private static void company_16_arabica_january(List<Company> companies) {

        System.out.println("Zad.16");
        double sumOfCoffee = companies.stream()
                .flatMap(c -> c.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getName().contains("Arabica") && purchase.getPurchaseDate().getMonth().getValue() == 1))
                .mapToDouble(Purchase::getQuantity)
                .sum();
        System.out.println("suma kawy kupionej w styczniu to: " + sumOfCoffee + "kg");
    }

    // 17. Wypisz ile łącznie kawy (Arabica i Roubsta) zostało kupionej w dni parzyste.
    private static void company_17_arabica_robusta_even(List<Company> companies) {
        System.out.println("Zad.17");
        double evenDaysPurchasedCoffee =
                companies.stream()
                        .flatMap(company -> company.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().contains("Coffee") && (purchase.getPurchaseDate().getDayOfMonth()) % 2 == 0))
                        .mapToDouble(Purchase::getQuantity)
                        .sum();
        System.out.println("w dni parzyste kupiono: " + evenDaysPurchasedCoffee + "kg kawy");
    }

    // 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy (powinny być dwie, Arabica i Robusta)
    // i wartością są listy firm które kupiły podaną kawę chociaż raz.
    private static Map<Product, Set<Company>> company_18_mapa_kaw(List<Company> companies) {
        System.out.println("Zad.18");
        // tworzę listę PRODUKTOW - posiadających w nazwie "Coffee"
        List<Product> listofCoffees = companies.stream()
                .map(Company::getPurchaseList)              // przechodzę z list firm na liste zakupów
                .flatMap(purchases -> purchases.stream()    // wrzucam wszystkie zakupy do jednego worka
                        .map(Purchase::getProduct)          // przechdozę z porównywania zakópów na porównywanie produnktów (nie intersuje mnie np. ile ich kupiono)
                        .filter(product -> product.getName().contains("Coffee")))
                .collect(Collectors.toList());

        return listofCoffees.stream().collect(Collectors.toMap(     // wychodzę z listy produktów
                typeOfCoffee -> typeOfCoffee,                       // kluczem są produkty same w sobie
                typeOfCoffee -> companies.stream()                  // jako warości chcę formy więc z kluczy przechodzę z powrotem na listę firm
                        .filter(company -> company.getPurchaseList().stream()       // filtruję te firmy które w zakupach...
                                .anyMatch(purchase -> purchase.getProduct() == typeOfCoffee))   // mają dgdziekolwiek (ANYMATCH) któryś z prokuktów które mamy jako klucze
                        .collect(Collectors.toSet()),               // wrzucam te firmy na stos
                (company1, company2) -> {                           // jeżeli mam kilka takich camych firm - dorzucam do stosu (i tak powtórzenia się usuną)
                    Set<Company> companiesSet = new HashSet<>(company1);
                    companiesSet.addAll(company2);
                    return companiesSet;
                }
        ));
    }

    // 19. Zwróć firmę która w styczniu kupiła najwięcej paliwa (ropy)
    private static void company_19_most_oil_january(List<Company> companies) {

        // fuel oil
        System.out.println("Zad.19");
        Optional<Company> maxOilJanuary = companies
                .stream()
                .max((o1, o2) -> {
                    double oilAmountO1 = o1.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Fuel, oil")
                                    && purchase.getPurchaseDate().getMonth().getValue() == 1).mapToDouble(Purchase::getQuantity).sum();
                    double oilAmountO2 = o2.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Fuel, oil")
                                    && purchase.getPurchaseDate().getMonth().getValue() == 1).mapToDouble(Purchase::getQuantity).sum();

                    return Double.compare(oilAmountO1, oilAmountO2);
                });

        maxOilJanuary.ifPresent(System.out::println);
    }

    // 20. Zwróć firmę której proporcja wydanych pieniędzy do ilości pracowników jest najwyższa
    private static void company_20_money_vs_employees(List<Company> companies) {
        // wydana kasa/ilosc pracownikow = max
        System.out.println("Zad.20");
        Optional<Company> maxMoneyVsEmployees = companies.stream()
                .max(Comparator.comparingDouble(c -> c.getPurchaseList()
                        .stream()
                        .mapToDouble(purchase -> purchase.getQuantity() * purchase.getProduct().getPrice()).sum() / c.getEmployees()));

        maxMoneyVsEmployees.ifPresent(System.out::println);
    }

    // 21. Zwróć firmę która najwięcej wydaje na artykuły biurowe
    private static void company_21_most_sheeets(List<Company> companies) {
        System.out.println("Zad.21");

        List<String> officeArticles = Arrays.asList("Pen", "Pencil", "Clip", "Puncher", "Paper", "Scisors");
        Optional<Company> maxOfficeArticlesCompany = companies.stream()
                .max(Comparator.comparingDouble(comp -> comp.getPurchaseList().stream()
                        .filter(product -> officeArticles.contains(product.getProduct().getName()))
                        .mapToDouble(product -> product.getProduct().getPrice() * product.getQuantity())
                        .sum()
                ));
        maxOfficeArticlesCompany.ifPresent(System.out::println);

    }

    // 22. Zwróć firmy posortowane po ilości wydanych pieniędzy na paliwo--------------------PYTANIE - REVERSED
    private static void company_22_sort_money(List<Company> companies) {
        System.out.println("Zad.22");
        System.out.println("Companies before sorting: \n" + companies);
        companies.sort(Comparator.comparingDouble(c -> c.getPurchaseList()
                .stream()
                .filter(purchase -> purchase.getProduct().getName().contains("Fuel"))
                .mapToDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity())
                .sum()
        ));
        System.out.println("Companies after sorting: \n" + companies);
    }
//_______________ SORTUJE OD NAJMNIEJSZEGO DO NAJWIĘKSZEGO... NIE DA SIĘ ZROBIĆ .reversed() ŻEBY SORTOWAŁO NA ODWRÓT ?_____

    // 23. Zwróć wszystkie produkty które kupione były na kilogramy
    private static void company_23_wszystkie_produkty_na_kilogramy(List<Company> companies) {
        System.out.println("Zad.23");
        Set<Product> kgList = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getUnit().equals(UNIT.KILOGRAM))
                .map(Purchase::getProduct)
                .collect(Collectors.toSet());
        kgList.forEach(System.out::println);
    }

    // 24. Zwróć listę zakupów (obiektów purchase) kupionych przez firmy z Detroit w miesiącu lutym. posortuj je po kwocie.
    private static void company_24_detroit_shopping_in_february(List<Company> companies) {

        System.out.println("Zad. 24");
        List<Purchase> detroitPurchase = companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Detroit"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 2)
                .sorted(Comparator.comparingDouble(p -> p.getProduct().getPrice() * p.getQuantity()))
                .collect(Collectors.toList());

        detroitPurchase.forEach(System.out::println);
    }

    // 25. Zwróć ilość biur które wynajęte były w miesiącu lutym.
    private static void company_25_rent_in_february(List<Company> companies) {
        System.out.println("Zad. 25");
        long officesNumber = companies.stream()
                .flatMap(c -> c.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().equals("Office rent") &&
                        purchase.getPurchaseDate().getMonth().getValue() == 2)
                .count();
        System.out.println("Number of offices rented in febuary: " + officesNumber);
    }

    // 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur które wynajęły w dowolnym okresie.
  /*  private static void company_26_company_and_offices(List<Company> companies) {
        System.out.println("Zad. 26");
        Map<Company, Integer> mapOfCompaniesOffices = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(purchase -> purchase.getProduct().getName().equals("Office rent")
                                        && purchase.getPurchaseDate().getMonth().getValue() >= 2
                                        && purchase.getPurchaseDate().getMonth().getValue() < 10)
                        ),
                        (o1, o2) -> o1 + o2


                ));

        System.out.println(mapOfCompaniesOffices);
    }*/

    ;


    // 27. *Wypisz "Nazwa firmy: XYZ, ilość zakupionych telefonów apple: X"
    // dla każdej firmy która kupiła telefon apple. Wypisy powinny być posortowane
    // (na szczycie powinna być firma która kupiła ich najwięcej).

  /*
    private static void company_27_apple_lovers(List<Company> companies) {
        Map<String, Integer> aplowcy = companies.stream()
                .collect(Collectors.toMap(
                        company -> company.getName(),
                        company -> company.getPurchaseList()
                                .stream()
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Apple Phone"))
                                .mapToInt(purchase -> (int) purchase.getQuantity())
                                .sum(),
                        (e1, e2) -> e1 + e2
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> (integer + integer2), LinkedHashMap::new));
        System.out.println("#####");
        for (Map.Entry<String, Integer> entry : aplowcy.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("#####");

    }

    // 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur
    // które wynajęły w dowolnym okresie.
    private static void company_26_company_and_offices(List<Company> companies) {
        Map<String, Integer> offices = companies.stream()
                .collect(Collectors.toMap(
                        company -> company.getName(),
                        company -> company.getPurchaseList()
                                .stream()
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                                .mapToInt(purchase -> (int) purchase.getQuantity())
                                .sum(),
                        (e1, e2) -> {
                            return e1 + e2;
                        }
                ));
    }

    // 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy
    // (powinny być dwie, Arabica i Robusta) i wartością są listy firm które kupiły
    // podaną kawę chociaż raz.
    private static void company_18_mapa_kaw(List<Company> companies) {
        Set<Product> typyKaw = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(purchase -> purchase.getProduct())
                .filter(product -> product.getName().startsWith("Coffee,"))
                .collect(Collectors.toSet());

        Map<Product, Set<Company>> coffeeBuyers = typyKaw.stream()
                .collect(Collectors.toMap(
                        product -> product,
                        p -> companies.stream()
                                .filter(company -> company.getPurchaseList()
                                        .stream()
                                        .anyMatch(purchase -> purchase.getProduct() == p))
                                .collect(Collectors.toSet()),
                        (e1, e2) -> {
                            Set<Company> s1 = new HashSet<>(e1);
                            s1.addAll(e2);
                            return s1;
                        }));

        for (Map.Entry<Product, Set<Company>> productSetEntry : coffeeBuyers.entrySet()) {
            System.out.print(productSetEntry.getKey() + " ");
            for (Company company : productSetEntry.getValue()) {
                System.out.print(company.getName() + " ");
            }
            System.out.println();



        }
















    }
    */

}
