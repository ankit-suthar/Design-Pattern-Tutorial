package creational.factory;

import java.util.List;

public class BlogWebsite extends Website{
	
	public BlogWebsite() {
		pages.add("BlogPage");
		pages.add("Comments_Box");
	}

	public List<String> getPages() {
		return pages;
	}

}
