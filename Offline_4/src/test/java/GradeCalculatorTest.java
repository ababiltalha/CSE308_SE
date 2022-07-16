import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {
    GradeCalculator gradeCalculator= new GradeCalculator();

    // non number input tests
    @Test
    void testNonNumberTotalMarkInput_1() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("&","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_2() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("3,2","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_3() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("[5]","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_4() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("aba","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_5() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("B","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_6() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4.4","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_7() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4+4","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_8() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("25*4","3"));
    }

    @Test
    void testNonNumberCreditInput_1() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("200","&"));
    }

    @Test
    void testNonNumberCreditInput_2() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("320.6","4,0"));
    }

    @Test
    void testNonNumberCreditInput_3() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("290","[4]"));
    }

    @Test
    void testNonNumberCreditInput_4() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("265","aba"));
    }

    @Test
    void testNonNumberCreditInput_5() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("277.8","C"));
    }

    @Test
    void testNonNumberCreditInput_6() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4","3.0.0"));
    }

    @Test
    void testNonNumberCreditInput_7() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4","3.0+0"));
    }

    @Test
    void testNonNumberCreditInput_8() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4","2*4"));
    }

    // invalid credit

    // invalid marks (below lower bound)

    // invalid marks (above upper bound)
    // 3 credit

    // 4 credit

    // 3 credit
    // A grade
    // close to upper bound cases
    @Test
    void testAForFullMarkInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("300","3"));
    }

    @Test
    void testAForFullMarkInThreeCredit_2() {
        assertEquals("A",gradeCalculator.calculateGrade("300.0","3"));
    }

    @Test
    void testAForCloseToFullMarkInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("299.99","3"));
    }

    @Test
    void testAForCloseToFullMarkInThreeCredit_2() {
        assertEquals("A",gradeCalculator.calculateGrade("299.8","3"));
    }





    @Test
    void testAForMidRangeValueInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("265","3"));
    }

    @Test
    void testAForMidRangeFloatValueInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("291.6","3"));
    }



}