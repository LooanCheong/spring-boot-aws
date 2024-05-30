package com.looan.book.spring_boot_aws.web.controller;

import com.looan.book.spring_boot_aws.service.posts.PostsService;
import com.looan.book.spring_boot_aws.web.dto.PostsResponseDto;
import com.looan.book.spring_boot_aws.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
