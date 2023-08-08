package com.passion.teampassiontrelloproject.column.service;

import com.passion.teampassiontrelloproject.board.entity.Board;
import com.passion.teampassiontrelloproject.column.dto.ColumnsRequestDto;
import com.passion.teampassiontrelloproject.column.dto.ColumnsResponseDto;
import com.passion.teampassiontrelloproject.column.entity.Columns;
import com.passion.teampassiontrelloproject.user.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface ColumnsService {


    ColumnsResponseDto createColumns(ColumnsResponseDto requestDto, User user);

    ColumnsResponseDto updateColumns(Columns columns, ColumnsRequestDto requestDto);

    ColumnsResponseDto createColumns(ColumnsRequestDto requestDto, User user);

    void deleteColumns(Columns columns, User user);

    Columns findColumns(long id);

    @Transactional
    ColumnsResponseDto updateColumns(Columns columns, ColumnsRequestDto requestDto, User user);

    Board findBoard(long id);
}
