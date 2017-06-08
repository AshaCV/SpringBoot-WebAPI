package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {


	private List<Animals> animals = new ArrayList<>(Arrays.asList(
			new Animals(1, "aardvark"),
			new Animals(2, "antelope"),
			new Animals(3, "baboon"),
			new Animals(4, "bat"),
			new Animals(5, "bee"),
			new Animals(6, "buffalo"),
			new Animals(7, "chamois"),
			new Animals(8, "chimpanzee"),
			new Animals(9, "clam"),
			new Animals(10, "crab"),
			new Animals(11, "dinosaur"),
			new Animals(12, "dolphin"),
			new Animals(13, "dotterel"),
			new Animals(14, "duck"),
			new Animals(15, "eland"),
			new Animals(16, "ferret"),
			new Animals(17, "frog"),
			new Animals(18, "gerbil"),
			new Animals(19, "gorilla"),
			new Animals(20, "heron"),
			new Animals(21, "hornet"),
			new Animals(22, "hummingbird"),
			new Animals(23, "jay"),
			new Animals(24, "kookabura"),
			new Animals(25, "lapwing")			
			));
	
	public List<Animals> getAllAnimals()
	{
		return animals;
	}
	
	public Animals getAnimal(int id)
	{
		return animals.get(id-1);
	}
}
