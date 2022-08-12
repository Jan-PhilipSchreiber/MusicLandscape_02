package MusicLandscape.entities;

public class Artist {

    private String name;
    //holds name non null or empty


    public Artist() {
    }
    public Artist(Artist a) {
        this.name=a.name;
    }
    public Artist(String name) {
    this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.trim().equals(""))
            this.name = name;
    }
}
