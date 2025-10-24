import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        int theYear = 1576;
        printLeapYears(theYear);
        System.out.println();
        task2();
        System.out.println();
        int currentYear = 2030;
        int OS = 0;
        showMessage(OS, currentYear);
        System.out.println();
        task3();
        System.out.println();
        System.out.println("Потребуется дней " + printAmountDays(110));
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
            ;
            return term;
        } else if (deliveryDistance <= 60) {
            term += 1;
            return term;
        } else if (deliveryDistance <= 100) {
            term += 2;
            return term;
        } else {
            System.out.println("Доставка недоступна на расстояне более более 100 км");
            return 0;
        }
    }
    public static void showMessage(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) { // Сравниваем с текущим годом
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке.");
            }
        }
    }
}



