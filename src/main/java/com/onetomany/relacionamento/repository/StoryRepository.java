package com.onetomany.relacionamento.repository;

import com.onetomany.relacionamento.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story, String> {
}
