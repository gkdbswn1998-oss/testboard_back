package com.example.testBoard.domain.controller;

import com.example.testBoard.domain.dto.BoardRequestDto;
import com.example.testBoard.domain.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/save")
    public void savePost(BoardRequestDto boardRequestDto){

    }
}
