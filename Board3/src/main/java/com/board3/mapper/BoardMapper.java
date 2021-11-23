package com.board3.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board3.domain.BoardDTO;

@Mapper
public interface BoardMapper {

	public int insertBoard(BoardDTO params);

	public int selectBoardDetail(BoardDTO params);

	public int updateBoard(BoardDTO params);

	public int deleteBoard(BoardDTO params);

	public List<BoardDTO> selectBoardList();

	public int selectBoardTotalCount();
	
}
