package Task2;

public class Triangle {
    private int sideA;
    private int sideB;
    private int angle;

    public void setSideA(int sideA) {
        if (sideA > 0){
            this.sideA = sideA;
        }else {
            System.out.println("Invalid entry. Use only positive numbers");
        }
    }

    public void setSideB(int sideB) {
        if (sideB > 0){
            this.sideB= sideB;
        }else {
            System.out.println("Invalid entry. Use only positive numbers");
        }
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        if (angle > 0){
            this.angle = angle;
        }else {
            System.out.println("Invalid entry. Use only positive numbers");
        }
    }

    public Triangle(){

    }

    public void findTriangleAreaByTwoSidesAndAngle(){
        double triangleArea = (0.5 * sideA * sideB * Math.sin(Math.toRadians(angle)));
        System.out.printf("The triangle has area of %.3f", triangleArea);
    }
}
