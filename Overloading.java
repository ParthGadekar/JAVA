class MOverloading {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
class Overloading{
    public static void main(String[] args){
        MOverloading O = new MOverloading();
        System.out.println(O.add(55,88));
        System.out.println(O.add(9,10,20));
    }
}
