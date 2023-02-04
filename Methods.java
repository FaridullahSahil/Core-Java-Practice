package methods;

public class Methods {
public static void main(String[]args) {
}
static void printnumbers(int startpoint, int endpoint) {
	for(int a=startpoint; a<=endpoint; a++) {
		System.out.println(a);
}}

static void printtime(int hour, int min) {
		System.out.print(hour);
		System.out.print("Heyyy, i made these changes - Farid");
		System.out.print(":");
		System.out.print(min);
		System.out.println("AM/PM");
	}
static int sum(int c, int d) {
	int num=c;
	int num2=d;
	int result=num+num2;
	return result;
}
static int sub(int a, int b) {
	int result=a-b;
	return result;
}
}