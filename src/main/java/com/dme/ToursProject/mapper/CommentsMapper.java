package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.CommentsDto;
import com.dme.ToursProject.entity.Comments;
import com.dme.ToursProject.repository.IToursDao;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentsMapper {
    @Autowired
    private static IToursDao toursDao;

    public CommentsMapper(IToursDao toursDao) {
        this.toursDao = toursDao;
    }

    public static CommentsDto toDto(Comments comments){
        CommentsDto commentsDto = new CommentsDto();

        commentsDto.setId(comments.getId());
        commentsDto.setText(comments.getText());
        commentsDto.setName(comments.getName());
        commentsDto.setSurname(comments.getSurname());
        commentsDto.setEmail(comments.getEmail());
        commentsDto.setTourId(comments.getTours().getId());
        commentsDto.setTourTitle(comments.getTours().getTitle());
        commentsDto.setTourDescription(comments.getTours().getDescription());

        return commentsDto;
    }

    public static Comments toEntity(CommentsDto commentsDto){
        Comments comments = new Comments();

        comments.setText(commentsDto.getText());
        comments.setName(commentsDto.getName());
        comments.setSurname(commentsDto.getSurname());
        comments.setEmail(commentsDto.getEmail());
        comments.setTours(toursDao.getById(commentsDto.getTourId()));

        return comments;
    }
}
