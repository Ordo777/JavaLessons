public class HomeWork4 { //Написать программу, которая принимает значение катетов a и b, и выводит на экран значение гипотенузы c. Использовать теорему Пифагора.
    public static void main(String[] args) {
        double a=2;
        double b=2;
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Гипотенуза равна =" + c);

    }
}
