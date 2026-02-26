package com.example.testBoard.domain.controller;

import com.example.testBoard.domain.dto.BoardRequestDto;
import com.example.testBoard.domain.entity.Board;
import com.example.testBoard.domain.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
@CrossOrigin(origins = "http://localhost:3000")
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/save")
    public String savePost(@RequestBody BoardRequestDto boardRequestDto){
        boardService.savePost(boardRequestDto);
        return "게시글 등록 성공";
    }

    @GetMapping("/list")
    public List<Board> getList(){
        return boardService.getList();
    }
}
