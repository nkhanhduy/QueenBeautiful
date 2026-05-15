package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý thông tin Nhà Cung Cấp sản phẩm.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "NHA_CUNG_CAP")
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nhaCungCapID;

    @Column(name = "TenNhaCungCap", columnDefinition = "NVARCHAR(255)")
    private String tenNhaCungCap;

    @Column(name = "Sdt", length = 20)
    private String sdt;

    @Column(name = "DiaChi", columnDefinition = "NVARCHAR(MAX)")
    private String diaChi;
}
