package lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetSetStudyTests {

    @Test
    @DisplayName("Lombok : Get Set Study Tests")
    void isGetterSetterWorking(){
        final String emailId = "vijish@msn.com";
        GetSetStudy getSetStudy1 = new GetSetStudy();
        getSetStudy1.setId(1001);
        getSetStudy1.setLoginId(emailId);
        getSetStudy1.setEmailId(emailId);
        getSetStudy1.setActive(true);
        GetSetStudy getSetStudy2 = new GetSetStudy(1002,"vijish.mv@gmail.com","vijish.mv@gmail.com", true);
        System.out.println("My Get Set Study [toString()] : "+getSetStudy1.toString());
        System.out.println("My Get Set Study [hashCode()] : "+getSetStudy1.hashCode());
        System.out.println("My Get Set Study [hashCode()] : "+getSetStudy2.toString());
        System.out.println("My Get Set Study [hashCode()] : "+getSetStudy2.hashCode());
//        Assertions.assertTrue(()-> {System.out.println("My Get Set Study : "+getSetStudy);});
        Assertions.assertTrue(getSetStudy1.isActive(), "Successful");
    }

}