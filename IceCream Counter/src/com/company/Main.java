package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Creamer Jake = new Creamer();
        Creamer John = new Creamer();
        boolean johnlive = true;
        boolean jakelive = true;
        boolean x = true;
        while (x) {
            if (John.cream > 5) {
                if (John.cream < 10) {
                    System.out.print("John is feeling unwell...\n");
                } else {
                    if (John.cream < 15) {
                        System.out.print("John is vomiting\n");
                    } else {
                        if (John.cream > 14) {
                            if (John.cream > 19) {
                                System.out.print("John died of sugar poisoning\n");
                                johnlive = false;
                            } else {
                                System.out.print("John really doesnt want more\n");
                            }
                        }
                    }
                }
            }
            if (Jake.cream > 5) {
                if (Jake.cream < 10) {
                    System.out.print("Jake is feeling unwell...\n");
                } else {
                    if (Jake.cream < 15) {
                        System.out.print("Jake is vomiting\n");
                    } else {
                        if (Jake.cream > 14) {
                            if (Jake.cream > 19) {
                                System.out.print("Jake died of sugar poisoning\n");
                                jakelive = false;
                            } else {
                                System.out.print("Jake really doesnt want more\n");
                            }
                        }
                    }
                }
            }
            System.out.print("The total Ice Creams eaten is " + Creamer.publiccream + "\n");
            if (John.cream == 1) {
                System.out.print("John has eaten " + John.cream + " Ice Cream\n");
            } else {
                System.out.print("John has eaten " + John.cream + " Ice Creams\n");
            }
            if (Jake.cream == 1) {
                System.out.print("Jake has eaten " + Jake.cream + " Ice Cream\n");
            } else {
                System.out.print("Jake has eaten " + Jake.cream + " Ice Creams\n");
            }
            System.out.print("Who should eat the next Ice Cream? (John/Jake)\n");
            Scanner reader = new Scanner(System.in);
            String Person = reader.next();
            if (Person.equals("Jake")) {
                if (jakelive) {
                    Jake.addCream();
                } else {
                    System.out.print("Jake is dead...\n");
                }
            } else if (Person.equals("John")) {
                if (johnlive) {
                    John.addCream();
                } else {
                    System.out.print("John is dead...\n");
                }
            } else {
                System.out.print("Please say a correct name. Remember that its cap sensitive!\n");
            }
            System.out.print("\n");
            if (!johnlive) {
                if (!jakelive) {
                    while (x){
                        for(int y = 1; y == 5; y = y + 1){
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                        System.out.print("Everyone is dead...\n");
                        System.out.print("Press any key to continue...\n");
                        for(int y = 1; y == 100; y = y + 1){
                            System.out.print("\b");
                        }
                        Scanner unreader = new Scanner(System.in);
                        String pause = unreader.next();
                    }
                }
            }
        }
    }
}
class Creamer{
    public static int publiccream = 0;
    public int cream = 0;
    public void addCream(){
        publiccream=publiccream+1;
        cream=cream+1;
    }
}