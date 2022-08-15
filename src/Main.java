import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String calc(String input) throws IOException {
            String[] v = input.split(" ");
            if (v.length > 3) throw new IOException();
            if ((v[0].equals("I") || v[0].equals("II") || v[0].equals("III") || v[0].equals("IV") || v[0].equals("V") || v[0].equals("VI") ||
                    v[0].equals("VII") || v[0].equals("VIII") || v[0].equals("IX") || v[0].equals("X")) && (v[2].equals("I") ||
                    v[2].equals("II") || v[2].equals("III") || v[2].equals("IV") || v[2].equals("V") || v[2].equals("VI") || v[2].equals("VII") ||
                    v[2].equals("VIII") || v[2].equals("IX") || v[2].equals("X")) && (v[1].equals("+") || v[1].equals("-") || v[1].equals("*") || v[1].equals("/"))) {
                int a = 0;
                int b = 0;
                switch (v[0]) {
                    case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> a = romToArab(v[0]);
                }
                switch (v[2]) {
                    case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> b = romToArab(v[2]);
                }
                int c = 0;
                switch (v[1]) {
                    case "+" -> c = a + b;
                    case "-" -> c = a - b;
                    case "*" -> c = a * b;
                    case "/" -> c = a / b;
                }
                return Convertion.convert(c);
            } else if (Integer.parseInt(v[0]) > 0 && Integer.parseInt(v[0]) <= 10 && Integer.parseInt(v[2]) > 0 && Integer.parseInt(v[2]) <= 10 &&
                    (v[1].equals("+") || v[1].equals("-") || v[1].equals("*") || v[1].equals("/"))) {
                int a = 0;
                int b = 0;
                switch (v[0]) {
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> a = Integer.parseInt(v[0]);
                }
                switch (v[2]) {
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> b = Integer.parseInt(v[2]);
                }
                int c = 0;
                switch (v[1]) {
                    case "+" -> c = a + b;
                    case "-" -> c = a - b;
                    case "*" -> c = a * b;
                    case "/" -> c = a / b;
                }
                return String.valueOf(c);
            } else
                throw new IOException();
        }


        public static void main(String[] args) throws IOException {
            System.out.println("введите число от 1 до 10, знак выражения, и второе число от 1 до 10 через пробел" + "\n" + "также можете вводить римские числа от I до X");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            calc(data);
            System.out.println(calc(data));
        }

        static int romToArab(String arg) {
            String a = switch (arg) {
                case "I" -> "1";
                case "II" -> "2";
                case "III" -> "3";
                case "IV" -> "4";
                case "V" -> "5";
                case "VI" -> "6";
                case "VII" -> "7";
                case "VIII" -> "8";
                case "IX" -> "9";
                case "X" -> "10";
                default -> arg;
            };
            return Integer.parseInt(a);
        }
    }
    class Convertion {
        static String convert(int drop) throws IOException {
            return switch (drop) {
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                case 4 -> "IV";
                case 5 -> "V";
                case 6 -> "VI";
                case 7 -> "VII";
                case 8 -> "VIII";
                case 9 -> "IX";
                case 10 -> "X";
                case 11 -> "XI";
                case 12 -> "XII";
                case 13 -> "XIII";
                case 14 -> "XIV";
                case 15 -> "XV";
                case 16 -> "XVI";
                case 17 -> "XVII";
                case 18 -> "XVIII";
                case 19 -> "XIX";
                case 20 -> "XX";
                case 21 -> "XXI";
                case 22 -> "XXII";
                case 23 -> "XXIII";
                case 24 -> "XXIV";
                case 25 -> "XXV";
                case 26 -> "XXVI";
                case 27 -> "XXVII";
                case 28 -> "XXVIII";
                case 29 -> "XXIX";
                case 30 -> "XXX";
                case 31 -> "XXXI";
                case 32 -> "XXXII";
                case 33 -> "XXXIII";
                case 34 -> "XXXIV";
                case 35 -> "XXXV";
                case 36 -> "XXXVI";
                case 37 -> "XXXVII";
                case 38 -> "XXXVIII";
                case 39 -> "XXXIX";
                case 40 -> "XL";
                case 41 -> "XLI";
                case 42 -> "XLII";
                case 43 -> "XLIII";
                case 44 -> "XLIV";
                case 45 -> "XLV";
                case 46 -> "XLVI";
                case 47 -> "XLVII";
                case 48 -> "XLVIII";
                case 49 -> "XLIX";
                case 50 -> "L";
                case 51 -> "LI";
                case 52 -> "LII";
                case 53 -> "LIII";
                case 54 -> "LIV";
                case 55 -> "LV";
                case 56 -> "LVI";
                case 57 -> "LVII";
                case 58 -> "LVIII";
                case 59 -> "LIX";
                case 60 -> "LX";
                case 61 -> "LXI";
                case 62 -> "LXII";
                case 63 -> "LXIII";
                case 64 -> "LXIV";
                case 65 -> "LXV";
                case 66 -> "LXVI";
                case 67 -> "LXVII";
                case 68 -> "LXVIII";
                case 69 -> "LXIX";
                case 70 -> "LXX";
                case 71 -> "LXXI";
                case 72 -> "LXXII";
                case 73 -> "LXXIII";
                case 74 -> "LXXIV";
                case 75 -> "LXXV";
                case 76 -> "LXXVI";
                case 77 -> "LXXVII";
                case 78 -> "LXXVIII";
                case 79 -> "LXXIX";
                case 80 -> "LXXX";
                case 81 -> "LXXXI";
                case 82 -> "LXXXII";
                case 83 -> "LXXXIII";
                case 84 -> "LXXXIV";
                case 85 -> "LXXXV";
                case 86 -> "LXXXVI";
                case 87 -> "LXXXVII";
                case 88 -> "LXXXVIII";
                case 89 -> "LXXXIX";
                case 90 -> "XC";
                case 91 -> "XCI";
                case 92 -> "XCII";
                case 93 -> "XCIII";
                case 94 -> "XCIV";
                case 95 -> "XCV";
                case 96 -> "XCVI";
                case 97 -> "XCVII";
                case 98 -> "XCVIII";
                case 99 -> "XCIX";
                case 100 -> "C";
                default -> throw new IOException();
            };
        }
    }
