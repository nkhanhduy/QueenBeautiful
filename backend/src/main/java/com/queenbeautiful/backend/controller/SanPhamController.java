package com.queenbeautiful.backend.controller;

import com.queenbeautiful.backend.dto.SanPhamDTO;
import com.queenbeautiful.backend.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller cung cấp các API liên quan đến bảng Sản Phẩm.
 */
@RestController
@RequestMapping("/api/v1/san-pham")
@CrossOrigin(origins = "*") // Hỗ trợ frontend VueJS gọi API không bị lỗi CORS (Tên miền chéo)
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    /**
     * API: GET /api/v1/san-pham
     * Tác dụng: Lấy danh sách toàn bộ sản phẩm đang có trong CSDL kèm thông tin Danh mục & Thương hiệu.
     */
    @GetMapping
    public ResponseEntity<List<SanPhamDTO>> getAllSanPham() {
        List<SanPhamDTO> dsSanPham = sanPhamService.getAllSanPham();
        return ResponseEntity.ok(dsSanPham);
    }
}
