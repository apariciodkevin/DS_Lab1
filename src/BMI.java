public class BMI {
    private double height;
    private double weight;
    private double bmiUs;
    private double bmiGeneral;

    // Setters
    void set_height(double height){
        this.height = height;
    }

    void setWeight (double weight){
        this.weight = weight;
    }

    // Getters
    double getHeight (){
        return height;
    }

    double getWeight (){
        return weight;
    }

    void getBmiUs(){
        String feetToInches = String.valueOf(getHeight()); // switches original height input to a String.
        String[]inchesSplit = feetToInches.split("\\."); // Splits the string by the decimal point

        // System.out.println(inchesSplit[0]);  programmer purposes to view that the string split the way it should.
        // System.out.println(inchesSplit[1]); same as above

        int convert = Integer.parseInt(inchesSplit[0]); // convert what is in index 0 to an iNT
        int inches = convert * 12; // multiply by 12 to get correct inches for the amount of feet.
        int inches2 = Integer.parseInt(inchesSplit[1]); // saving index 1 to variable
        int totalInches = inches + inches2; // once feet has been converted to inches add the extra inches in index 1.

        bmiUs = getWeight() / (totalInches * totalInches) * 703;
    }

    double getResultUS(){
        this.getBmiUs();
        return bmiUs;
    }



}
