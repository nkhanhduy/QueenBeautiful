package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity lưu trữ các Yêu Cầu Rút Tiền từ Ví của Cộng Tác Viên.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "YEU_CAU_RUT_TIEN")
public class YeuCauRutTien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rutTienID;

    @Column(name = "MaGiaoDich", length = 100, unique = true)
    private String maGiaoDich;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CTVID")
    private CongTacVien congTacVien;

    @Column(name = "SoTienRut")
    private BigDecimal soTienRut;

    @Column(name = "NgayYeuCau")
    private LocalDateTime ngayYeuCau;

    @Column(name = "NgayXuLy")
    private LocalDateTime ngayXuLy;

    @Column(name = "TrangThai", columnDefinition = "NVARCHAR(50)")
    private String trangThai;

    @Column(name = "GhiChu", columnDefinition = "NVARCHAR(MAX)")
    private String ghiChu;
}
