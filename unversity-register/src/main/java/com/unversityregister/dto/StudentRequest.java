package com.unversityregister.dto;

import com.unversityregister.demo.Computer;
import com.unversityregister.demo.Profession;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
public class StudentRequest {
    private String name;
    private String lastName;
    private String birthDay;
    private String groupNo;
    private String studentCode;
    private Integer profession;
    private Integer computer;
}
