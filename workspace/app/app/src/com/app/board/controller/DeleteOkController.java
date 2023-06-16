package com.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.board.dao.BoardDAO;

public class DeleteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		BoardDAO boardDAO = new BoardDAO();
		Result result = new Result();
		
		boardDAO.delete(Long.valueOf(req.getParameter("boardId")));
		
		result.setPath(req.getContextPath() + "/listOk.board");
		result.setRedirect(true);
		
		return result;
	}

}
