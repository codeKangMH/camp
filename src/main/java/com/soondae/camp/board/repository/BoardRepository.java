package com.soondae.camp.board.repository;

import com.soondae.camp.board.entity.Board;
import com.soondae.camp.board.repository.dynamic.BoardSearchRepo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearchRepo {



}
