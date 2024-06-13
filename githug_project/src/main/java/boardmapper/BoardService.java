package boardmapper;

import java.util.HashMap;
import java.util.List;

public interface BoardService {
	int registerBoard(BoardDTO dto);
	//////////////////////////////////////////////////
	int getTotalBoard();
	
	List<BoardDTO> getPagingBoardList(int [] limit);
	//////////////////////////////////////////////////
	
	
	BoardDTO updateViewcountAndGetDetail(int seq);
	
	
	int deleteBoard(int seq);
	
	int updateBoard(BoardDTO dto);
	
	List<BoardDTO> getSearchPagingBoardList(HashMap map);
	
	int getBoardSEarchCount(HashMap map);
	
}
