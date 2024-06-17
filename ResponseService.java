package com.alura.forohub.service;

import com.alura.forohub.model.Post;
import com.alura.forohub.model.Response;
import com.alura.forohub.model.User;
import com.alura.forohub.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    public Response createResponse(String content, Post post, User user) {
        Response response = new Response();
        response.setContent(content);
        response.setPost(post);
        response.setUser(user);
        return responseRepository.save(response);
    }
}
