package spring.mybatis.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//dao - 1개 sql 실행 단위가 메서드

@Repository
@Mapper
public class BoardDAO {
	@Autowired
	SqlSession session;

    int insertBoard(BoardDTO dto){	
	return session.insert("insertBoard", dto);
    }
    ////////////////////////////////////////////////////
    int getTotalCount(){
    	return session.selectOne("totalCount");
    }
    
    List<BoardDTO> getPagingBoardList(int limit[]){
    	return session.selectList("pagingBoardList", limit);
    }
   //////////////////////////////////////////////////////////
    
    //상세게시물 보기위한것
    int updateViewcount(int seq){
    	return session.update("updateViewCount", seq);
    }
    
    BoardDTO getDetail(int seq){
    	return session.selectOne("getDetail", seq);
    }
    
    ////////////////////////////////////////////////////////////
    
    
    int deleteBoard(int seq){
    	return session.delete("deleteBoard", seq);
    }
    
    
    int updateBoard(BoardDTO dto) {
    	return session.update("updateBoard", dto);
    }
    
    
    
    
    
    
    
    
    
    
    
}
