package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
     
	@RequestMapping({"/",""})
	public String showJokes(Model model)
	{
		System.out.println("Joke Controller class....");
		model.addAttribute("joke",jokeService.GetJokes());
		return "index";
	}
}
