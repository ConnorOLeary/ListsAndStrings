package useful.controller;

import java.util.*;
import useful.model.Donut;

public class ToolController {
	//Declares the donut List to store the donuts that we create
	private List<Donut> donutList;
	
	public ToolController() {
		donutList = new ArrayList<Donut>();
	}
	
	public void start() {
		//Creates a donut and adds it to the list
		Donut temp = new Donut();
		donutList.add(temp);
		System.out.println(donutList);
	}
}
