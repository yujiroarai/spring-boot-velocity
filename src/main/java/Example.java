import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.collect.Lists;

@Controller
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home(Model model) {
      model.addAttribute("fromController", "コントローラーから渡す。");
      model.addAttribute("list", Lists.newArrayList("リスト1", "リスト2", "リスト3"));
      return "hello";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
