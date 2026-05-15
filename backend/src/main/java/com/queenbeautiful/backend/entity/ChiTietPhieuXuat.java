package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý Chi tiết các sản phẩm và số lượng trong một Phiếu Xuất Kho.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CHI_TIET_PHIEU_XUAT")
public class ChiTietPhieuXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietPhieuXuatID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PhieuXuatID")
    private PhieuXuatKho phieuXuatKho;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamID")
    private SanPham sanPham;

    @Column(name = "SoLuong")
    private Integer soLuong;
}
