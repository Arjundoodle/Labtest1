interface Interface1{

    public void division();
    public void modulus();



}

class Interface implements Interface1{

    int a=20,b=10;

    public void division(){
    int m=a/b;
    System.out.println("DIvison is equal to" +m);

}

    public void modulus(){
    int n=a%b;
    System.out.println("Modulus is equal to" +n);
}

    public static void main(String args[]){
    Interface1 obj=new Interface();
    obj.division();
    obj.modulus();

}


  


}