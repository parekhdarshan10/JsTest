
@FunctionalInterface
interface squre{
    public int squreNum(int n);
}

class interfaceDemo{
    public static void main(String[] args) {
        squre s = (int n)->n*n;
        System.out.println("square of number is ::" + s.squreNum(5));


    }
}