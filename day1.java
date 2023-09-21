public class day1 {
    public static int Y = 23;

    public static void myFirstPrint (){
        System.out.println("Hello WOOOOOOOOOOOOOORLD!");
        System.out.println(Y);
    }
    public static void myFirstMathClass (){
        int x = 0;
        x = x + 27;
        x = x - 3;
        x = x * 8;
        x = x / 3;
        
        System.out.println(x);
        double cheese = 3;
        double answer = Math.pow(x, cheese);
        System.out.println(answer);
        
    }
    public static void myFirstIfClass(){
        String cheddar = "Tastes good";
        if (cheddar.contains("g")) {
            System.out.println("g is found");
            
        }
        else if(cheddar.contains("T")){
            System.out.println("T is found");
        }
        else {
            System.out.println("g is not found ;(");
        }
    }

    public static void main(String[] args) {
        myFirstIfClass();

    }
}