package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	List<String> pages = new ArrayList<String>();
	
	abstract List<String> getPages();

}
