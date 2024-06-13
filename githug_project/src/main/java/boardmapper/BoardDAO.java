package boardmapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
//dao - 1개 sql 실행 단위가 메서드

@Mapper
@Repository
public interface BoardDAO {

    int insertBoard(BoardDTO dto);
    
    
    int totalCount();
    
    List<BoardDTO> pagingBoardList(int limit[]);
 
    //상세게시물 보기위한것
    int updateViewcount(int seq);
    
    BoardDTO getDetail(int seq);
        
    
    int deleteBoard(int seq);
    
    
    int updateBoard(BoardDTO dto);
    
    List<BoardDTO> boardSearchList(HashMap map);
    
    int boardSearchCount(HashMap map);
       
    
}
