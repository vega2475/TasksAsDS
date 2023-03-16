public class Transfer {

    private final String VALUE; // значение числа

    private final int BASE; // основание системы счисления

    public Transfer(String VALUE, int BASE) {
        this.VALUE = VALUE;
        this.BASE = BASE;
    }

    private boolean checkCorrect(int base){
        for(int i = 0; i < this.VALUE.length(); i++){
            if(base < 10 && this.VALUE.charAt(i) >= base){
                return false;
            }else if(base >= 10 && this.VALUE.charAt(i) - 55 >= base){
                return false;
            }

        }
        return true;
    }

    public String convertToBase(int targetBase) {
        if(!checkCorrect(this.BASE)) throw new IllegalArgumentException("Incorrect value: " + this.VALUE);
        if(targetBase == this.BASE) return this.VALUE;
        int decimalValue = toDecimal(VALUE, BASE);
        if(targetBase == 10)return Integer.toString(decimalValue);
        return fromDecimal(decimalValue, targetBase);
    }

    private int toDecimal(String value, int base) {
        int decimalValue = 0;
        int power = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            int digitValue = getDigitValue(value.charAt(i));
            decimalValue += digitValue * Math.pow(base, power);
            power++;
        }
        return decimalValue;
    }

    private String fromDecimal(int decimalValue, int targetBase) {
        StringBuilder result = new StringBuilder();
        while (decimalValue > 0) {
            int remainder = decimalValue % targetBase;
            char digitChar = getDigitChar(remainder);
            result.insert(0, digitChar);
            decimalValue /= targetBase;
        }
        return result.toString();
    }

    private int getDigitValue(char digitChar) {
        if (digitChar >= '0' && digitChar <= '9') {
            return digitChar - '0';
        } else if (digitChar >= 'a' && digitChar <= 'z') {
            return digitChar - 'a' + 10;
        } else if (digitChar >= 'A' && digitChar <= 'Z') {
            return digitChar - 'A' + 10;
        } else {
            throw new IllegalArgumentException("Invalid char: " + digitChar);
        }
    }

    private char getDigitChar(int digitValue) {
        if (digitValue >= 0 && digitValue <= 9) {
            return (char) ('0' + digitValue);
        } else if (digitValue >= 10 && digitValue <= 35) {
            return (char) ('a' + digitValue - 10);
        } else {
            throw new IllegalArgumentException("Invalid value: " + digitValue);
        }
    }
}


