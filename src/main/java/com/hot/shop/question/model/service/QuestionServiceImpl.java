package com.hot.shop.question.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hot.shop.question.model.dao.QuestionDAO;
import com.hot.shop.question.model.vo.QuestionUser;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionDAO qDAO;

	//1:1문의 리스트(유저)
	@Override
	public ArrayList<QuestionUser> selectUserQuestionList() {
		return qDAO.selectUserQuestionList();
	}
	
	//1:1문의 글쓰기(유저 페이지 이동)
	@Override
	public QuestionUser QuestionUserWrite() {
		return null;
	}

	//1:1문의 글쓰기 (유저 실질적인 백단)
	@Override
	public int insertUserWrite(QuestionUser qUser) {
		// TODO Auto-generated method stub
		return qDAO.insertUserWrite(qUser);
	}



	
}
