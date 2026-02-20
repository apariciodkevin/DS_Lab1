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

    double getBmiUs(){
        bmiUs = getWeight() / (getHeight() * getHeight()) * 703;
        return bmiUs;
    }



}
