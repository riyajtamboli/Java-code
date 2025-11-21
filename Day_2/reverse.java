void main(){
	IO.print("Enter number :" );
	String n = IO.readln();
	int num = Integer.parseInt(n);
	int lastDigit = num%10;
	num = num / 10;
	int secondDigit = num % 10;
	num = num / 10;
	IO.print("number is :"+lastDigit+secondDigit+num);
}
