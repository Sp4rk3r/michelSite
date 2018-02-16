package be.zele.keuzetest.service.inf;

import be.zele.keuzetest.dom.User;

public interface UserService {
    public User findByEmail(String email);
    public void saveUser (User user);

}
