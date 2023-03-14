package com.poecat.redd.repository;

import com.poecat.redd.model.Post;
import com.poecat.redd.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

//    Page<Post> findAllByOrderByCreatedAtDesc(Pageable pageable);
//    Page<Post> findAllByAuthorOrderByCreatedAtDesc(User author, Pageable pageable);
}
