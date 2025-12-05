import java.util.Scanner;

public class Main8_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("攻撃力を入力してください: ");
        int atk = scan.nextInt();

        System.out.print("防御力を入力してください: ");
        int def = scan.nextInt();

        int normal = atk - def;

        double criTemp = normal * 1.5;
        int critical = (int)criTemp;

        System.out.println("通常ダメージ: " + normal);
        System.out.println("クリティカルダメージ: " + critical);

        scan.close();
    }
}
