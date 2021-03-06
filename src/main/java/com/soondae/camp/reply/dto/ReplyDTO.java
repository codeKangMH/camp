package com.soondae.camp.reply.dto;

import com.soondae.camp.board.entity.Board;
import lombok.*;

import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReplyDTO {
    private Long rno;

    private String rtext;

    private String rwriter;

    private LocalDateTime rregDate;

    private LocalDateTime rmodDate;

    private boolean rdeleted;

    private Board board;

    public void changeReply(String rtext){
        this.rtext = rtext;
    }

    public void deleteReply(boolean rdeleted) {
        this.rdeleted = rdeleted;
    }

}
