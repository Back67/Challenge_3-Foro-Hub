package com.alura.forohub.controller;

import com.alura.forohub.model.Post;
import com.alura.forohub.model.User;
import com.alura.forohub.service.PostService;
import com.alura.forohub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @PostMapping
    public Post createPost(@RequestParam String title, @RequestParam String content, @RequestParam String username) {
        User user = userService.findUserByUsername(username);
        return postService.createPost(title, content, user);
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
}
