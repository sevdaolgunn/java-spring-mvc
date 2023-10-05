package com.kozadev.web.service.impl;

import com.kozadev.web.dto.ClubDto;
import com.kozadev.web.models.Club;
import com.kozadev.web.repository.ClubRepository;
import com.kozadev.web.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;
    public ClubServiceImpl(ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }
    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club){
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }

    @Override
    public Club saveClub(ClubDto clubDto) {
        return null;
    }

    @Override
    public ClubDto findClubById(Long clubId) {
        return null;
    }

    @Override
    public void updateClub(ClubDto clubDto) {

    }

    @Override
    public void delete(Long clubId) {

    }

    @Override
    public List<ClubDto> searchClubs(String query) {
        return null;
    }
}
