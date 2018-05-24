package com.jysp2p.springbootdemo1.service;

import com.jysp2p.springbootdemo1.enmus.ResultEnum;
import com.jysp2p.springbootdemo1.exception.MyException;
import com.jysp2p.springbootdemo1.pojo.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author oyr
 * @Description: ${todo}
 * @date 2018/5/23 0023下午 2:09
 */
@Service
public class UserService {

    private static Map map = new HashMap();

    static {
        map.put(new Long(1), new User(new Long(1), "name1", "男", 10));
        map.put(new Long(1), new User(new Long(2), "name2", "男", 20));
        map.put(new Long(1), new User(new Long(3), "name3", "男", 30));

    }

    public void hello() throws MyException {
        throw new MyException(ResultEnum.SERVER_ERROR);
    }


    public User findById(Long id) {
        return (User) map.get(id);
    }
}
