package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

/**
 * Entity quản lý thông tin Phiếu Xuất Kho (khi bán hàng hoặc xuất hủy).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PHIEU_XUAT_KHO")
public class PhieuXuatKho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phieuXuatID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienID")
    private NhanVien nhanVien;

    @Column(name = "NgayXuat")
    private LocalDateTime ngayXuat;

    @Column(name = "LyDoXuat", columnDefinition = "NVARCHAR(500)")
    private String lyDoXuat;
}
