public class Main5_2 {
    public static void main(String[] args) {

        int notePrice = 280;
        int noteCount = 2;

        int pencilPrice = 120;
        int pencilCount = 3;

        int eraserPrice = 100;
        int eraserCount = 1;

        int subtotal = (notePrice * noteCount)
                     + (pencilPrice * pencilCount)
                     + (eraserPrice * eraserCount);

        int tax = (int)(subtotal * 0.1);

        int total = subtotal + tax;

        int payment = 1500;

        int change = payment - total;

        System.out.println("小計： " + subtotal + "円");
        System.out.println("消費税： " + tax + "円");
        System.out.println("合計金額： " + total + "円");
        System.out.println("おつり: " + change + "円");
    }
}