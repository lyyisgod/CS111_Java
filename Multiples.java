public class Multiples {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        boolean theFirstIsZero=(num1==0);
        boolean theSecondIsZero=(num2==0);
        boolean isMultiple=(!theSecondIsZero)&&(num1%num2==0);
        boolean result=theFirstIsZero || theSecondIsZero || isMultiple;
        System.out.println(result);


    }
}