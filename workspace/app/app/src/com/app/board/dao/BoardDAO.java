package com.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardVO;
import com.app.board.domain.Search;
import com.app.mybatis.config.MyBatisConfig;

public class BoardDAO {
	public SqlSession sqlSession;
	
	public BoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	게시글 전체 조회
	public List<BoardDTO> selectAll(HashMap<String, Object> pagable){
		return sqlSession.selectList("board.selectAll", pagable);
	}
	
//	전체 게시글 개수 조회
	public int getTotal(Search search) {
		return sqlSession.selectOne("board.getTotal", search);
	}
	
//	게시글 추가
	public void insert(BoardVO boardVO) {
		sqlSession.insert("board.insert", boardVO);
	}
	
//	게시글 조회
	public BoardDTO select(Long boardId) {
		return sqlSession.selectOne("board.select", boardId);
	}
	
//	게시글 수정
	public void update(BoardVO boardVO) {
		sqlSession.update("board.update", boardVO);
	}
	
//	게시글 삭제
	public void delete(Long boardId) {
		sqlSession.delete("board.delete", boardId);
	}
	
//	조회수 증가
	public void updateReadCount(Long boardId) {
		sqlSession.update("board.updateReadCount", boardId);
	}
	
//	최근 게시글 번호 조회
	public Long selectCurrentSequence() {
		return sqlSession.selectOne("board.selectCurrentSequence");
	}
	
}




















