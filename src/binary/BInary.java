//Julius Patrick Peji  BSIT601

package binary;

public class BInary {

    private String binaryVal;

    private int decimal;
    private String hexadecimal;
    private String octal;



    public BInary() {

    }


    public BInary(String binaryVal) {
        this.binaryVal = binaryVal;
        this.decimal = computeDecimal();
        this.hexadecimal = computeHexadecimal();
        this.octal = computeOctal();
    }


    private int computeDecimal() {
        return Integer.parseInt(binaryVal, 2);
    }


    private String computeHexadecimal() {
        int decimalValue = computeDecimal();
        return Integer.toHexString(decimalValue);
    }


    private String computeOctal() {
        int decimalValue = computeDecimal();
        return Integer.toOctalString(decimalValue);
    }

    public int getDecimal() {
        return decimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public String getOctal() {
        return octal;
    }
}







