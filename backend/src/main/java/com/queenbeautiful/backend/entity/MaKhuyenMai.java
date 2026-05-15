package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity quản lý các Voucher / Mã khuyến mãi của hệ thống.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MA_KHUYEN_MAI")
public class MaKhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voucherID;

    @Column(name = "MaCode", length = 50, unique = true)
    private String maCode;

    @Column(name = "LoaiGiam", columnDefinition = "NVARCHAR(50)")
    private String loaiGiam;

    @Column(name = "GiaTriGiam")
    private BigDecimal giaTriGiam;

    @Column(name = "GiaTriToiDa")
    private BigDecimal giaTriToiDa;

    @Column(name = "DieuKienDonToiThieu")
    private BigDecimal dieuKienDonToiThieu;

    @Column(name = "NgayBatDau")
    private LocalDateTime ngayBatDau;

    @Column(name = "NgayKetThuc")
    private LocalDateTime ngayKetThuc;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "TrangThai")
    private Boolean trangThai;
}
