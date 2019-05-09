package base;

public class Son extends father{

    @Override
    public String getName () {
        return null;
    }

    private int a;
    int b=1;
    static int c= 1;

    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        System.out.println(i + ~j);

        int a[] = new int[10];
        int ab[]= {1,2,3,4,5};

        Son s= new Son();
        System.out.println(s.a);
    }


}
