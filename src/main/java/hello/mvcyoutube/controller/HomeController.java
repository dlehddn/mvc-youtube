package hello.mvcyoutube.controller;


import hello.mvcyoutube.domain.Video;
import hello.mvcyoutube.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final VideoService videoService;

    @GetMapping("/")
    public String home(Model model) {
        List<Video> videos = videoService.findAll();
        model.addAttribute("videos", videos);
        return "index";
    }
}
