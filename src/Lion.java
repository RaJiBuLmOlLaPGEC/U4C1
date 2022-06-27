public class Lion {
    static String name="Jack";
    static boolean isHungry=true;
    static int age=15;
    static int totalDeaths=25;
    public static void printKillings(){
        System.out.println("Total killings by lions in jungle ="+totalDeaths);
    }
    public static void thinking(){
        if(isHungry==false)
        {
            System.out.println(name+" "+"is sleeping");
        }
        else if (isHungry=true && age>=12)
        {
            totalDeaths+=2;
            System.out.println(name+" has eaten two animal");
        }
        else if(isHungry=true && age<=12 && age >=2)
        {
            totalDeaths+=1;
            System.out.println(name+" has eaten one animal");
        }
        else if(isHungry=true && age<=2)
        {
            System.out.println(name+" is calling Mom");
        }
    }
    public static void main(String[] args){
        printKillings();
        thinking();
    }
}
