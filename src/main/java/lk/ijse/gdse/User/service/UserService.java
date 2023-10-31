package lk.ijse.gdse.User.service;

import lk.ijse.gdse.User.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);
    void uploadUserImage(String frontViewPath, String backViewPath, String id);
    void updateUser(UserDTO dto);
    void deleteUser(Long id);
    UserDTO searchUserById(String id);
    List<UserDTO> getAllUserDetail();
}
