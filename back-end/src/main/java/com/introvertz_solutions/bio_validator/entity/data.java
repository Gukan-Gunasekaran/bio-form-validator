package com.introvertz_solutions.bio_validator.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class data {
    @Id
    int uid;

    @Lob
    @Column(name="img",columnDefinition = "LONGBLOB")
    private byte[] img;

    @Lob
    @Column(name = "sign",columnDefinition = "LONGBLOB")
    private byte[] sign;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public byte[] getSign() {
        return sign;
    }

    public void setSign(byte[] sign) {
        this.sign = sign;
    }
}
