import java.util.Scanner; // Импортируем класс Scanner для чтения ввода с клавиатуры

public class gabderahman { // Определяем класс GCD (наибольший общий делитель)
    
    // Метод для вычисления НОД (наибольшего общего делителя) с использованием рекурсии и тернарного оператора
    public static int gcd(int a, int b) {
        // Если b равно 0, возвращаем a как НОД; иначе рекурсивно вызываем метод gcd с параметрами b и a % b
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) { // Главный метод программы
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для чтения ввода

        System.out.print("Введите первое число: "); // Запрашиваем у пользователя первое число
        int num1 = scanner.nextInt(); // Читаем первое число с клавиатуры

        System.out.print("Введите второе число: "); // Запрашиваем у пользователя второе число
        int num2 = scanner.nextInt(); // Читаем второе число с клавиатуры

        int result = gcd(num1, num2); // Вызываем метод gcd для вычисления НОД двух введенных чисел
        // Выводим результат на экран
        System.out.println("Наибольший общий делитель (" + num1 + ", " + num2 + ") = " + result);

        scanner.close(); // Закрываем объект Scanner для освобождения ресурсов
    }
}
