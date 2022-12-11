import java.util.Scanner;
public class SimpleOperators {

    public static void main(String[] args) {
        System.out.println("Input numbers:");

        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String delimeter = "";
        String[] exampleDel = example.split(delimeter);
        int convertedToInt = Integer.parseInt(exampleDel[0]);
        int convertedToIht1 = Integer.parseInt(exampleDel[4]);


        switch (exampleDel[2]) {

            case "+":
                int result = convertedToInt + convertedToIht1;

                    if (exampleDel.length > 5 && exampleDel.length < 11) {
                        int convertedToInt2 = Integer.parseInt(exampleDel[8]);

                        switch (exampleDel[6]) {
                            case "+":
                                int result4 = result + convertedToInt2;
                                System.out.println(result4);
                                break;

                            case "-":
                                int result5 = result - convertedToInt2;
                                System.out.println(result5);
                                break;

                            case "*":
                                int result6 = convertedToInt + convertedToIht1 * convertedToInt2;
                                System.out.println(result6);
                                break;

                            case "/":
                                int result7 = convertedToInt + convertedToIht1 / convertedToInt2;
                                System.out.println(result7);
                                break;
                        }
                    } else if (exampleDel.length == 5) {
                        System.out.println(result);
                    } else {
                        System.out.println("Invalid amount of numbers!");
                    }
            break;



            case "-":
                int result1 = convertedToInt - convertedToIht1;

                if (exampleDel.length > 5 && exampleDel.length < 11) {
                    int convertedToInt2 = Integer.parseInt(exampleDel[8]);

                    switch (exampleDel[6]) {

                        case "+":
                            int result4 = result1 + convertedToInt2;
                            System.out.println(result4);
                            break;

                        case "-":
                            int result5 = result1 - convertedToInt2;
                            System.out.println(result5);
                            break;

                        case "*":
                            int result6 = convertedToInt - convertedToIht1 * convertedToInt2;
                            System.out.println(result6);
                            break;

                        case "/":
                            int result7 = convertedToInt - convertedToIht1 / convertedToInt2;
                            System.out.println(result7);
                            break;
                    }
                } else if (exampleDel.length == 5) {
                    System.out.println(result1);
                } else {
                    System.out.println("Invalid amount of numbers!");
                }
            break;



            case "*":
                int result2 = convertedToInt * convertedToIht1;
                    if (exampleDel.length > 5 && exampleDel.length < 11) {
                        int convertedToInt2 = Integer.parseInt(exampleDel[8]);

                        switch (exampleDel[6]) {

                            case "+":
                                int result4 = result2 + convertedToInt2;
                                System.out.println(result4);
                                break;

                            case "-":
                                int result5 = result2 - convertedToInt2;
                                System.out.println(result5);
                                break;

                            case "*":
                                int result6 = convertedToInt * convertedToIht1 * convertedToInt2;
                                System.out.println(result6);
                                break;

                            case "/":
                                int result7 = convertedToInt * convertedToIht1 / convertedToInt2;
                                System.out.println(result7);
                                break;
                        }
                    } else if (exampleDel.length == 5) {
                        System.out.println(result2);
                    } else {
                        System.out.println("Invalid amount of numbers!");
                    }
            break;



            case "/":
                 int result3 = convertedToInt / convertedToIht1;
                    if (exampleDel.length > 5 && exampleDel.length < 11) {
                        int convertedToInt2 = Integer.parseInt(exampleDel[8]);

                        switch (exampleDel[6]) {

                            case "+":
                                int result8 = result3 + convertedToInt2;
                                System.out.println(result8);
                                break;

                            case "-":
                                int result9 = result3 - convertedToInt2;
                                System.out.println(result9);
                                break;

                            case "*":
                                int result10 = convertedToInt / convertedToIht1 * convertedToInt2;
                                System.out.println(result10);
                                break;

                            case "/":
                                int result11 = convertedToInt / convertedToIht1 / convertedToInt2;
                                System.out.println(result11);
                                break;

                        }
                    } else if (exampleDel.length == 5) {
                        System.out.println(result3);
                    } else {
                        System.out.println("Invalid amount of numbers!");
                    }
            break;
        }
    }
}

