package com.vision.erp.service.code.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.vision.erp.common.Search;
import com.vision.erp.service.code.CodeDAO;
import com.vision.erp.service.domain.Code;

@Repository("codeDAOImpl")
public class CodeDAOImpl implements CodeDAO {

	//field
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	//�׷��ڵ帮��Ʈ ��ü ��������
	@Override
	public List<Code> selectGroupCode() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("CodeMapper.selectGroupCodeList");
	}

	//�ڵ� ���
	@Override
	public int insertCode(Code code) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("CodeMapper.insertCode", code);
	}

	//�׷��ڵ忡 �ش��ϴ� �ڵ帮��Ʈ ��������
	@Override
	public List<Code> selectCodeList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("CodeMapper.selectCodeList", search);
	}

	//�ڵ� ����(�ڵ�� ����)
	@Override
	public int updateCode(Code code) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("CodeMapper.updateCode", code);
	}

	//�ڵ� �ϳ��� ��������, �ڵ�� �ߺ�Ȯ��
	@Override
	public Code selectDuplicateCodeNo(Code code) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("CodeMapper.selectDuplicateCodeNo", code);
	}

}
