void main(String args[]){
	int income = Integer.parseInt(args[0]);
	final double TAX = 4.9;
	double taxAmount = (income) * (TAX /100);
	IO.println("Tax amount :"+taxAmount);

}