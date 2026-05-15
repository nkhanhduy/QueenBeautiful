package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

/**
 * Entity quản lý thông tin chi tiết của Sản Phẩm.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SAN_PHAM")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sanPhamID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DanhMucID")
    private DanhMuc danhMuc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ThuongHieuID")
    private ThuongHieu thuongHieu;

    @Column(name = "TenSP", columnDefinition = "NVARCHAR(500)")
    private String tenSP;

    @Column(name = "GiaBan")
    private BigDecimal giaBan;

    @Column(name = "HoaHongCTV")
    private BigDecimal hoaHongCTV;

    @Column(name = "HinhAnh", length = 1000)
    private String hinhAnh;

    @Column(name = "ThanhPhan", columnDefinition = "NVARCHAR(MAX)")
    private String thanhPhan;

    @Column(name = "TinhChatDa", columnDefinition = "NVARCHAR(255)")
    private String tinhChatDa;

    @Column(name = "TrangThai", columnDefinition = "NVARCHAR(100)")
    private String trangThai;
}
