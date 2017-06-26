package com.sam.dao;

import com.sam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SamZhao on 2017/6/26.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
