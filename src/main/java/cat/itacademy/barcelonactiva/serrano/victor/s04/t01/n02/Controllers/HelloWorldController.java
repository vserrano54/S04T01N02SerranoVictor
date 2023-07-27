package cat.itacademy.barcelonactiva.serrano.victor.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping({"/HolaMundo","/HolaMundo/{nombre}"})
	@ResponseBody
	public String Saluda(@PathVariable(required=false) String nombre) {
		
		return "Hola, " + nombre + ". Estás ejecutando un proyecto Gradle";
		
		
	}
	
	@GetMapping({"/HolaMundo2","/HolaMundo2/{nombre}"})
	@ResponseBody
	public String Saluda2(@PathVariable(required=true) String nombre) {
		
		return "Hola, " + nombre + ". Estás ejecutando un proyecto Gradle";
		
	}

}
