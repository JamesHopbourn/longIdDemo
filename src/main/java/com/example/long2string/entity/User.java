package com.example.long2string.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.long2string.common.enums.PrivacyTypeEnum;
import com.example.long2string.common.utils.PrivacyEncrypt;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @TableId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonSerialize(using = ToStringSerializer.class)
    @Column(nullable = false, columnDefinition = "integer(20)")
    private Long adminId;

    @Column(nullable = false, columnDefinition = "text(20)")
    private String userName;

    @PrivacyEncrypt(type = PrivacyTypeEnum.PHONE)
    @Column(columnDefinition = "integer(13)")
    private String phoneNumber;
}