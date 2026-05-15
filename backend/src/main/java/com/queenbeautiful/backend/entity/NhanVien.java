package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý thông tin Nhân Viên nội bộ (Admin, Quản lý kho, ...).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "NHAN_VIEN")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nhanVienID;

    @Column(name = "HoTen", columnDefinition = "NVARCHAR(255)")
    private String hoTen;

    @Column(name = "Sdt", length = 20)
    private String sdt;

    @Column(name = "Email", length = 255)
    private String email;

    @Column(name = "MatKhau", length = 255)
    private String matKhau;

    @Column(name = "VaiTro", columnDefinition = "NVARCHAR(50)")
    private String vaiTro;

    @Column(name = "TrangThai")
    private Boolean trangThai;
}
