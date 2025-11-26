void main(){
    String n = IO.readln("Enter number : ");
    int num = Integer.parseInt(n);

    if(num < 0){
        IO.println("Enter valid number");
        return;
    }
    int count = 0;
    for(int i=2; i<num; i++){
        if(num % i == 0){
            count++;
        }
    }

    if(count >= 2){
        IO.println("Number is not prime.");
    }else{
        IO.println(num + " is Prime Number.");      
    }
}