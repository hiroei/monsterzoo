public class Egg{
    double distance;
    boolean exist;

    Egg(){
        distance=0.0;
        exist=false;
    }

    void setEgg() {
        exist=true;
    }

    void updateEggDistance(){
        distance++;
    }
}