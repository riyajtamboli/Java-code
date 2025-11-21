void main(String args[]){
	int num = Integer.parseInt(args[0]);
	int lastDigit = num % 10;
	num = num / 10;
	IO.println("Sum of two digit number :"+(num+lastDigit));
}