package com.company;
/*
*A class that implements the Luhn algorithm
*/
public class LuhnValidate extends CardValidate {
    @Override
    protected boolean validateCard(String cardNumber) {
        if (luhn(cardNumber))
            return (next != null ? next.validateCard(cardNumber) : true);
        else
            return false;
    }

    private boolean luhn(String numberCard) {
        int s1 = 0;
        int s2 = 0;

        String reverse = new StringBuffer(numberCard).reverse().toString();

        for (int i = 0; i < reverse.length(); i++) {
            int digit = Character.digit(reverse.charAt(i), 10);

            if ((i % 2) == 0)
                s1 += digit;
            else {
                s2 += 2 * digit;

                if (digit >= 5)
                    s2 -= 9;
            }
        }
        return ((s1 + s2) % 10 == 0);
    }
}
