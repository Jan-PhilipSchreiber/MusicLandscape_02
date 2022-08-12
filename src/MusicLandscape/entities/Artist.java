package MusicLandscape.entities;

public class Artist {

    private String name;
    //holds name non null or empty


    public Artist() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.trim().equals(""))
            this.name = name;
    }
}
