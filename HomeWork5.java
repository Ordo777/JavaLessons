public class HomeWork5 {
    /* Задача- Если ночь то вывести надписись пора спать, если погода хорошая и день, то пора гулять
    Если день но плохая погода, то пора читать книгу. не использовать else
     */
    public static void main(String[] args) {
      double time = 14.00;
      int temp = 12;
      boolean DayCircle = time > 8 && time <=19;
      boolean Weather = temp > 20;
      if (!DayCircle){
          System.out.println("Наступила ночь пора спать.");
      }
      if (Weather && DayCircle){
          System.out.println("Хороший день с отличной погодой пора гулять.");
      }
      if (DayCircle && !Weather){
          System.out.println("День, но на улице плохая погода, надо читать");
      }
    }
}
