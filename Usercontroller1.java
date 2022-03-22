import java.lang.System.Logger;
import java.util.concurrent.ExecutorService;

import javax.swing.text.html.HTMLEditorKit.HTMLFactory;

import org.apache.catalina.User;
import org.apache.tomcat.jni.Mmap;

public class Usercontroller1<ModelMap>{
//controls the functionality of the user entity
	
	private ExecutorService userService;
private Object users;
	//Logger logger = HTMLFactory.getLogger(UserController.class);
	
	public String showUsers(Mmap model) {
		Object logger;
		//((Object) logger).info("Getting all users");
		
		
		return "users";
	}
	//RequestMapping(value ="/search/{id}", method = RequestMethod.POST)
	public String searchUser(ModelMap model, //RequestParam("id") int id) {
		logger.@info("Searching for a user");
		User user = userService.GetUserById(id);
		@logger.info("Passing Searched User to View")
		model.addAttribute("userSearch", user);
		return "search";
	}
@PostMapping("search/update")
	public String updateUser(ModelMap model, @ModelAttribute("update") User user) {
		logger.info("Updating a User");
		userService.UpdateUser(user);
		model.addAttribute("updatedUser", user);
		return "update";
	}
}

