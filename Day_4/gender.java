void main(){
	IO.print("Enter your gender [M/F] : ");
	String gen = IO.readln();
	char ch = gen.charAt(0);
	if(ch == 'M'){
		IO.println("Your gender is : "+gen);
		IO.print("Welcome Sir");
	}else{
		IO.println("Your gender is : "+gen);
		IO.println("Welcome Madam");
	}
	  
}

