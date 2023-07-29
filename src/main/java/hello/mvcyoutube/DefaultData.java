package hello.mvcyoutube;

import hello.mvcyoutube.domain.Video;
import hello.mvcyoutube.service.VideoService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
public class DefaultData {

    private final VideoService videoService;

    @PostConstruct
    public void init() {
        videoService.save(new Video("[백준] 달이 차오른다, 가자 해설강의", 0));
        videoService.save(new Video("개발과정 함께 보시죠~1", 0));
        videoService.save(new Video("테스트 샘플 영상 입니다.", 0));
    }
}
