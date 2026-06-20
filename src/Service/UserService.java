package Service;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    // Create
    public void addUser(User user) {
        users.add(user);
    }

    // Read All
    public List<User> getAllUsers() {
        return users;
    }

    // Read One
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    // Delete
    /*public void removeUser(String username) {
        for (inti = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                users.remove(i);
                break;
            }
        }
    }*/


    public void removeUser(String username) {
          users.removeIf(user -> user.getUsername().equals(username));
    }

    // Update
    public void updateUser(String username,User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                users.set(i,updatedUser);
                break;
            }
        }
    }

}
