package j.service;

import j.model.User;

import java.util.List;

public interface IUserService extends ICrudService<User,Long>{
    List<User> findByName(String name);
}
