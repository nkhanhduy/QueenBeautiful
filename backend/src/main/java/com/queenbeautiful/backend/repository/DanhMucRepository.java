package com.queenbeautiful.backend.repository;

import com.queenbeautiful.backend.entity.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository giao tiếp với bảng DANH_MUC trong SQL Server.
 */
@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer> {
}
