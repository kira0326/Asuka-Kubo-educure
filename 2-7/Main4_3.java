public class Main4_3 {
    public static void main(String[] args) {

        double maxHp = 1000.0;
        double hpRate = 12.5;

        double currentHpDouble = maxHp * (hpRate / 100);

        int currentHp = (int) currentHpDouble;

        System.out.println("現在HP: " + currentHp);
    }
}
