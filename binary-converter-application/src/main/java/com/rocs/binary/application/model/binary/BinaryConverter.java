package com.rocs.binary.application.model.binary;

public class BinaryConverter {
    private int binaryValue;
    private int decimalValue;
    private String hexValue;
    private String octal;

    public BinaryConverter(int binaryValue){
        this.binaryValue = binaryValue;
        this.decimalValue = convertDecimal();
        this.hexValue = convertHexa();
        this.octal = convertOctal();
    }

    public int getBinaryValue() {
        return binaryValue;
    }

    public String getHexValue(){
        return this.hexValue;
    }

    public String getOctal() {
        return octal;
    }

    public int getDecimalValue() {
        return this.decimalValue;
    }

    public int convertDecimal(){
        String stringValue = Integer.toString(binaryValue);
        int decimalVal = 0;
        int index = stringValue.length()-1;
        char single;
        for(int i = 0; i < stringValue.length(); i++ ){
            single = stringValue.charAt(i);
            if(single == '1'){
                decimalVal += Math.pow(2,index);
            }
            index--;
        }
        return decimalVal;
    }
    public String convertHexa(){
        int outOf;
        String hex = "";
        String stringValue = Integer.toString(binaryValue);
        int decimalVal = 0;
        int index = stringValue.length()-1;
        char single;
        for(int i = 0; i < stringValue.length(); i++ ){
            single = stringValue.charAt(i);
            if(single == '1'){
                decimalVal += Math.pow(2,index);
            }
            index--;
        }

        while(decimalVal > 0){
            outOf = decimalVal % 16;
            if(outOf == 10){
                hex = "A" + hex;
            } else if (outOf == 11) {
                hex = "B"+ hex;
            }else if (outOf == 12) {
                hex = "C"+ hex;
            }else if (outOf == 13) {
                hex = "D"+ hex;
            }else if (outOf == 14) {
                hex = "E"+ hex;
            }else if (outOf == 15) {
                hex = "F"+ hex;
            }else {
                hex = outOf + hex;
            }
            decimalVal /= 16;
        }
        return hex;
    }
    public String convertOctal(){
        String stringValue = Integer.toString(binaryValue);
        StringBuilder stringBuilder = new StringBuilder();
        int decimalVal = 0;
        int index = stringValue.length()-1;
        int outOf;
        char single;
        for(int i = 0; i < stringValue.length(); i++ ){
            single = stringValue.charAt(i);
            if(single == '1'){
                decimalVal += Math.pow(2,index);
            }
            index--;
        }

        while (decimalVal > 0){
            outOf = decimalVal % 8;
            decimalVal = decimalVal / 8;
            stringBuilder.append(outOf);
        }
        return stringBuilder.reverse().toString();
    }
}
