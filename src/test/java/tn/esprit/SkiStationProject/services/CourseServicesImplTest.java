package tn.esprit.SkiStationProject.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.SkiStationProject.entities.Course;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class CourseServicesImplTest {
    @Autowired
    private CourseServicesImpl courseServices;

    @Test
    public void AddCourse(){
        Course c = new Course();
        c.setLevel(2);
        Course result = courseServices.addCourse(c);
        assertEquals(2,result.getLevel());
    }
}