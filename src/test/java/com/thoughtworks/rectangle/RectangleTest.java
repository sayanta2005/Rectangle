package com.thoughtworks.rectangle;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class RectangleTest {
    @Test
    void checkAreaForPositiveLengthAndBreadth(){
        Rectangle rectangle = new Rectangle(10, 5);
        int area = rectangle.getArea();
        assertThat(area,is(equalTo(50)));
    }
}
