package kr.ac.koreantech.devops_step0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

  @GetMapping("/")
  public String index() {
    System.out.println("hello .....");
      return "index.html";
  }
  

}
