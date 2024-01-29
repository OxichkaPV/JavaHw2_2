public class Main {
    public static void main(String[] args) {
        int sumN = 100; // Начальная сумма
        int sumP = 1100; // Сумма пополнения
        int bonus = 100; // Критерий бонуса
        int sumAll = 0;
        if (sumP > 1000) {
            sumAll = sumN + sumP + (sumP / bonus);
        } else {
            sumAll = sumN + sumP;
        }
        System.out.println("Сумма на счете " + sumN);
        System.out.println("Сумма пополнения " + sumP);
        System.out.println("Бонусные рубли " + sumP/bonus);
        System.out.println("Итоговая сумма " + sumAll);
    }
}