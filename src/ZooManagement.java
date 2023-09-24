import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        //----------------------------------Instruction 1------------------------------
        System.out.println("\n");
        int NbrCages = 20;
        String zooName ="my zoo";
        System.out.println(zooName+" comporte "+ NbrCages +" Cages");

        //----------------------------------Instruction 2------------------------------
        boolean info = false;
        System.out.println("\n");
        while(!info) {
            boolean hasAllCharacters = true;
            System.out.println(" what's your zoo name? ");
            Scanner zooN = new Scanner(System.in);
            String zooName1 = zooN.nextLine().toLowerCase();
            for (char c : zooName1.toCharArray()) {
                if (!Character.isLetter(c)) {
                    hasAllCharacters = false;
                }
            }
            if (!hasAllCharacters) {
                System.out.println("the name of the zoo should contain only characters");
            } else {
                System.out.println(" how many cages do you have? ");
                Scanner NumC = new Scanner(System.in);
                int NbrCages1 = NumC.nextInt();
                if (NbrCages1 < 0) {
                    System.out.println("the number of cages should be positive");
                } else {
                    System.out.println("my zoo name is " + zooName1 + " and it have " + NbrCages1 + " Cages");
                    info = true;

                }
            }
        }
    }
}
