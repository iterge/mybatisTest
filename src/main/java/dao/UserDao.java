package dao;

import entities.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2018/5/25.
 */

public interface UserDao {
    @Select("select * from USer where id = #{id}")
    public User getUser(String id);
}
