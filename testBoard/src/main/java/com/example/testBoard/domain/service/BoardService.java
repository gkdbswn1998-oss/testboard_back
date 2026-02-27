package com.example.testBoard.domain.service;

import com.example.testBoard.domain.dto.BoardRequestDto;
import com.example.testBoard.domain.entity.Board;
import com.example.testBoard.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void savePost(BoardRequestDto boardRequestDto){
        Board board = Board.builder()
                .title(boardRequestDto.getTitle())
                .content(boardRequestDto.getContent())
                .author(boardRequestDto.getAuthor())
                .build();
        boardRepository.save(board);
    }

    public List<Board> getList(){
        return boardRepository.findAll();
    }

    public Board getOneList(Long id){
        return boardRepository.findById(id)
                .orElse(null);
    }
}
