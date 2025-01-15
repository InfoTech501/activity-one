package com.rocs.binary.application.model.binary;

public class Binary{

        private String binary;

        private int decimal;

        private String hexadecimal;

        private String octal;

        int validString;

        public Binary(String binary) {
            this.binary = getBinary(validString);
            this.decimal = convertToDecimal();
            this.hexadecimal = convertToHexadecimal();
            this.octal = convertToOctal();
        }

    public String getOctal() {
            return convertToOctal();
        }

        public String getHexadecimal() {
            return convertToHexadecimal();
        }

        public int getDecimal() {
            return convertToDecimal();
        }

        public String getBinary(int validString) {
            binary = String.valueOf(Integer.valueOf(validString));
            return binary;
        }

    public int convertToDecimal() {
        int decimal = 0;
        int length = this.binary.length();

        for (int i = 0; i < length; i++) {
            char bit = this.binary.charAt(length - i - 1);
            if (bit == '1') {
                decimal += 2 * i;
            }
        }
        return decimal;
    }

    public String convertToHexadecimal() {
        int decimal = convertToDecimal();
        StringBuilder hexadecimal = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, remainder);
            } else if (remainder == 11){
                StringBuilder insert = hexadecimal.insert(0, 'A');
            } else if (remainder == 12){
                StringBuilder insert = hexadecimal.insert(0, 'B');
            } else if (remainder == 13){
                StringBuilder insert = hexadecimal.insert(0, 'C');
            } else if (remainder == 14){
                StringBuilder insert = hexadecimal.insert(0, 'D');
            } else if (remainder == 15){
                StringBuilder insert = hexadecimal.insert(0, 'E');
            } else if (remainder == 16) {
                StringBuilder insert = hexadecimal.insert(0, 'F');
            } else System.out.println("no hexadecimal value");
            decimal = decimal / 16;
        }

        return hexadecimal.toString();
    }

    public String convertToOctal() {
        int decimal = convertToDecimal();
        StringBuilder octal = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal = decimal / 8;
        }

        return octal.toString();
    }

    }

