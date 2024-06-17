package com.alura.forohub.service;

import com.alura.forohub.model.Post;
import com.alura.forohub.model.User;
import com.alura.forohub.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PostServiceTest {

    @InjectMocks
    private PostService postService;

    @Mock
    private PostRepository postRepository;

    public PostServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreatePost() {
        User user = new User();
        user.setUsername("testuser");

        Post post = new Post();
        post.setTitle("Test Title");
        post.setContent("Test Content");
        post.setUser(user);

        when(postRepository.save(post)).thenReturn(post);

        Post createdPost = postService.createPost("Test Title", "Test Content", user);

        assertEquals("Test Title", createdPost.getTitle());
    }

    @Test
    public void testGetPostById() {
        Post post = new Post();
        post.setId(1L);
        post.setTitle("Test Title");

        when(postRepository.findById(1L)).thenReturn(Optional.of(post));

        Post foundPost = postService.getPostById(1L);

        assertEquals(1L, foundPost.getId());
        assertEquals("Test Title", foundPost.getTitle());
    }
  }
