public class Main6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("現在の経験値を入力してください: ");
        String input = scanner.nextLine();

        int currentExp = Integer.parseInt(input);

        int bonusExp = (int)(currentExp * 0.25);

        int newExp = currentExp + bonusExp;

        System.out.println("ボーナス経験値: " + bonusExp);
        System.out.println("増加後の経験値: " + newExp);

        scanner.close();
    }
}
