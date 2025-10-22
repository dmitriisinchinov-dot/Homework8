public class Main {
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
        if ((years % 400 == 0) || (years % 4 == 0 && years % 100 != 0)) {
            System.out.println(years + " год является високосным");
        } else if (years < 1584) {
            System.out.println(years + " год не является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }
    }
    public static void printDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потреуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
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
    public static void main(String[] args) {
        task1();
        printLeapYears(2011);
        task2();
        showMessage(2010, 1);
        task3();
        printDays(150);
    }
}



