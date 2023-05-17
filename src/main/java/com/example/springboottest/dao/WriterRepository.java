package com.example.springboottest.dao;

import com.example.springboottest.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WriterRepository extends JpaRepository<Writer,Long> {
public Optional<Writer> findByUserName(String username);

}
