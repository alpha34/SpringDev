package com.board3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board3.domain.BoardDTO;
import com.board3.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/list")
	@ResponseBody
	public Map<String, Object> getList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<BoardDTO> boardList = boardService.getBoardList();
		map.put("boardList", boardList);
		return map;
	}
	
	@RequestMapping("/board/cntPlus")
	@ResponseBody
	public Map<String, Object> cntPlus(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<BoardDTO> boardList = boardService.getBoardList();
		map.put("boardList", boardList);
		return map;
	}
	
	@RequestMapping("/board/register")
	@ResponseBody
	public Map<String, Object> register(BoardDTO params){
		Map<String, Object> map = new HashMap<String, Object>();
		boolean isRegistered = false;
		isRegistered = boardService.registerBoard(params);
		map.put("isRegistered", isRegistered);
		return map;
	}
	
	@RequestMapping("/board/delete")
	@ResponseBody
	public Map<String, Object> delete(BoardDTO params){
		Map<String, Object> map = new HashMap<String, Object>();
		boolean isDeleted = false;
		isDeleted = boardService.deleteBoard(params);
		map.put("isDeleted", isDeleted);
		return map;
	}
	
	
}
