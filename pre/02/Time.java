public class Time {
  public static void main(String[] args){
    int hour = 16;
    int minute = 56;
    int second = 35;
    System.out.println("Number of seconds since midnight:");
    double firstTime = (hour * 60 *60)+(minute * 60)+second;
    System.out.println(firstTime);
    System.out.println("Number of seconds remaining in the day:");
    System.out.println((24*60*60)-(firstTime));
    System.out.println("Percentage of the day that has passed:");
    System.out.println((firstTime / (24.0*60.0*60.0) * 100.0));
    hour = 17;
    minute = 7;
    second = 0;
    double secondTime = (hour * 60 *60)+(minute * 60)+second;
    System.out.println("Minutes elapsed writing this code:");
    System.out.println((secondTime - firstTime) / 60.0);
  }
}
