void main(){
	IO.println("Enter age : ");
	String a = IO.readln();
	int age = Integer.parseInt(a);
	IO.println("Your age is :"+age);
	
if(age>17){
	IO.println("You are allowed in the theatre for a movie.");
}else{
	IO.println("You are minor, wait for some time");
}
	
	
}