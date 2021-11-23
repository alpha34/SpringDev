package com.board3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board3.domain.BoardDTO;
import com.board3.mapper.BoardMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class MapperTests {

	@Autowired
	private BoardMapper boardMapper;

//	@Test
//	public void testOfInsert() {
//		BoardDTO params = new BoardDTO();
//		params.setTitle("1번 게시글 제목");
//		params.setContent("1번 게시글 내용");
//		params.setWriter("테스터");
//
//		int result = boardMapper.insertBoard(params);
//		System.out.println("결과는 " + result + "입니다.");
//	}
	
	
//	@Test
//	public void testOfSelectDetail() {
//		BoardDTO params = new BoardDTO();
//		params.setSeq("10");
//		BoardDTO board = boardMapper.selectBoardDetail(params);
//		try {
//			String boardJson = new ObjectMapper().writeValueAsString(board);
//
//			System.out.println("=========================");
//			System.out.println(boardJson);
//			System.out.println("=========================");
//
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//	}	
	
	
//	@Test
//	public void testOfUpdate() {
//		BoardDTO params = new BoardDTO();
//		params.setTitle("1번 게시글 제목을 수정합니다.");
//		params.setContent("1번 게시글 내용을 수정합니다.");
//		params.setSeq("10");
//
//		int result = boardMapper.updateBoard(params);
//		System.out.println(result);
//		
//	}	
	
	@Test
	public void testOfDelete() {
		BoardDTO params = new BoardDTO();
		params.setSeq("10");
		int result = boardMapper.deleteBoard(params);
	}	

}