package com.kozadev.web.service;

import com.kozadev.web.dto.ClubDto;
import com.kozadev.web.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(Club club);
    ClubDto findClubById(long clubId);
    void updateClub(ClubDto club);
    void delete(Long clubId);
    List<ClubDto> searchClubs(String query);

}
