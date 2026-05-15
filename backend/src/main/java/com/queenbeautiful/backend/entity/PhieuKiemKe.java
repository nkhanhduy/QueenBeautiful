package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

/**
 * Entity quản lý Phiếu Kiểm Kê kho định kỳ.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PHIEU_KIEM_KE")
public class PhieuKiemKe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phieuKiemKeID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienID")
    private NhanVien nhanVien;

    @Column(name = "NgayKiemKe")
    private LocalDateTime ngayKiemKe;

    @Column(name = "GhiChu", columnDefinition = "NVARCHAR(MAX)")
    private String ghiChu;
}
