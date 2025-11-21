import java.util.*;
void main(){
	IO.print("Enter your gender [M/F] : ");
	String gen = IO.readln();
	if(gen == "M"){
		IO.println("Your gender is : "+gen);
		IO.print("Welcome Sir");
	}else{
		IO.println("Your gender is : "+gen);
		IO.println("Welcome Madam");
	}
	  
}