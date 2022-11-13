package HW14;

public class Lambda_3 {
    public static void main(String[] args) {
        ThirdLambda lambda = (x) -> {
            if (x>0) {
                System.out.println("positive");
                return x;
            }
            if (x==0){
                System.out.println("zero");
                return x;
            }
            if (x<0) {
                System.out.println("negative");
                return x;
            }
            return x;
        };
        lambda.compare(-4356);
    }
}
