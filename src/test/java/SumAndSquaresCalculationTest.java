import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SumAndSquaresCalculationTest {

    SumAndSquaresCalculator sumAndSquaresCalculator = new SumAndSquaresCalculator();


    @Test
    public void shouldReturn385WhenInputIs10(){
        //given
        int input = 10;
        int expectedResult =385;

        //when
        int result = sumAndSquaresCalculator.getSumOfSquares(input);

        //then
        Assert.assertThat(result, is(expectedResult));

    }

    @Test
    public void shouldReturn3025WhenInputIs10(){
        //given
        int input = 10;
        int expectedResult =3025;

        //when
        int result = sumAndSquaresCalculator.getSquareOfSum(input);

        //then
        Assert.assertThat(result, is(expectedResult));

    }

    @Test
    public void shouldReturn0WhenInputIs1(){
        //given
        int input = 1;
        int expectedResult = 0;

        //when
        int result = sumAndSquaresCalculator.calculateDifferences(input);

        //then
        Assert.assertThat(result, is(expectedResult));

    }

    @Test
    public void shouldReturn2640WhenInputIs10(){
        //given
        int input = 10;
        int expectedResult = 2640;

        //when
        int result = sumAndSquaresCalculator.calculateDifferences(input);

        //then
        Assert.assertThat(result, is(expectedResult));

    }
}
