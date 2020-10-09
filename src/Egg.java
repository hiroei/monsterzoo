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

    void updateDistance(){
        distance++;
    }

    void resetDistance() {
        distance = 0.0;
    }

    void clearAllStatus() {
        exist=false;
        distance=0.0;
    }
}