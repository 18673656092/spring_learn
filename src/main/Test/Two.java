class Two{
    Byte x;
}
abstract class Three{
   abstract void s();
}
class PassO{
    public static void main(String[] args){
        PassO p=new PassO();
        p.start();
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
    void start(){
        Two t=new Two();
        System.out.print(t.x+" ");
        Two t2=fix(t);
        System.out.print(t.x+" "+t2.x);
    }
    Two fix(Two tt){
        tt.x=42;
        return tt;
    }
}