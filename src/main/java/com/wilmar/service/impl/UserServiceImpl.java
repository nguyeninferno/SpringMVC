package com.wilmar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wilmar.entity.User;
import com.wilmar.exception.BadRequestException;
import com.wilmar.exception.NotFoundException;
import com.wilmar.model.UserCreator;
import com.wilmar.model.UserDetail;
import com.wilmar.model.UserUpdate;
import com.wilmar.repository.UserRepository;
import com.wilmar.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetail getUserById(Long id) {
		User user = userRepository.findById(id).get();
		if (user == null) {
			throw new NotFoundException("User not found");
		}
		UserDetail userDetail = new UserDetail().convertEntityToModel(user);
		return userDetail;
	}

	@Override
	public void updateUser(UserUpdate userUpdate) {
		User user = userRepository.findById(userUpdate.getId()).get();
		if (user == null) {
			throw new NotFoundException("User not found");
		}
		boolean isExistEmail = userRepository.isExistEmail(userUpdate.getId(), userUpdate.getEmail());
		if (isExistEmail) {
			throw new BadRequestException("Email is already taken!");
		}
		boolean isExistPhone = userRepository.isExistPhone(userUpdate.getId(), userUpdate.getPhone());
		if (isExistPhone) {
			throw new BadRequestException("Phone is already taken!");
		}
		User result = userUpdate.convertModelToEntity();
		userRepository.save(result);

	}

	@Override
	public void save(UserCreator userCreator) {
		if (userRepository.existsByEmail(userCreator.getEmail())) {
			throw new BadRequestException("Email is already taken!");
		}
		if (userRepository.existsByPhone(userCreator.getPhone())) {
			throw new BadRequestException("Phone is already taken!");
		}
		User user = userCreator.convertModelToEntity();
		userRepository.save(user);

	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

}
