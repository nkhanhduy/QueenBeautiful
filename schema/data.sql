USE QueenBeautiful;
GO

-- 1. Tài khoản Admin & Nhân viên
INSERT INTO NHAN_VIEN (HoTen, Sdt, Email, MatKhau, VaiTro, TrangThai)
VALUES 
(N'Quản Trị Viên', '0987654321', 'admin@queenbeautiful.com', 'admin123', N'Admin', 1),
(N'Nhân Viên Kho', '0912345678', 'kho@queenbeautiful.com', 'kho123', N'Kho', 1);

-- 2. Danh mục sản phẩm
INSERT INTO DANH_MUC (TenDanhMuc, TrangThai) VALUES
(N'Son môi', 1),
(N'Kem dưỡng da', 1),
(N'Sữa rửa mặt', 1),
(N'Nước tẩy trang', 1);

-- 3. Thương hiệu
INSERT INTO THUONG_HIEU (TenThuongHieu, TrangThaiHVT) VALUES
(N'Romand', 1),
(N'Klairs', 1),
(N'Cocoon', 1),
(N'Innisfree', 1);

-- 4. Nhà cung cấp
INSERT INTO NHA_CUNG_CAP (TenNhaCungCap, Sdt, DiaChi) VALUES
(N'Công ty TNHH Mỹ Phẩm HQ', '0243111222', N'Tòa nhà Keangnam, Hà Nội'),
(N'Đại lý phân phối Cocoon VN', '0283334445', N'Quận 1, Hồ Chí Minh');

-- 5. Sản phẩm
INSERT INTO SAN_PHAM (DanhMucID, ThuongHieuID, TenSP, GiaBan, HoaHongCTV, HinhAnh, ThanhPhan, TinhChatDa, TrangThai) VALUES
(1, 1, N'Son tint nước siêu lì Romand Juicy Lasting Tint', 150000, 15000, 'romand_tint.jpg', N'Nước, Glyxerin, Phẩm màu an toàn', N'Mọi loại da', N'Đang bán'),
(2, 2, N'Kem Dưỡng Ẩm Sâu Klairs Rich Moist Soothing Cream', 350000, 35000, 'klairs_cream.jpg', N'Chiết xuất rau má, bơ hạt mỡ', N'Da khô, Da nhạy cảm', N'Đang bán'),
(3, 3, N'Sữa Rửa Mặt Nghệ Hưng Yên Cocoon', 175000, 17500, 'cocoon_srm.jpg', N'Chiết xuất nghệ, Salicylic Acid', N'Da mụn, Da dầu', N'Đang bán');

-- 6. Tồn kho
INSERT INTO KHO_TON_KHO (SanPhamID, SoLuongTon) VALUES
(1, 100),
(2, 50),
(3, 200);

-- 7. Khách hàng mẫu
INSERT INTO KHACH_HANG (MaKhachHang, HoTen, Sdt, Email, LoaiKhach) VALUES
('KH-1A2B3C', N'Nguyễn Thị Thu', '0911222333', 'thu.nguyen@gmail.com', N'Thuong'),
('KH-VIP001', N'Lê Văn Vip', '0922333444', 'vip.le@gmail.com', N'VIP');

-- 8. Cộng tác viên mẫu
INSERT INTO CONG_TAC_VIEN (HoTen, Sdt, Email, MatKhau, LinkMXH, SoTaiKhoan, NganHang, MaGioiThieu, SoDuVi, TongDoanhThu, TrangThaiPheDuyet) VALUES
(N'Trần Affiliate', '0933444555', 'tran.aff@gmail.com', 'ctv123', 'tiktok.com/@tran_beauty', '1903333333', N'Techcombank', 'CTV-999', 500000, 5000000, N'DaDuyet');

-- 9. Mã Khuyến Mãi mẫu
INSERT INTO MA_KHUYEN_MAI (MaCode, LoaiGiam, GiaTriGiam, GiaTriToiDa, DieuKienDonToiThieu, NgayBatDau, NgayKetThuc, SoLuong, TrangThai) VALUES
('WELCOME2026', N'PhanTram', 10, 50000, 200000, '2026-05-01', '2026-12-31', 100, 1),
('FREESHIP', N'TienMat', 30000, 30000, 150000, '2026-05-01', '2026-06-01', 50, 1);
