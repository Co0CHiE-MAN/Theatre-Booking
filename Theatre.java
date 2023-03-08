import java.util.Scanner;

public class Theatre {
        static void seats(String[] row1, String[] row2, String[] row3) {
                System.out.println("""

                                                         __________________________________
                                                        |                                  |
                                                        |            Stage here            |
                                                        |__________________________________|
                                """);

                /*---------------       row 1      ------------------- */

                System.out.print("                | ");
                for (int i = 0; i < row1.length; i++) {
                        if (i == 6) {
                                System.out.print("  | ");
                        }
                        System.out.print(row1[i] + " | ");
                }
                System.out.println();
                System.out.println();

                /*---------------       row 2      ------------------- */

                System.out.print("        | ");
                for (int i = 0; i < row2.length; i++) {
                        if (i == 8) {
                                System.out.print("  | ");
                        }
                        System.out.print(row2[i] + " | ");
                }
                System.out.println();
                System.out.println();

                /*---------------       row 3      ------------------- */

                System.out.print("| ");
                for (int i = 0; i < row3.length; i++) {
                        if (i == 10) {
                                System.out.print("  | ");
                        }
                        System.out.print(row3[i] + " | ");
                }

                System.out.println();
                System.out.println();

        }

        static void buy_tickets(String[] row1, String[] row2, String[] row3) {
                Scanner seatsScanner = new Scanner(System.in);
                boolean repeatBuy = true;
                boolean repeatOpt = true;

                while (repeatBuy == true) {
                        System.out.print("Pls enter row number : ");
                        int rowNum = seatsScanner.nextInt();
                        System.out.print("Pls enter seat number : ");
                        int seatNum = seatsScanner.nextInt();

                        switch (rowNum) {
                                case 1:
                                        if (row1[seatNum - 1] == "O") {
                                                System.out.println("Available");
                                                System.out.print("Do you want to buy this seat? (Y/N) : ");
                                                char confirmBuy = seatsScanner.next().charAt(0);
                                                if (confirmBuy == 'y') {
                                                        System.out.println("Booked");
                                                        row1[seatNum - 1] = "X";
                                                }
                                                repeatBuy = false;
                                        } else {
                                                System.out.println("Sorry that seat is already taken.");
                                        }
                                        break;
                                case 2:
                                        if (row2[seatNum - 1] == "O") {
                                                System.out.println("Available.");
                                                System.out.print("Do you want to buy this seat? (Y/N) : ");
                                                char confirmBuy = seatsScanner.next().charAt(0);
                                                if (confirmBuy == 'y') {
                                                        System.out.println("Booked");
                                                        row2[seatNum - 1] = "X";
                                                }
                                                repeatBuy = false;
                                        } else {
                                                System.out.println("Sorry that seat is already taken.");
                                        }
                                        break;
                                case 3:
                                        if (row3[seatNum - 1] == "O") {
                                                System.out.println("Available");
                                                System.out.print("Do you want to buy this seat? (Y/N) : ");
                                                while (repeatOpt == true) {

                                                }
                                                char confirmBuy = seatsScanner.next().charAt(0);
                                                switch (confirmBuy) {
                                                        case 'y':
                                                                System.out.println("Booked");
                                                                row3[seatNum - 1] = "X";
                                                                break;
                                                        case 'n':
                                                                break;
                                                        default:
                                                                System.out.println("Invalid option!");
                                                                repeatOpt = true;
                                                                return;
                                                }

                                                repeatBuy = false;
                                        } else {
                                                System.out.println("Sorry that seat is already taken.");
                                        }
                                        break;
                                default:
                                        System.out.println("Invalid row number!");
                                        return;
                        }
                }

                seats(row1, row2, row3);

        }

