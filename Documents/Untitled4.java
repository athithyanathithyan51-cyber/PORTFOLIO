class SingleTon{
    static SingleTon x=new SingleTon();
    private SingleTon(){
        if(x== null){
            this.x=new SingleTon();
        }
    }
}



public class Untitled4 {
    public static void main(String[] args) {
        System.out.print(SingleTon.x);
        System.out.print(SingleTon.x);
        System.out.print(SingleTon.x);
    }
}