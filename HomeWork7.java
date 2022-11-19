public class HomeWork7 {
    //среднее арифмитическое от 0 до 100;
    public static void main(String[] args) {
        int i = 0;
        int summa = 0;
        int col= 100;
        double sr = 0;
        while (i < 100 ){
            i++;
            summa = i+summa;

        }
        System.out.println("Сумма всех чисел равна " + summa);
        sr = summa / 100;
        System.out.println("Среднее арифмитическое равно " + sr);
    }
}
