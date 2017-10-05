package useful.controller;

import java.util.*;

import useful.model.Donut;
import useful.view.popupDisplay;

public class ToolController {
	//Declares the donut List to store the donuts that we create
	private List<Donut> donutList;
	private popupDisplay display;
	public ToolController() {
		display = new popupDisplay();
		donutList = new ArrayList<Donut>();
	}
	
	public void start() {
		//Creates a donut and adds it to the list
		Donut temp = new Donut();
		donutList.add(temp);
		display.displayText(donutList.toString());
		fillTheList();
		showTheList();
	}
	private void showTheList() {
		String favorite = "free donut";
		for(Donut currentFlavor: donutList) {
			System.out.println();
			display.displayText(currentFlavor.toString());
			if (currentFlavor.equals(favorite)) {
				display.displayText("YAY");
			}
		}
	}
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut frosted = new Donut("frosted");
		Donut glazed = new Donut("glazed");
		Donut creamFilled = new Donut("cream filled");
		Donut ratPoison = new Donut("free");
		Donut lotsOfHoles = new Donut(69);
		donutList.add(jellyFilled);
		donutList.add(frosted);
		donutList.add(glazed);
		donutList.add(creamFilled);
		donutList.add(ratPoison);
		donutList.add(lotsOfHoles);
		display.displayText(donutList.toString());

	}
}
