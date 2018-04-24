package refugeescode.at.mp19_pirates_of_the_code_bean._dead_men_tell_no_tales;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class EndpointController {



    @ModelAttribute("isMermaidFound")
    public boolean searchForMermaid(){
        return isMermaidFound;
    }

    @GetMapping("/stepOneMermaid")
    String mermaid() {
        isMermaidFound = true;
        return "redirect:/";
    }


}
