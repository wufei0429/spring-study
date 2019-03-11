package orm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import orm.dao.UserDAO;
import orm.entity.User;
import orm.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public int insertUser(User user) {
        return userDAO.insert(user);
    }

    @Override
    public int deleteUser(long id) {
        return userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userDAO.updateByPrimaryKey(user);
    }

    @Override
    public List<User> selectUsers() {
        return userDAO.selectAll();
    }

    @Override
    public User getUser(long id) {
        return userDAO.selectByPrimaryKey(id);
    }
}
