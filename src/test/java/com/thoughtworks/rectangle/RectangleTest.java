package com.thoughtworks.rectangle;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven(){
        Rectangle rectangle = new Rectangle(4.5, 3.5);
        double area = rectangle.area();
        assertThat(area,is(closeTo(15.75,.001)));
    }
    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven(){
        Rectangle rectangle = new Rectangle(5.35, 3.75);
        double perimeter = rectangle.perimeter();
        assertThat(perimeter,is(closeTo(18.2, .001)));
    }
}
