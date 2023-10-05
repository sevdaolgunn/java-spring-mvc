package com.kozadev.web.controller;

import com.kozadev.web.dto.ClubDto;
import com.kozadev.web.models.Club;
import com.kozadev.web.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {
    private ClubService clubService;
    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs",clubs);
        return "clubs-list";
    }

    @GetMapping("/clubs/new")
    public String createClubForm(Model model ){
        Club club = new Club();
        model.addAttribute("club",club);
        return "clubs-create";
    }


}
