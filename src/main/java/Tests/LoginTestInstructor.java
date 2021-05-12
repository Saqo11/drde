package Tests;

import Algorithms.MainBase;
import org.junit.jupiter.api.Test;

public class LoginTestInstructor  extends MainBase {
    @Test
    public  void  SingInPositiveTest (){
              loginBaseInstructor.goTo()
                                 .email("saqo21harutyunyan+19@gmail.com")
                                 .pass("7rujd12f")
                                 .login()
                                 .displayedText();



    }

    @Test

    public  void  SingInNegativeTest (){
        loginBaseInstructor.goTo()
                .email("saqo21harustyunyan+19@gmail.com")
                .pass("7rujds12f")
                .login()
                .anErrorMessage();



    }
}
