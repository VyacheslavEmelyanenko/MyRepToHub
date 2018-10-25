package com.company;
/*
* Abstract class that implements the validation
 */
public abstract class CardValidate {
    protected CardValidate next;

    public void setNext(CardValidate validator) {
        next = validator;
    }

    protected abstract boolean validateCard(String cardNumber);
}
