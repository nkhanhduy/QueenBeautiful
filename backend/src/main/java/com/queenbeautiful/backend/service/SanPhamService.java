package com.queenbeautiful.backend.service;

import com.queenbeautiful.backend.dto.SanPhamDTO;
import com.queenbeautiful.backend.entity.SanPham;
import com.queenbeautiful.backend.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service xử lý logic nghiệp vụ cho Sản Phẩm.
 */
@Service
public class SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepository;

    /**
     * Lấy danh sách toàn bộ sản phẩm từ DB và chuyển đổi sang DTO để trả về Frontend.
     */
    public List<SanPhamDTO> getAllSanPham() {
        List<SanPham> entities = sanPhamRepository.findAll();
        return entities.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    /**
     * Hàm map Entity (Từ DB) sang DTO (Data Transfer Object cho Frontend)
     */
    private SanPhamDTO convertToDTO(SanPham entity) {
        SanPhamDTO dto = new SanPhamDTO();
        dto.setSanPhamID(entity.getSanPhamID());
        dto.setTenSP(entity.getTenSP());
        dto.setGiaBan(entity.getGiaBan());
        dto.setHoaHongCTV(entity.getHoaHongCTV());
        dto.setHinhAnh(entity.getHinhAnh());
        dto.setThanhPhan(entity.getThanhPhan());
        dto.setTinhChatDa(entity.getTinhChatDa());
        dto.setTrangThai(entity.getTrangThai());

        // Lấy tên Danh mục thay vì chỉ trả về ID
        if (entity.getDanhMuc() != null) {
            dto.setDanhMucID(entity.getDanhMuc().getDanhMucID());
            dto.setTenDanhMuc(entity.getDanhMuc().getTenDanhMuc());
        }

        // Lấy tên Thương hiệu
        if (entity.getThuongHieu() != null) {
            dto.setThuongHieuID(entity.getThuongHieu().getThuongHieuID());
            dto.setTenThuongHieu(entity.getThuongHieu().getTenThuongHieu());
        }

        return dto;
    }
}
