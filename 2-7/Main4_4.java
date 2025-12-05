public class Main4_4 {
    public static void main(String[] args) {

        double maxHp = 500.0;
        double hpRate = 83.7;

        double currentHpDouble = maxHp * (hpRate / 100);

        int currentHp = (int) currentHpDouble;

        System.out.println("現在HP: " + currentHp);
    }
}
