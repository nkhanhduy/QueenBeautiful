package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

/**
 * Entity quản lý thông tin Cộng Tác Viên (Affiliate).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CONG_TAC_VIEN")
public class CongTacVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ctvID;

    @Column(name = "HoTen", columnDefinition = "NVARCHAR(255)")
    private String hoTen;

    @Column(name = "Sdt", length = 20)
    private String sdt;

    @Column(name = "Email", length = 255)
    private String email;

    @Column(name = "MatKhau", length = 255)
    private String matKhau;

    @Column(name = "LinkMXH", length = 500)
    private String linkMXH;

    @Column(name = "SoTaiKhoan", length = 50)
    private String soTaiKhoan;

    @Column(name = "NganHang", columnDefinition = "NVARCHAR(255)")
    private String nganHang;

    @Column(name = "MaGioiThieu", length = 50, unique = true)
    private String maGioiThieu;

    @Column(name = "SoDuVi")
    private BigDecimal soDuVi;

    @Column(name = "TongDoanhThu")
    private BigDecimal tongDoanhThu;

    @Column(name = "TrangThaiPheDuyet", columnDefinition = "NVARCHAR(50)")
    private String trangThaiPheDuyet;
}
