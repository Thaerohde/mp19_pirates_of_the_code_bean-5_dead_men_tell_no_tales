package refugeescode.at.mp19_pirates_of_the_code_bean._dead_men_tell_no_tales;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EndpointController {

    boolean isSentRequest;
    boolean isCurseRemoved;

    @GetMapping("/")
    public String page(){
        return "home";
    }
    @GetMapping("/diary")
    public String getdiary(){
        return "diary";
    }

    @ModelAttribute("jackSparrowSendRequest")

    public boolean sendrequest(){
        return isSentRequest;
    }
    @RequestMapping("/")
    @GetMapping("/sentRequest")
    String removeCurse() {
        isSentRequest = true;
        return "redirect:/home";
    }

    @ModelAttribute("curseRemoved")
    public boolean getcurseRemoved(){
        return isCurseRemoved;
    }
    @RequestMapping("/diary")
    @GetMapping("/removeCurse")
    String cursed() {
        isSentRequest = true;
        return "redirect:/diary";
    }
    /*Captain Jack Sparrow needs to find the Trident of Poseidon
    in order to break the curse that affects the Flying Dutchman.
     Jack Sparrow can login with a form to check if the Flying Dutchman is still cursed.
      But to remove the curse he needs to ask Carina to decipher her diary.
       Only the user Carina can see the diary page and there she can press a button that destroys the trident
       so that the curse over the Flying Dutchman is removed. If Jack Sparrow checks again,
        he will discover that the curse has been removed. Three pages are necessary: home, diary and login.
    Also two users are necessary: Jack Sparrow (with role “jacksparrow”) and Carina (with role “carina”).
    }
      */



}
