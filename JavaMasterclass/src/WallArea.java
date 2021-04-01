public class WallArea {

    // remove main method to submit to Udemy
    public static void main(String[] args) {
        WallArea WallArea = new WallArea(5, 4);
        System.out.println("area= " + WallArea.getArea());

        WallArea.setHeight(-1.5);
        System.out.println("width=" + WallArea.getWidth());
        System.out.println("height= " + WallArea.getHeight());
        System.out.println("area= " + WallArea.getArea());
    }


    private double width; //field instance
    private double height; // field instance

    public WallArea(){

    }

    public WallArea(double width, double height){
        if(width < 0){
            width = 0;
        }

        if(height < 0){
            height = 0;
        }

        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height){
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

}