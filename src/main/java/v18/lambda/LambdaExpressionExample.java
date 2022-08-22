package v18.lambda;

//interface Drawable{
//    public void draw();
//}
//
//public class LambdaExpressionExample{
//
//    public static void main(String[] args) {
//        int width = 10;
//        //Without lambda
//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing "+width);
//            }
//        };
//        d.draw();
//    }
//}
@FunctionalInterface
interface Drawable{
    public void draw();
}

public class LambdaExpressionExample{

    public static void main(String[] args) {
        int width = 20;
        //Wit lambda
        Drawable d = () -> {
            System.out.println("Drawing "+width);
        };
        d.draw();
    }
}
