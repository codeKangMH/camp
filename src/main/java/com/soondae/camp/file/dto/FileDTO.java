package com.soondae.camp.file.dto;

import com.soondae.camp.board.entity.Board;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FileDTO {

    private String fuuid;


    private String fname;


    private Board board;
}
