package hello.mvcyoutube.controller;


import hello.mvcyoutube.domain.Video;
import hello.mvcyoutube.service.VideoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("video")
public class VideoController {

    private final VideoService videoService;

    @GetMapping("/{videoId}")
    public String video(@PathVariable Integer videoId, Model model) {
        Video video = videoService.clicked(videoId);
        List<Video> videos = videoService.findAll();
        model.addAttribute("video", video);
        model.addAttribute("videos", videos);
        return "video/videoView";
    }

}
