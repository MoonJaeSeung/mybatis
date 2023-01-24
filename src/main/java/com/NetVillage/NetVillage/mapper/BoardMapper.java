package com.NetVillage.NetVillage.mapper;

import com.NetVillage.NetVillage.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //해당 인터페이스가 MapperScan의 대상을 모아놓은 저장소
//이 인터페이스로 mapper.xml을 통해 sql명령어로 데이터베이스에 접근
public interface BoardMapper {
    int boardCount();

    List<Board> getList();

    Board getBoard(Long boardId);

    void uploadBoard(Board board);
}
