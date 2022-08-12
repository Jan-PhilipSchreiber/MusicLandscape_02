package MusicLandscape.entities;

import java.util.Objects;

public class Track {

    private int duration;
    //cannot be negative, o represents "unknown"
    private Artist performer=new Artist();
    //cannot be null
    private String title;
    //null=unknown
    private Artist writer=new Artist();
    //cannot be null
    private int year;
    //valid between 1900-2999

    public Track() {
    }


    public int getDuration() {
        return duration;
    }
    public Artist getPerformer() {
        return performer;
    }
    public String getTitle() {
        return Objects.requireNonNullElse(title, "unknown title");
    }
    public Artist getWriter() {
        return writer;
    }
    public int getYear() {
        return year;
    }
    public void setDuration(int duration) {
        if (duration>=0)
            this.duration = duration;
    }


    public String getString() {
        return String.format("%10.10s by %10.10s performed by %10.10s (%02d:%02d)"
                ,title==null?"unknown":title,
                writer == null ? "unknown" : writer.getName() == null ? "unknown" : writer.getName(),
                performer == null ? "unknown" : performer.getName() == null ? "unknown" : performer.getName(),
                duration/60,duration%60);

    }

    public void setPerformer(Artist performer) {
        if (performer!=null)
            this.performer = performer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(Artist writer) {
        if (writer!=null)
            this.writer = writer;
    }

    public void setYear(int year) {
        if (year<=2999&&year>=1900){
        this.year = year;
        }
    }


    public boolean writerIsKnown(){
        return writer != null&&writer.getName()!=null;
    }
}
