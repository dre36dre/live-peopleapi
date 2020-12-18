package one.digitalinnovation.personapi.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/v1/people")
public class PersonController {
	
	@GetMapping
	public String getBook() {
		return "API Test\nAnderson você ainda vai ter muito "
				+ "sucesso na vida, ganhar muito dinheiro e "
				+ "ter uma grande casa para sua familia morar!!!";
	}
}
