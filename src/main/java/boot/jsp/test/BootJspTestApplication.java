package boot.jsp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class BootJspTestApplication {
	
	@RequestMapping("/showCreate")
	public String showIndex() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootJspTestApplication.class, args);
	}

}
