
public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения
        int balans = startingScore + replenishment; // баланс

        int bonus; // бонусы
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счёт: " + (balans + bonus));
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}