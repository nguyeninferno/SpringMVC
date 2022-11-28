package com.wilmar.service;

import com.wilmar.model.UserCreator;
import com.wilmar.model.UserDetail;
import com.wilmar.model.UserUpdate;

public interface UserService {

	UserDetail getUserById(Long id);
	
	void updateUser(UserUpdate userUpdate);
	
	void save(UserCreator userCreator);
	
	void delete(Long id);
}
