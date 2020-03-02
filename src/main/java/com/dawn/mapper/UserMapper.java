package com.dawn.mapper;

import com.dawn.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /** 添加 */
    public void add(User user);
    /** 修改 */
    public void update(User user);
    /** 删除 */
    public void del(Integer id);
    /** 查询 */
    public User selectById(Integer id);
    /** 查询全部 */
    public List<User> selectAll();
    /** 模糊查询 */
    public List<User> selectLike(User user);
    /** 添加 */
    public void addParams(@Param("name") String name,@Param("age") Integer age,@Param("info") String info);
}
