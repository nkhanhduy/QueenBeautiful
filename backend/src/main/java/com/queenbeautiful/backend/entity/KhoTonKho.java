package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý số lượng Tồn Kho hiện tại của từng Sản Phẩm.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "KHO_TON_KHO")
public class KhoTonKho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer khoID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamID")
    private SanPham sanPham;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;
}
