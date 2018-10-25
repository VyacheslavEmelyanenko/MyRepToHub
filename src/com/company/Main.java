package com.company;

public class Main {

    public static void main(String[] args) {
        CardValidate validator = new LuhnValidate();
        for (String masterCard:args) {

//        for (int i = 0; i < 10; i++) {
            String number = new CardGenerate().generate(masterCard);
            System.out.println(number + " " + validator.validateCard(number));
        }
    }
}
