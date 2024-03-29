package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yan hongbo
 * @date 2019/10/28 11:29
 * @description
 */
@Controller
public class UploadController {

    @RequestMapping("/upload")
    public void upload(@RequestParam("picture") MultipartFile picture) throws Exception {
        System.out.println(picture.getOriginalFilename());
    }

    @RequestMapping("/test2")
    public ModelAndView upload() {
        return new ModelAndView("upload");
    }
}
