public class Cube {
    
    private int edgelength;
    private int volume;

    public Cube(int edgelength) {
        this.edgelength = edgelength;
        
    }

    public int volume() {
        //volume = edgelength * edgelength * edgelength;
        volume = (int) Math.pow(edgelength, 3);
        return volume;
    }

    public String toString() {
        return "The length of the edge is " + edgelength + " and the volume " + volume;
    }
}
