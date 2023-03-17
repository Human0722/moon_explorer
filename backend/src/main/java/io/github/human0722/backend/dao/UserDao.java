package io.github.human0722.backend.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.human0722.backend.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xueliang
 * @date 2023-03-17 17:13
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    void store(User user);
}
