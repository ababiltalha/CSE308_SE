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
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4.4","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_5() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4+4","3"));
    }

    @Test
    void testNonNumberTotalMarkInput_6() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("25*4","3"));
    }

    @Test
    void testNonNumberCreditInput_1() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("200","C"));
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
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4","3.0.0"));
    }

    @Test
    void testNonNumberCreditInput_5() {
        assertEquals("Non-number input detected", gradeCalculator.calculateGrade("250.4","3.0+0"));
    }

    @Test
    void testNonNumberCreditInput_6() {
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

    // mid range cases
    @Test
    void testAForMidRangeValueInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("265","3"));
    }

    @Test
    void testAForMidRangeFloatValueInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("291.6","3"));
    }

    // close to lower bound cases
    @Test
    void testAForLowerBoundInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("240","3"));
    }

    @Test
    void testAForLowerBoundInThreeCredit_2() {
        assertEquals("A",gradeCalculator.calculateGrade("240.0","3"));
    }

    @Test
    void testAForCloseToLowerBoundInThreeCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("239.4","3"));
    }

    // B grade
    // close to upper bound cases
    @Test
    void testBForUpperBoundInThreeCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("239","3"));
    }

    @Test
    void testBForUpperBoundInThreeCredit_2() {
        assertEquals("B",gradeCalculator.calculateGrade("239.0","3"));
    }

    // mid range cases
    @Test
    void testBForMidRangeValueInThreeCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("220","3"));
    }

    @Test
    void testBForMidRangeFloatValueInThreeCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("231.6","3"));
    }

    // close to lower bound cases
    @Test
    void testBForLowerBoundInThreeCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("210","3"));
    }

    @Test
    void testBForLowerBoundInThreeCredit_2() {
        assertEquals("B",gradeCalculator.calculateGrade("210.0","3"));
    }

    @Test
    void testBForCloseToLowerBoundInThreeCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("209.006","3"));
    }

    // C grade
    // close to upper bound cases
    @Test
    void testCForUpperBoundInThreeCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("209","3"));
    }

    @Test
    void testCForUpperBoundInThreeCredit_2() {
        assertEquals("C",gradeCalculator.calculateGrade("209.0","3"));
    }

    // mid range cases
    @Test
    void testCForMidRangeValueInThreeCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("200","3"));
    }

    @Test
    void testCForMidRangeFloatValueInThreeCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("187.6","3"));
    }

    // close to lower bound cases
    @Test
    void testCForLowerBoundInThreeCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("180","3"));
    }

    @Test
    void testCForLowerBoundInThreeCredit_2() {
        assertEquals("C",gradeCalculator.calculateGrade("180.0","3"));
    }

    @Test
    void testCForCloseToLowerBoundInThreeCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("179.01","3"));
    }

    // F grade
    // close to upper bound cases
    @Test
    void testFForUpperBoundInThreeCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("179","3"));
    }

    @Test
    void testFForUpperBoundInThreeCredit_2() {
        assertEquals("F",gradeCalculator.calculateGrade("179.0","3"));
    }

    // mid range cases
    @Test
    void testFForMidRangeValueInThreeCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("100","3"));
    }

    @Test
    void testFForMidRangeFloatValueInThreeCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("79.6","3"));
    }

    // close to lower bound cases
    @Test
    void testFForLowerBoundInThreeCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("0","3"));
    }

    @Test
    void testFForLowerBoundInThreeCredit_2() {
        assertEquals("F",gradeCalculator.calculateGrade("0.0","3"));
    }

    @Test
    void testFForCloseToLowerBoundInThreeCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("0.001","3"));
    }

    // 4 credit
    // A grade
    // close to upper bound cases
    @Test
    void testAForFullMarkInFourCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("400","4"));
    }

    @Test
    void testAForFullMarkInFourCredit_2() {
        assertEquals("A",gradeCalculator.calculateGrade("400.0","4"));
    }

    @Test
    void testAForCloseToFullMarkInFourCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("399.69","4"));
    }

    // mid range cases
    @Test
    void testAForMidRangeValueInFourCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("365","4"));
    }

    @Test
    void testAForMidRangeFloatValueInFourCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("331.6","4"));
    }

    // close to lower bound cases
    @Test
    void testAForLowerBoundInFourCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("320","4"));
    }

    @Test
    void testAForLowerBoundInFourCredit_2() {
        assertEquals("A",gradeCalculator.calculateGrade("320.0","4"));
    }

    @Test
    void testAForCloseToLowerBoundInFourCredit_1() {
        assertEquals("A",gradeCalculator.calculateGrade("319.4","4"));
    }

    // B grade
    // close to upper bound cases
    @Test
    void testBForUpperBoundInFourCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("319","4"));
    }

    @Test
    void testBForUpperBoundInFourCredit_2() {
        assertEquals("B",gradeCalculator.calculateGrade("319.0","4"));
    }

    // mid range cases
    @Test
    void testBForMidRangeValueInFourCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("300","4"));
    }

    @Test
    void testBForMidRangeFloatValueInFourCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("296.6","4"));
    }

    // close to lower bound cases
    @Test
    void testBForLowerBoundInFourCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("280","4"));
    }

    @Test
    void testBForLowerBoundInFourCredit_2() {
        assertEquals("B",gradeCalculator.calculateGrade("280.0","4"));
    }

    @Test
    void testBForCloseToLowerBoundInFourCredit_1() {
        assertEquals("B",gradeCalculator.calculateGrade("279.4","4"));
    }

    // C grade
    // close to upper bound cases
    @Test
    void testCForUpperBoundInFourCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("279","4"));
    }

    @Test
    void testCForUpperBoundInFourCredit_2() {
        assertEquals("C",gradeCalculator.calculateGrade("279.0","4"));
    }

    // mid range cases
    @Test
    void testCForMidRangeValueInFourCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("250","4"));
    }

    @Test
    void testCForMidRangeFloatValueInFourCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("257.6","4"));
    }

    // close to lower bound cases
    @Test
    void testCForLowerBoundInFourCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("240","4"));
    }

    @Test
    void testCForLowerBoundInFourCredit_2() {
        assertEquals("C",gradeCalculator.calculateGrade("240.0","4"));
    }

    @Test
    void testCForCloseToLowerBoundInFourCredit_1() {
        assertEquals("C",gradeCalculator.calculateGrade("239.01","4"));
    }

    // F grade
    // close to upper bound cases
    @Test
    void testFForUpperBoundInFourCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("239","4"));
    }

    @Test
    void testFForUpperBoundInFourCredit_2() {
        assertEquals("F",gradeCalculator.calculateGrade("239.0","4"));
    }

    // mid range cases
    @Test
    void testFForMidRangeValueInFourCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("100","4"));
    }

    @Test
    void testFForMidRangeFloatValueInFourCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("129.6","4"));
    }

    // close to lower bound cases
    @Test
    void testFForLowerBoundInFourCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("0","4"));
    }

    @Test
    void testFForLowerBoundInFourCredit_2() {
        assertEquals("F",gradeCalculator.calculateGrade("0.0","4"));
    }

    @Test
    void testFForCloseToLowerBoundInFourCredit_1() {
        assertEquals("F",gradeCalculator.calculateGrade("0.4","4"));
    }




}