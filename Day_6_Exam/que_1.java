void main(){
    IO.println("ArmStrong Number is : " );
    int strongNumber = 0;
    for(int i=1; i<=1000; i++){
        int temp = i;
        int count = 0;
        int sum = 0;
        
        while(temp != 0){
            int ld = temp % 10;
            int fact = 1;
            for(int j=1; j<=ld; j++){
                fact *=j; 
            }
            sum = sum +fact;
            temp /= 10;
        }
        
        if(i == sum){
        IO.print(i + " ");
        strongNumber += i;
        }
    }
    IO.print("\n");
    IO.print( strongNumber + " ");
}