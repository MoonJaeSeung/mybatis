package com.NetVillage.NetVillage.service;

import com.NetVillage.NetVillage.domain.Board;
import com.NetVillage.NetVillage.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor // Mapper 생성자 역할을 할 수 있게 해준다.
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount(){return boardMapper.boardCount();}
    public List<Board> boardList(){return boardMapper.getList();}

    public Board getBoard(Long boardId){return boardMapper.getBoard(boardId);}

    public void uploadBoard(Board board){
        boardMapper.uploadBoard(board);
    }
}
