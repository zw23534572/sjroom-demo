package spring.boot.dubbo.producter.service.impl;

import org.springframework.stereotype.Service;
import spring.boot.dubbo.producter.service.UserService;

/**
 * <B>说明：</B><BR>
 *
 * @author ZhouWei
 * @version 1.0.0.
 * @date 2018-09-28 14-38
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getAll() {
        return "aa";
    }
}
