package com.dawn.dao;

import com.dawn.domain.User;

import java.util.List;

public interface UserDao {
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

}
