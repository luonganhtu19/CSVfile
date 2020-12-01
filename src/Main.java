import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (true) {
            menu();
            System.out.println(" Choice");
            int choice = checkNumber(" choice menu");
            switch (choice) {
                case 1:
                    Country country = new Country();
                    country = inputData(country);
                    WriterCSV.writeFile(country);
                    break;
                case 2:
                    ReaderCSV.readerCSV();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    return;
                default:
                    System.out.println("");
            }
        }
    }

    public static void menu() {
        System.out.println("Menu :");
        System.out.println("1. Add country in file");
        System.out.println("2. Read data in file");
    }

    public static Country inputData(Country country) {
        System.out.println("input id of country: ");
        country.setId(checkNumber("Input data of type: Integer"));

        System.out.println("input code of country");
        country.setCode(scanner.nextLine());

        System.out.println("Input name of country");
        country.setName(scanner.nextLine());
        return country;
    }

    public static int checkNumber(String mess) {
        boolean check = true;
        int number = -1;
        Scanner input1= new Scanner(System.in);
        while (check) {
            try {
                number =Integer.parseInt(input1.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println("Please again " + mess);
            }
        }
        return number;
    }
}
