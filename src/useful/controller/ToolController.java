package useful.controller;

import java.util.*;

import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController {
	//Declares the donut List to store the donuts that we create
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController() {
		display = new PopupDisplay();
		donutList = new ArrayList<Donut>();
	}
	private boolean isValid(String input, List<Donut> donutList) {
		boolean parsed = false;
		try {
			int validInteger = Integer.parseInt(input);
			if(0 <= validInteger && validInteger < donutList.size()) {
				parsed = true;
			}else {
				display.displayText("invalid index");
			}
			
		}
		catch(NumberFormatException error) {
			display.displayText("Thats not a number");
		}
		return parsed;
	}
	public void start() {
		//Creates a donut and adds it to the list
		Donut temp = new Donut();
		donutList.add(temp);
		display.displayText(donutList.toString());
		fillTheList();
		//showTheList();
		//changeTheList();
		practice();
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
	
	private void changeTheList() {
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
	}

	private void practice() {
		display.displayText(donutList.toString());
		//Add stuff
		Donut bostonCreampie = new Donut("Boston Cream Pie");
		Donut betterJellyFilled = new Donut("special jelly filled");
		donutList.add(bostonCreampie);
		donutList.add(0,betterJellyFilled);
		donutList.add(new Donut("donut hole"));
		display.displayText(donutList.toString());
		
		//remove stuff
		donutList.remove(0);
		
		//get stuff
		String choice = display.getResponse("What donut number do you want? 0-" + donutList.size());
		if(isValid(choice, donutList)) {
			int validInteger = Integer.parseInt(choice);
			display.displayText(donutList.get(validInteger).toString());
		}
		
		
		//Loop backwards
		for(int i = donutList.size(); i > 0; i--) {
			display.displayText(donutList.get(i-1).toString());
		}
	}

	public ArrayList<Donut> getDonutList(){

		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay() {
		return display;
	}
}

