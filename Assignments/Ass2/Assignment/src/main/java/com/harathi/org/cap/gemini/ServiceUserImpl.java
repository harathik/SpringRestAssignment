package com.harathi.org.cap.gemini;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.harathi.org.cap.User;

@Service
public class ServiceUserImpl implements UserService {

	List<User> users;

	public ServiceUserImpl() {
		users = new ArrayList<>();
		users.add(new User("harathi", "Pass123"));
		users.add(new User("bharathi", "Pass1234"));
		users.add(new User("yamini", "Passd03"));
		users.add(new User("jahnavi", "Pass3"));
		users.add(new User("hari", "Passw03"));
		users.add(new User("ramakrishna", "Pass0"));
		users.add(new User("govind", "Pass73"));
		users.add(new User("Sarasomesh", "Pass983"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
