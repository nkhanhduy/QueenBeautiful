package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý thông tin thương hiệu sản phẩm (VD: Romand, Klairs...).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "THUONG_HIEU")
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer thuongHieuID;

    @Column(name = "TenThuongHieu", columnDefinition = "NVARCHAR(255)")
    private String tenThuongHieu;

    @Column(name = "TrangThaiHVT")
    private Boolean trangThaiHVT;
}
