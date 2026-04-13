package com.example.schedule2.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;      // 일정 제목
    private String content;    // 일정 내용
    private String author;     // 작성자명
    private String password;   // 비밀번호

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Schedule(String title, String content, String author, String password) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.password = password;
    }

    public void update(String title, String content, String author, String password){
        this.title = title;
        this.content = content;
        this.author = author;
        this.password = password;
    }
}
