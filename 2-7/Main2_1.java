public class Main2_1 {
    public static void main(String[] args) {

        int price = 2500;
        double rate = 0.2;

        double discount = price * rate;
        double salePrice = price - discount;

        System.out.println("割引額は" + (int)discount + "円です。");
        System.out.println("販売価格は" + (int)salePrice + "円です。");
    }
}
