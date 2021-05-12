package Tests;

import Algorithms.Insructor.CoursesSectionBaseInstructor;
import Algorithms.MainBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseSectionTestInstructor extends MainBase {
    @BeforeEach
    public void singIn() {
        loginBaseInstructor
                .goTo()
                .email("saqo21harutyunyan+19@gmail.com")
                .pass("7rujd12f")
                .login()
                .displayedText();


    }

    @Test
    public void addNewCourse() throws InterruptedException {
        coursesSectionBaseInstructor
                .goToCourses()
                .addNewCourse("AutoCourse", "Welcome", "asdsdf@gmdfdail.com");

    }

    @Test
    public void searchByCourseName() throws InterruptedException {
        coursesSectionBaseInstructor
                .goToCourses()
                .search_By_Course_Name("AutoCourse");

    }@Test
    public void searchByCourseCategoryAndCourseType() throws InterruptedException {
        coursesSectionBaseInstructor
                .goToCourses()
                .search_By_Course_Category_And_Course_Type();

    }
    @Test
    public  void click_The_Inactive_Active_Buttons () throws InterruptedException {
        coursesSectionBaseInstructor
                .goToCourses()
                .click_The_Inactive_Active_Buttons();

    }

}
