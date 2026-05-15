package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

/**
 * Entity quản lý Chi tiết các sản phẩm và số lượng trong một Phiếu Nhập Kho.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CHI_TIET_PHIEU_NHAP")
public class ChiTietPhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietPhieuNhapID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PhieuNhapID")
    private PhieuNhapKho phieuNhapKho;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamID")
    private SanPham sanPham;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;
}
