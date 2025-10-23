public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        printLeapYears(1576);
        System.out.println();
        task2();
        System.out.println();
        showMessage(2025, 1);
        System.out.println();
        task3();
        System.out.println();
        int days = printAmountDays(7);
        System.out.println("Потребуется дней " + days);
    }
    public static void task1() {
        System.out.println("Task 1");
    }
    public static void task2() {
        System.out.println("Task 2");
    }
    public static void task3() {
        System.out.println("Task 3");
    }
    public static void printLeapYears(int years) {
        if (years < 1584) {
            System.out.println(years + " год не является високосным");
        } else if ((years % 400 == 0) || (years % 4 == 0 && years % 100 != 0)) {
            System.out.println(years + " год является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }
    }
    public static int printAmountDays(int deliveryDistance) {
        int term = 1;
        if (deliveryDistance <= 20) {
            return term;
        } else if (deliveryDistance <= 60) {
            term += 1;
            return term;
        } else if (deliveryDistance <= 100) {
           term += 2;
            return term;
        } else {
            return 0;
        }
    }
    public static void showMessage(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
    }
}



