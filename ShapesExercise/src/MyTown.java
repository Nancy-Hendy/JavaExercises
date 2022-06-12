public class MyTown implements Computable{

    int width;
    int length;
    @Override
    public double calculateArea() {
        return 0;
    }
    public int calculateTownArea(int width, int length){
        this.length= length;
        this.width= width;
        return width*length;
    }
    public String toString() {
        return "I am a Town ,"+"& My area is "+ calculateTownArea(length,width);
    }
}
