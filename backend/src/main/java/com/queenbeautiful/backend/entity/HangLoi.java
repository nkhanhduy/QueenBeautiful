package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

/**
 * Entity quản lý danh sách Hàng Lỗi, Hàng Hết Hạn cần xử lý.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HANG_LOI")
public class HangLoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hangLoiID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamID")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienID")
    private NhanVien nhanVien;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "PhanLoai", columnDefinition = "NVARCHAR(255)")
    private String phanLoai;

    @Column(name = "HinhAnh", length = 1000)
    private String hinhAnh;

    @Column(name = "DeXuatXuLy", columnDefinition = "NVARCHAR(MAX)")
    private String deXuatXuLy;

    @Column(name = "NgayBaoCao")
    private LocalDateTime ngayBaoCao;
}
