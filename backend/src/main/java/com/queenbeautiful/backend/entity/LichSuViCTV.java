package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity lưu lại Lịch Sử Biến Động Số Dư trong Ví của Cộng Tác Viên.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LICH_SU_VI_CTV")
public class LichSuViCTV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lichSuViID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CTVID")
    private CongTacVien congTacVien;

    @Column(name = "LoaiGiaoDich", columnDefinition = "NVARCHAR(100)")
    private String loaiGiaoDich;

    @Column(name = "SoTien")
    private BigDecimal soTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DonHangID")
    private DonHang donHang;

    @Column(name = "MoTa", columnDefinition = "NVARCHAR(500)")
    private String moTa;

    @Column(name = "ThoiGian")
    private LocalDateTime thoiGian;
}
