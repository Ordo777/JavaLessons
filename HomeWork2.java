public class HomeWork2 {
    public static void main(String[] args) {
        int Sec = 1000000;
        int days = Sec / 86400;
        int hour = (Sec % 86400) / 3600;
        int minuts = (Sec - (days * 86400) - (hour * 3600) ) / 60;
        int LeftSec = Sec - days * 86400 - hour * 3600 - minuts * 60;
        System.out.println("Количество дней :" + days);
        System.out.println("Количество часов :" + hour);
        System.out.println("Количество минут :" + minuts);
        System.out.println("Количество оставшихся секунд :" + LeftSec );
    }
}
