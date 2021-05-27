package app;

import controller.Controller;
import template.Goblin;
import template.Org;

public class App {

	public static void main(String[] args) {
		new Controller(new Goblin(), new Org());
	}

}
