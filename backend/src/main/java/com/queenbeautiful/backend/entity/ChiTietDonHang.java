package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

/**
 * Entity lưu trữ Chi tiết từng sản phẩm được mua trong Đơn Hàng.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CHI_TIET_DON_HANG")
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietDonHangID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DonHangID")
    private DonHang donHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamID")
    private SanPham sanPham;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;
}
