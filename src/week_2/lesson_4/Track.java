package week_2.lesson_4;

public class Track {
    boolean hasRolled;
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

    public void roll(){
        if(hasRolled){
            System.out.println("Already move");
        }else{
            System.out.println("Start to roll");
            hasRolled = true;
        }
    }

    public void stop(){
        if(hasRolled == true){ // = if(hasRolled)
            System.out.println("I've stoped");
        }else{
            System.out.println("I've not move yet");
        }
    }

}
