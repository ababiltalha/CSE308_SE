public class GradeCalculator {
    public String calculateGrade(String totalMarkInput, String creditInput){
        double totalMark, credit;
        try {
            totalMark = Double.parseDouble(totalMarkInput);
            credit = Double.parseDouble(creditInput);
        } catch (NumberFormatException e) {
            return "Non-number input detected";
        }

        if(totalMark<0) return "Total mark entered negative";
        long roundedTotalMark= (long) Math.ceil(totalMark);
        if(credit==3){
            if(roundedTotalMark>300){
                return "Total mark out of range for given credit";
            }
            else {
                if (roundedTotalMark >= 240) return "A";
                else if (roundedTotalMark >= 210) return "B";
                else if (roundedTotalMark >= 180) return "C";
                else return "F";
            }
        }
        else if(credit==4){
            if(roundedTotalMark>400){
                return "Total mark out of range for given credit";
            }
            else {
                if (roundedTotalMark >= 320) return "A";
                else if (roundedTotalMark >= 280) return "B";
                else if (roundedTotalMark >= 240) return "C";
                else return "F";
            }
        }
        else {
            return "Invalid credit input";
        }
    }
}
