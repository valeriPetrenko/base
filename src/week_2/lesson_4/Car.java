package week_2.lesson_4;

public class Car {

    private String number;
    private String colour;
    private String mark = null;
    private Track track = null;

    public void setTrack(Track tr){
        track = tr;
    }

    public void unSetTrack(){
        track = null;
    }

    public Track getTrack(){
        return track;
    }


    public static int counter = 0;

    public String getMark() {
        return mark;
    }

    public void setMark(String m) {
        if (m.equals("BMW") || m.equals("Audi") || m.equals("VW"))
            mark = m;
    }
    public Car(){
        counter++;
    }

    public static int getCountCars() {
        return counter;
    }

}

