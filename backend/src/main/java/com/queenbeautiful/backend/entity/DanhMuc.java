package com.queenbeautiful.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entity quản lý các danh mục sản phẩm (VD: Son môi, Kem dưỡng da...).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DANH_MUC")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer danhMucID;

    @Column(name = "TenDanhMuc", columnDefinition = "NVARCHAR(255)")
    private String tenDanhMuc;

    @Column(name = "TrangThai")
    private Boolean trangThai;
}
