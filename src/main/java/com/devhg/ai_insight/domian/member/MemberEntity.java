package com.devhg.ai_insight.domian.member;

import com.devhg.ai_insight.DTO.member.MemberDTO;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Setter
@Getter
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_email", nullable = false)
    private String memberEmail;

    @Column(name = "member_name", nullable = false)
    private String memberName;

    @Column(name = "member_password", nullable = false)
    private String memberPassword;

    @CreationTimestamp
    private Date joinDate;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberName(memberDTO.getMemberName());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setJoinDate(memberDTO.getJoinDate());
        return memberEntity;
    }
}