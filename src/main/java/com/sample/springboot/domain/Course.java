package com.sample.springboot.domain;

public class Course {
    private String name;
    private String professor;
    private String link;
    private String id;

    public String getName() {
        return name;
    }

    public String getProfessor() {
        return professor;
    }

    public String getLink() {
        return link;
    }

    public String getId() {
        return id;
    }

    public Course(String name, String professor, String link, String id) {
        this.name = name;
        this.professor = professor;
        this.link = link;
        this.id = id;
    }
}
