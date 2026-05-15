package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý Đánh Giá / Phản Hồi của Khách Hàng đối với Sản Phẩm.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PHAN_HOI")
public class PhanHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phanHoiID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHangID")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamID")
    private SanPham sanPham;

    @Column(name = "NoiDung", columnDefinition = "NVARCHAR(MAX)")
    private String noiDung;

    @Column(name = "DiemDanhGia")
    private Integer diemDanhGia;
}
