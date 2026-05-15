package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity quản lý thông tin Phiếu Nhập Kho từ nhà cung cấp.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PHIEU_NHAP_KHO")
public class PhieuNhapKho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phieuNhapID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhaCungCapID")
    private NhaCungCap nhaCungCap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienID")
    private NhanVien nhanVien;

    @Column(name = "NgayNhap")
    private LocalDateTime ngayNhap;

    @Column(name = "TongTien")
    private BigDecimal tongTien;
}
