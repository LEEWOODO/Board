package com.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentDTO extends CommonDTO{

	private Long idx;
	
	private Long boardIdx;
	
	private String content;
	
	private String writer;
}
