public class Conversion implements Converter {

    public String convertFromDecimalToBinary(String numberToConvert) {
            return Long.toBinaryString(Long.parseLong(numberToConvert));
    }

    public long convertFromBinaryToDecimal(String numberToConvert) {
        return Long.parseLong(numberToConvert, 2);
    }
}