//Julius Patrick Peji  BSIT601

package binary;

import java.util.Scanner;

public class mainBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary value: ");
        String binaryInput = scanner.next();

        BInary binary = new BInary(binaryInput);

        System.out.println("Decimal value: " + binary.getDecimal());
        System.out.println("Hexadecimal value: " + binary.getHexadecimal());
        System.out.println("Octal value: " + binary.getOctal());


    }
}
