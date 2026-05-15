package com.queenbeautiful.backend.dto;

import lombok.*;
import java.math.BigDecimal;

/**
 * Data Transfer Object cho Sản Phẩm, chứa thông tin phẳng từ Danh Mục và Thương Hiệu.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamDTO {
    private Integer sanPhamID;
    private String tenSP;
    private BigDecimal giaBan;
    private BigDecimal hoaHongCTV;
    private String hinhAnh;
    private String thanhPhan;
    private String tinhChatDa;
    private String trangThai;

    // Mapping từ Entity liên quan (dễ hiển thị lên bảng của VueJS)
    private Integer danhMucID;
    private String tenDanhMuc;
    
    private Integer thuongHieuID;
    private String tenThuongHieu;
}
