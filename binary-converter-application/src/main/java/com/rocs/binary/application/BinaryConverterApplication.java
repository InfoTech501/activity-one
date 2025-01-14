package com.rocs.binary.application;

import com.rocs.binary.application.model.binary.BinaryConverter;

public class BinaryConverterApplication {
    public static void main(String[] args) {
        BinaryConverter binaryConverter = new BinaryConverter(11111111);
        System.out.println("the Decimal value of "+binaryConverter.getBinaryValue()+" is "+binaryConverter.getDecimalValue());
        System.out.println("the Hex value of "+binaryConverter.getBinaryValue()+" is "+binaryConverter.getHexValue());
        System.out.println("the Octal value of "+binaryConverter.getBinaryValue()+" is "+binaryConverter.getOctal());

    }
}
