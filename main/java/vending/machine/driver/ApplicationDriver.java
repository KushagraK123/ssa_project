package vending.machine.driver;

import vending.machine.mda_efsm.VM1;
import vending.machine.mda_efsm.VM2;

import java.util.Scanner;

/**
 * APPLICATION DRIVER ELEMENT
 * User Interface for using Vending Machine application.
 * <p>
 * This class is the trigger point when the jar is executed.
 * This class manages the user interface, interprets the choices to invoke desired events and actions.
 *
 * @author Kushagra Kasliwal
 */
public class ApplicationDriver {

    public static void main(String[] args) {
        System.out.println("\n###########################");
        System.out.println("Vending Machine System!");
        System.out.println("###########################");
        String choice = "";

		Scanner input = new Scanner(System.in);

		while (!choice.equals("Q")) {
            System.out.println("1.VM-1\t2.VM-2\tQ.Exit\nMake Your Choice: ");
            choice = input.next();

            switch (choice) {
                case "1" -> {
                    System.out.println("\n****************VM-1****************");
                    printBorder();
                    System.out.println("Menu options are shown after choosing VM. Please note down the choices.");
                    System.out.println("""
							0.create\t1.coin\t2.card\t3.sugar\t4.cappuccino\t5.chocolate
							6.insert_cups\t7.set_price\t8.cancel\tQ.Exit Driver""");
                    printBorder();
                    vm1Driver();
                }
                case "2" -> {
                    System.out.println("****************VM-2****************");
                    printBorder();
                    System.out.println("Menu options are shown after choosing VM. Please note down the choices.");
                    System.out.println("0.CREATE\t1.COIN\t2.SUGAR\t3.CREAM\t4.COFFEE\n5.InsertCups\t6.SetPrice\t7.Cancel\t"
                            + "Q.Exit Driver");
                    printBorder();
                    vm2Driver();
                }
                case "Q" -> System.out.println("Thank you.Please Visit Again!!");
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static void vm1Driver() {
        String choice = "";
        VM1 vendingMachine1 = new VM1();
		Scanner input = new Scanner(System.in);

		while (!choice.equals("Q")) {
            System.out.print("Please make a choice? ");
            choice = input.next();
			float a;
			switch (choice) {
				case "0" -> {
					System.out.println("Executing create(float p)");
					System.out.print("Enter float value for p: ");
					a = input.nextFloat();
					vendingMachine1.create(a);
				}
				case "1" -> {
					System.out.println("\nExecuting coin(float v)..\n");
					System.out.print("Enter float value for v: ");
					a = input.nextFloat();
					vendingMachine1.coin(a);
				}
				case "2" -> {
					System.out.println("\nExecuting card(float v)..\n");
					System.out.print("Enter float value for v: ");
					a = input.nextFloat();
					vendingMachine1.card(a);
				}
				case "3" -> {
					System.out.println("\nExecuting sugar()..\n");
					vendingMachine1.sugar();
				}
				case "4" -> {
					System.out.println("\nExecuting cappuccino()..\n");
					vendingMachine1.cappuccino();
				}
				case "5" -> {
					System.out.println("\nExecuting chocolate()..\n");
					vendingMachine1.chocolate();
				}
				case "6" -> {
					System.out.println("\nExecuting insert_cups(n)..\n");
					System.out.print("Enter int value for n: ");
					int n = input.nextInt();
					vendingMachine1.insert_cups(n);
				}
				case "7" -> {
					System.out.println("\nExecuting set_price(float p)..\n");
					System.out.print("Enter float value for p: ");
					a = input.nextFloat();
					vendingMachine1.set_price(a);
				}
				case "8" -> {
					System.out.println("\nExecuting cancel()..\n");
					vendingMachine1.cancel();
				}
				case "Q" -> System.out.println("\nExiting driver.. Q pressed\n");
				default -> System.out.println("\nInvalid choice\n");
			}
        }
    }


    public static void vm2Driver() {
        String choice = "";
        VM2 vendingMachine2 = new VM2();
		int a;
		Scanner input = new Scanner(System.in);

        while (!choice.equals("Q")) {
            System.out.print("Please make a choice? ");

            choice = input.next();
			switch (choice) {
				case "0" -> {
					System.out.println("Executing CREATE(int p)");
					System.out.print("Enter int value for p: ");
					a = input.nextInt();
					vendingMachine2.CREATE(a);
				}
				case "1" -> {
					System.out.println("\nExecuting COIN(int v)..\n");
					System.out.print("Enter int value for v: ");
					a = input.nextInt();
					vendingMachine2.COIN(a);
				}
				case "2" -> {
					System.out.println("\nExecuting SUGAR()..\n");
					vendingMachine2.SUGAR();
				}
				case "3" -> {
					System.out.println("\nExecuting CREAM()..\n");
					vendingMachine2.CREAM();
				}
				case "4" -> {
					System.out.println("\nExecuting COFFEE()..\n");
					vendingMachine2.COFFEE();
				}
				case "5" -> {
					System.out.println("\nExecuting InsertCups(n)..\n");
					System.out.print("Enter int value for n: ");
					a = input.nextInt();
					vendingMachine2.InsertCups(a);
				}
				case "6" -> {
					System.out.println("\nExecuting SetPrice(p)..\n");
					System.out.print("Enter int value for p: ");
					a = input.nextInt();
					vendingMachine2.SetPrice(a);
				}
				case "7" -> {
					System.out.println("\nExecuting CANCEL()..\n");
					vendingMachine2.CANCEL();
				}
				case "Q" -> System.out.println("\nExiting driver.. Q pressed\n");
				default -> System.out.println("\nInvalid choice\n");
			}

        }
    }

    public static void printBorder() {
        System.out.println("======================================================================================");
    }
}
