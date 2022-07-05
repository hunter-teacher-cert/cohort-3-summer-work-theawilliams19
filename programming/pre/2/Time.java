public class Time {
public static void main(String[]args){
int hour = 18;
int minute = 8;
int second = 58; 
System.out.print("Number of seconds since midnight: ");
System.out.println(hour*3600+minute*60+second);
System.out.println("Number of seconds remaining in the day: ");
System.out.println(86400-(hour*3600+minute*60+second));
System.out.println("Percentage of the day that has passed: ");
System.out.println(65338*100/86400);
int hournow = 19;
int minutenow = 57;
int secondnow = 55;
System.out.print("Number of seconds since midnight until now: ");
System.out.println(hournow*3600+minutenow*60+secondnow);
System.out.println("Elapsed time (number of seconds) since I started working on this exercise: ");
System.out.println(71875-65338);
}
}