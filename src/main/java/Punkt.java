public class Punkt {
    int x;
    int y;

    public Punkt(){}

    public Punkt(int a, int b){
        x=a;
        y=b;
    }
    public Punkt(Punkt pkt){
        x= pkt.x;
        y= pkt.y;
    }
}
