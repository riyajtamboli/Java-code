void main(){
	IO.print("Enter your salary : ");
	String sal = IO.readln();
	double salary = Double.parseDouble(sal);
	IO.println("Your salary is : "+salary);
	Double bonus;
	if(salary > 50000){
		bonus = 5000D;
	}else{
		bonus = 3000D;
	}
	
	IO.println("Your Bonus : "+bonus);
	Double totalSalary = salary + bonus;
	IO.println("Total Salary : "+totalSalary);
}