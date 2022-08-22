package v18.streams;

import v18.lambda.FunctionalInterfaceStudy;

public class FunctionalInterfaceStudyTests {
    public static void main(String[] args) {
        final Runnable doWeNeedThis = FunctionalInterfaceStudy::doWeNeedThis;
        doWeNeedThis.run();
    }
}
