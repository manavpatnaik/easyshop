package com.springapi.easyshop.service.user;

import com.springapi.easyshop.dto.UserDto;
import com.springapi.easyshop.model.User;
import com.springapi.easyshop.request.CreateUserRequest;
import com.springapi.easyshop.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
