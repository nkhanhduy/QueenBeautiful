package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý thông tin Khách Hàng.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "KHACH_HANG")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer khachHangID;

    @Column(name = "MaKhachHang", length = 50, unique = true)
    private String maKhachHang;

    @Column(name = "HoTen", columnDefinition = "NVARCHAR(255)")
    private String hoTen;

    @Column(name = "Sdt", length = 20)
    private String sdt;

    @Column(name = "Email", length = 255)
    private String email;

    @Column(name = "GoogleID", length = 255)
    private String googleID;

    @Column(name = "LoaiKhach", columnDefinition = "NVARCHAR(50)")
    private String loaiKhach;
}
