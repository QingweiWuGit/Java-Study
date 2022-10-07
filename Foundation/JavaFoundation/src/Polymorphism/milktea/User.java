package Polymorphism.milktea;

public class User {
    private int point;

    public User(){

    }

    public User(int point){
        this.setPoint(point);
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
