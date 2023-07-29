package hello.mvcyoutube.domain;


import lombok.Data;

@Data
public class Video {

    private Integer id;
    private String videoName;
    private Integer clicked;

    public Video() {}

    public Video(String videoName, Integer clicked) {
        this.videoName = videoName;
        this.clicked = clicked;
    }
}
