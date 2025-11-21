void main(String args[]){
	int num = Integer.parseInt(args[0]);
	int count = 0;
	for(int i=2; i<num; i++){
		if(num%i == 0){
			count++;
		}
	}

	if(count>2){
		IO.println("Number is not prime");
	}else{
		IO.println("Number is prime");
	
	}
}