package com.devhg.ai_insight.controller.member;


import com.devhg.ai_insight.DTO.member.MemberDTO;
import com.devhg.ai_insight.domian.member.MemberEntity;
import com.devhg.ai_insight.service.member.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/")
    public String home(){
        return "member/login";
    }

    /*@GetMapping("/")
    public String home(){
        return "member/login";
    }*/

    @GetMapping("/member/main")
    public String mainPage(){
        return "member/main";
    }

    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession seesion, Model model){
        MemberDTO loginResult = memberService.login(memberDTO);
        if(loginResult != null) {
            seesion.setAttribute("loginEmail", loginResult.getMemberEmail());
            return "redirect:/member/main";
        } else {
            model.addAttribute("loginError", "아이디 또는 비밀번호가 일치하지 않습니다.");
            return "redirect:/";
        }
    }

    @GetMapping("/member/save")
    public String saveForm(@ModelAttribute MemberEntity member, Model model){
        model.addAttribute("member", member);
        return "member/signup";
    }

    @PostMapping("/member/save")    // name값을 requestparam에 담아온다
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "redirect:/";
    }
}
