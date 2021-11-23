package com.board3.service;

import java.util.List;

import com.board3.domain.BoardDTO;

public interface BoardService {
	public boolean registerBoard(BoardDTO params);

	public BoardDTO getBoardDetail(BoardDTO params);

	public boolean deleteBoard(BoardDTO params);

	public List<BoardDTO> getBoardList();
}
