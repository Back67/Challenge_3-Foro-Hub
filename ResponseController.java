package com.alura.forohub.controller;

import com.alura.forohub.model.Post;
import com.alura.forohub.model.Response;
import com.alura.forohub.model.User;
import com.alura.forohub.service.PostService;
import com.alura.forohub.service.ResponseService;
import com.alura.forohub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/responses")
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @PostMapping
    public Response createResponse(@RequestParam String content, @RequestParam Long postId, @RequestParam String username) {
        Post post = postService.getPostById(postId);
        User user = userService.find
