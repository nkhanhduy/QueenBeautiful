package com.queenbeautiful.backend.dto;

import lombok.*;

/**
 * Data Transfer Object cho Danh Mục.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DanhMucDTO {
    private Integer danhMucID;
    private String tenDanhMuc;
    private Boolean trangThai;
}
