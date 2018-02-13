package orgfunnyServlet.Services;

import java.util.ArrayList;
import java.util.List;

public class FunnyService {

	public List<String> getUsersList(String name) {
		List<String> users = new ArrayList<String>();
		users.add("Hello");
		users.add(name);
		users.add("You Are a Passionate Programmer !");
		return users;
	}

}
