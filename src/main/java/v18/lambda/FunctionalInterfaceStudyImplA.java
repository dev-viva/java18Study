package v18.lambda;

public class FunctionalInterfaceStudyImplA implements FunctionalInterfaceStudy {
    @Override
    public void printMe() {
        System.out.println("From Overridden printMe");

    }

//    @Override
//    public void againPrintMe() {
//        FunctionalInterfaceStudy.super.againPrintMe();
//        System.out.println("From overridden again printMe");
//    }

//   only abstract methods need to be overridden and implemented.
}
