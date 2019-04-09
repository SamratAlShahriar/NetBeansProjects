package com.gov.npi.lms.dao;

import com.gov.npi.lms.domain.CreateUser;
import java.util.List;

/**
 *
 * @author Md. Samrat Al Shahriar Nayeem
 */
public interface CreateUserDAO {

    public void createUser(CreateUser crtusrcu);

    public void editUser(CreateUser crtusreu);

    public void deleteUser(int crtusrduID);

    List<CreateUser> getList();

    CreateUser getUser(int id);

    CreateUser getUserByUsername(String username);

    CreateUser getUserByEmail(String email);
}