        static void cancelTicket(String[] row1, String[] row2, String[] row3) {
                Scanner seatsScanner = new Scanner(System.in);
                System.out.print("Pls enter row number : ");
                int rowNum = seatsScanner.nextInt();
                System.out.print("Pls enter seat number : ");
                int seatNum = seatsScanner.nextInt();

                boolean repeatOption = true;

                switch (rowNum) {
                        case 1:
                                if (row1[seatNum] == "X") {
                                        while (repeatOption == true){
                                                System.out.print("Do you want to cancel this seat? (Y/N) : ");
                                                char confirmBuy = seatsScanner.next().charAt(0);
                                                switch (confirmBuy) {
                                                        case "Y":
                                                                row1[seatNum] = "O";
                                                                repeatOption = false;
                                                                break;

                                                        case "N":
                                                                repeatOption = false;
                                                                break;

                                                        default:
                                                                repeatOption = true;
                                                                return;
                                                }
                                        }
                                }
                        case 2:
                                if (row1[seatNum] == "X") {
                                        while (repeatOption == true)
                                                System.out.print("Do you want to cancel this seat? (Y/N) : ");
                                        char confirmBuy = seatsScanner.next().charAt(0);
                                        switch (confirmBuy) {
                                                case "Y":
                                                        row2[seatNum] = "O";
                                                        repeatOption = false;
                                                        break;

                                                case "N":
                                                        repeatOption = false;
                                                        break;
                                                        

                                                default:
                                                        repeatOption = true;
                                                        return ;
                                        }

                                }
                        case 3:
                                if (row1[seatNum] == "X") {
                                        while (repeatOption == true)
                                                System.out.print("Do you want to cancel this seat? (Y/N) : ");
                                        char confirmBuy = seatsScanner.next().charAt(0);
                                        switch (confirmBuy) {
                                                case "Y":
                                                        row3[seatNum] = "O";
                                                        repeatOption = false;
                                                        break;

                                                case "N":
                                                        repeatOption = false;
                                                        break;
                                                default:
                                                        repeatOption = true;
                                                        return;
                                        }

                                }

                }
        }

        public static void main(String[] args) {
                Scanner myScanner = new Scanner(System.in);
                int optionnum = 1;

                /*
                 * System.out.println("""
                 * | O | O | O | O | O | O | | O | O | O | O | O | O |
                 * """);
                 * System.out.println("""
                 * | O | O | O | O | O | O | O | O | | O | O | O | O | O | O | O | O |
                 * """);
                 * System.out.println("""
                 * | O | O | O | O | O | O | O | O | O | O | | O | O | O | O | O | O | O | O | O
                 * | O |
                 * """);
                 */

                String[] row1 = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O" };
                String[] row2 = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O" };
                String[] row3 = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O",
                                "O", "O", "O" };

                seats(row1, row2, row3);
                /*----------------------------------------------------------------------------------------------------------- */

                System.out.println("""
                                -------------------------------------------------

                                Please select an option:
                                1) Buy a ticket
                                2) Print seating area
                                3) Cancel ticket
                                4) List available seats
                                5) Save to file
                                6) Load from file
                                7) Print ticket information and total price
                                8) Sort tickets by price

                                0) Quit

                                        """);

                while (optionnum != 0) {
                        System.out.print("""

                                        -------------------------------------------------

                                        Enter option:  """);
                        System.out.print(' ');
                        optionnum = myScanner.nextInt();

                        System.out.println();
                        switch (optionnum) {

                                case 0:
                                        System.out.println("""
                                                        Thank you! Have a nice day!
                                                        """);
                                        break;
                                case 1:
                                        System.out.println("option 1");
                                        buy_tickets(row1, row2, row3);
                                        break;
                                case 2:
                                        System.out.println("option 2");
                                        seats(row1, row2, row3);
                                        break;
                                case 3:
                                        System.out.println("option 3");
                                        cancelTicket(row1, row2, row3);
                                        break;
                                case 4:
                                        System.out.println("option 4");
                                        break;
                                case 5:
                                        System.out.println("option 5");
                                        break;
                                case 6:
                                        System.out.println("option 6");
                                        break;
                                case 7:
                                        System.out.println("option 7");
                                        break;
                                case 8:
                                        System.out.println("option 8");
                                        break;
                                default:
                                        System.out.println("Invalid option number");
                                        return;

                        }
                }

        }
}