package com.queenbeautiful.backend.repository;

import com.queenbeautiful.backend.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository giao tiếp với bảng SAN_PHAM trong SQL Server.
 */
@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}
