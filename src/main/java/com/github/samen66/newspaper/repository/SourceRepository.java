package com.github.samen66.newspaper.repository;

import com.github.samen66.newspaper.model.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepository extends JpaRepository<Source, Integer> {

}
