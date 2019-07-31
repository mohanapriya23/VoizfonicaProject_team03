package com.example.voizfonica;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.validation.Errors;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import javax.validation.Valid;
        import java.util.List;

@Slf4j
@Controller
@RequestMapping("/edit")
public class EditController {

private DashboardRepository dashrepo;
public EditController(DashboardRepository dashrepo){this.dashrepo=dashrepo;}
    @ModelAttribute
    @GetMapping
    public String show_register(Model model){
        model.addAttribute("edit",new Edit());
        return "edit";
    }


    @PostMapping
   /* public String processRegister(@Valid Edit edit, Errors errors) {
        if (errors.hasErrors()) {
            return "edit";
        }*/

      //  dashrepo.save(edit);

        List<Edit> all = dashrepo.findAll();
        public String processEdit(@Valid Edit edit, Errors errors, Model model) {
            if (errors.hasErrors()) {
                
            } else {
                List<RegisterRepository> user = us.findByEmailIdAndPassword(login.getEmailId(), login.getPassword());
                if (user.isEmpty()) {
                    return "redirect:/error101";
                } else {
                    model.addAttribute("user", user);
                    return "redirect:/Dashboard";
                }
            }

        }


        return "edit";
    }
}
