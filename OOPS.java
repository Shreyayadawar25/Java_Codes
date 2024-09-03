public class OOPS {

    public static void main(String[] args) {
        // pen p1 = new pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

        pen p1 = new pen();
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        
    
    }
    
}
class pen {
    private String color ;
    private int tip;
    
    String getcolor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int Tip){
        this.tip = Tip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void CalPercentage(int phy, int chem, int bio){
        percentage = (phy + chem +bio)/3;
    }
}