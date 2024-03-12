//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] spending = new int[5];
        spending[0] = 47000;
        spending[1] = 53000;
        spending[2] = 58000;
        spending[3] = 67000;
        spending[4] = 71000;
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum += spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        int[] spending1 = new int[5];
        spending1[0] = 7_000;
        spending1[1] = 11_000;
        spending1[2] = 34_000;
        spending1[3] = 98_000;
        spending1[4] = 120_000;
        int minSum = 2000000;
        int maxSum = -1;
        for (int i : spending1) {
            if (i > maxSum) {
                maxSum = i;
            }
            if (i < minSum) {
                minSum = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей");

        //Задача 3

        int[] midSpend = {112, 9849, 654654, 32159, 1111};
        midSpend [0] = 112;
        int sum1 = 0;
        for (int j : midSpend)  {
            sum1 += j;
        }
        double average = sum1 / midSpend.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


