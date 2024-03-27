package HeroBattle;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hero[] heroarray = new Hero[2]; 

        Hero hero1 = new Hero();
        System.out.print("Permainan adu hero\n" + "Player 1 : Silahkan masukkan hero Anda!\n" +
                "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n" +
                "============================\n");

        System.out.printf("%-10s : ", "Nama Hero");
        String heroName = input.nextLine();
        System.out.printf("%-10s : ", "HP");
        double hp = input.nextDouble();
        System.out.printf("%-10s : ", "Attack");
        double attack = input.nextDouble();
        System.out.printf("%-10s : ", "Defense");
        double defense = input.nextDouble();
        input.nextLine(); 
        System.out.println();

        hero1.setName(heroName);
        hero1.setHp(hp);
        hero1.setAttack(attack);
        hero1.setDefense(defense);

        heroarray[0] = hero1; 

        System.out.print("Player 2 : Silahkan masukkan hero Anda!\n" +
                "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n" +
                "============================\n");

        System.out.printf("%-10s : ", "Nama Hero");
        heroName = input.nextLine();
        System.out.printf("%-10s : ", "HP");
        hp = input.nextDouble();
        System.out.printf("%-10s : ", "Attack");
        attack = input.nextDouble();
        System.out.printf("%-10s : ", "Defense");
        defense = input.nextDouble();
        input.nextLine(); 
        System.out.println();

        Hero hero2 = new Hero(heroName, hp, attack, defense); 
        heroarray[1] = hero2; 

        for (int round = 1;; round++) {
            System.out.print("============================\n" +
                    "============================\n");
            System.out.println("Round " + round);
            System.out.println(heroarray[0].getName() + " menyerang " + heroarray[1].getName());
            System.out.println();

            System.out.println(heroarray[0].getName() + " menyerang sebesar " + heroarray[0].getAttack());
            System.out.println(heroarray[1].getName() + " memiliki pertahanan sebesar " + heroarray[1].getDefense());
            heroarray[0].attack(heroarray[1]);
            System.out.println("Health " + heroarray[1].getName() + " saat ini sebesar " + heroarray[1].getHp());
            System.out.println();

            if (heroarray[1].getHp() == 0) {
                System.out.println("Pertarungan telah usai!");
                System.out.println(heroarray[1].getName() + " telah kalah!\n" +
                        "============================\n" +
                        heroarray[0].getName() + " adalah pemenangnya!");
                break;
            }

            System.out.println(heroarray[1].getName() + " menyerang " + heroarray[0].getName());
            System.out.println();

            System.out.println(heroarray[1].getName() + " menyerang sebesar " + heroarray[1].getAttack());
            System.out.println(heroarray[0].getName() + " memiliki pertahanan sebesar " + heroarray[0].getDefense());
            heroarray[1].attack(heroarray[0]);
            System.out.println("Health " + heroarray[0].getName() + " saat ini sebesar " + heroarray[0].getHp());
            System.out.println();

            if (heroarray[0].getHp() == 0) {
                System.out.println("Pertarungan telah usai!");
                System.out.println(heroarray[0].getName() + " telah kalah!\n" +
                        "============================\n" +
                        heroarray[1].getName() + " adalah pemenangnya!");
                break;
            }
        }
        input.close();
    }
}