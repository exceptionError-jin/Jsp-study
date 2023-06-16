package com.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.board.dao.BoardDAO;
import com.app.board.domain.BoardVO;

public class UpdateOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		BoardVO boardVO = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		Result result = new Result();
		Long boardId = Long.valueOf(req.getParameter("boardId"));
		boardVO.setBoardId(boardId);
		boardVO.setBoardTitle(req.getParameter("boardTitle"));
		boardVO.setBoardContent(req.getParameter("boardContent"));
		
		boardDAO.update(boardVO);
		
		result.setPath(req.getContextPath() + "/detailOk.board?boardId=" + boardId);
		result.setRedirect(true);
		
		return result;
	}

}
