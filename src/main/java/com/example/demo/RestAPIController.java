package com.example.demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestAPIController {

	private static final Logger logger = Logger.getLogger(RestAPIController.class);
	
	@Autowired
	private AnimalService animalService;

		@RequestMapping(value = "/animals")
		public List<Animals> getAllAnimals() {	
			
			/*RestTemplate restTemplate = new RestTemplate();
			
		Animals animals = restTemplate.getForObject("http://saraex01.mybluemix.net/animals", Animals.class);
		return animals;*/
	
			return animalService.getAllAnimals();
		}

		@RequestMapping(value="/animals/{id}")
		public Animals getAnimal(@PathVariable int id)
		{
			
			return animalService.getAnimal(id);
			
			/*RestTemplate restTemplate = new RestTemplate();
			 Animals apiResponse =  restTemplate.getForObject("http://saraex01.mybluemix.net/animals" + id, Animals.class);
			
			return apiResponse.getName();*/
		}
		
}
