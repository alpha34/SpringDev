package com.board3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board3.domain.BoardDTO;
import com.board3.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {


	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public boolean registerBoard(BoardDTO params) {
		int queryResult = 0;

		if (params.getSeq() == null) {
			queryResult = boardMapper.insertBoard(params);
		} else {
			queryResult = boardMapper.updateBoard(params);
		}

		return (queryResult == 1) ? true : false;
	}

	@Override
	public BoardDTO getBoardDetail(BoardDTO params) {
		boardMapper.selectBoardDetail(params);
		return null;
	}

	@Override
	public boolean deleteBoard(BoardDTO params) {
		int queryResult = 0;
		
		if (params.getSeq() != null) {
			queryResult = boardMapper.deleteBoard(params);
		}
		
		return (queryResult == 1) ? true : false;
	}

	@Override
	public List<BoardDTO> getBoardList() {

		List<BoardDTO> boardList = boardMapper.selectBoardList();

		return boardList;
	}

}
