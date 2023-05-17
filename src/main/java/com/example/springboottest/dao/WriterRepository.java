package com.example.springboottest.dao;

import com.example.springboottest.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer,Long> {
public  Writer findByUserName(String username);

}
