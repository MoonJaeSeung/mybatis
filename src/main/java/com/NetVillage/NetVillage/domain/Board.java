package com.NetVillage.NetVillage.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {

    private Long boardId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createDate;
    private int read;
    private Long memberId;

}
