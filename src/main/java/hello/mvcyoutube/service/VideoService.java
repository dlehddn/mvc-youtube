package hello.mvcyoutube.service;

import hello.mvcyoutube.domain.Video;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VideoService {

    private static final Map<Integer, Video> store = new HashMap<>();
    private static Integer sequence = 0;

    public Video save(Video video) {
        video.setId(++sequence);
        store.put(video.getId(), video);
        return video;
    }
    public Video clicked(Integer id) {
        Video video = store.get(id);
        video.setClicked(video.getClicked() + 1);
        store.put(id, video);
        return video;
    }



    public List<Video> findAll() {
        return new ArrayList<>(store.values());
    }

}
