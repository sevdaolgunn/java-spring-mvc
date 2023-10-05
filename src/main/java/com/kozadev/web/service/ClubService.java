package com.kozadev.web.service;

import com.kozadev.web.dto.ClubDto;
import com.kozadev.web.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);
    ClubDto findClubById(Long clubId);
    void updateClub(ClubDto clubDto);
    void delete(Long clubId);
    List<ClubDto> searchClubs(String query);

}
