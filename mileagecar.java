import java.util.*;
public class mileagecar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while(true){
        int speed = sc.nextInt();
        if (speed >0 && speed <= 10) {
            System.out.println("milage of car is 30 kmpl");
        } else if (speed > 10 && speed <= 20) {
            System.out.println("milage of car is 40 kmpl");
        } 
        else if (speed > 20 && speed <= 30) {
            System.out.println("milage of car is 35 kmpl");
        }
        else{
            System.out.println("milage of car is 3 kmpl");
        }
    }
    }
    
}
