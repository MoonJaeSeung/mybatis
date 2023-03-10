package com.NetVillage.NetVillage.controller;

import com.NetVillage.NetVillage.domain.Board;
import com.NetVillage.NetVillage.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor //생성자 주입을 임의의 코드없이 자동으로 설정해준다.
public class BoardController {

    private final BoardService service;



    @GetMapping("/hello")
    public String Hello(){
        return "/boards/hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("cnt",service.boardCount());
        model.addAttribute("test",service.boardList());

        return "/boards/hello";
    }

    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("list",service.boardList());
        return "/boards/main";
    }

    @GetMapping("/view")
    public String viewBoard(Model model, Long boardId){
        model.addAttribute("view",service.getBoard(boardId));
        return "/boards/view";
    }

    @GetMapping("/upload")
    public String uploadBoardForm(){
        return "/boards/upload";
    }

    @PostMapping("/upload")
    public String uploadBoard(Board board){
        service.uploadBoard(board);
        return "redirect:/board/main";
    }
}
//