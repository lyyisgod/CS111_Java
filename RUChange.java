public class RUChange{
    public static void main(String[] args)
    {
        int centsDue=Integer.parseInt(args[0]);
        int quarters=0;
        int dimes=0;
        int nickels=0;
        int pennies=0;
        if(centsDue<0)
        {
            System.out.println("Invalid input!");
            return;

        }
        else{

    
        while(centsDue/25>0)
        {
            centsDue-=25;
            quarters++;
        }
        while(centsDue/10>0)
        {
            centsDue-=10;
            dimes++;
        }
        while(centsDue/5>0)
        {
            centsDue-=5;
            nickels++;
        }
        while(centsDue/1>0)
        {
            centsDue-=1;
            pennies++;
        }
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+pennies);
        }
    }
}