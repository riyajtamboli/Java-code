void main(){
    int a = Integer.parseInt(IO.readln());
    int b = Integer.parseInt(IO.readln());
    int c = Integer.parseInt(IO.readln());

    if(a> b && a>c){
        IO.println(a + " is greater number");
    }else if(b>a && b>c){
        IO.println(b + " is greater number");
    }else{
        IO.println(c + " is greater number");
    }

    IO.println("Sum : "+(a+b+c));
    IO.println("Avg : " + (double) (a+b+c)/3);

}