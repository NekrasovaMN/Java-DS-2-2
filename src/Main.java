
public class Main {
    public static void main(String[] args) {

        int x = 100; // начальный счет
        int y = 1100; // сумма пополнения
        int balans = x + y; // баланс

        int bonus; // бонусы
        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счёт: " + (balans + bonus));
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}