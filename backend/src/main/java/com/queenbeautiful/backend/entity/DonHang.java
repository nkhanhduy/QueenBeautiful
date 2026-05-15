package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity lưu trữ thông tin Tổng quan của Đơn Hàng.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DON_HANG")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer donHangID;

    @Column(name = "MaDonHang", length = 100, unique = true)
    private String maDonHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHangID")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienID")
    private NhanVien nhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CTVID")
    private CongTacVien congTacVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VoucherID")
    private MaKhuyenMai maKhuyenMai;

    @Column(name = "NgayTao")
    private LocalDateTime ngayTao;

    @Column(name = "TongTien")
    private BigDecimal tongTien;

    @Column(name = "TienHoaHong")
    private BigDecimal tienHoaHong;

    @Column(name = "PhuongThucThanhToan", columnDefinition = "NVARCHAR(100)")
    private String phuongThucThanhToan;

    @Column(name = "TrangThaiDon", columnDefinition = "NVARCHAR(100)")
    private String trangThaiDon;
}
