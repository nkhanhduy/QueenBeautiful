# Thiết Kế Cơ Sở Dữ Liệu - QueenBeautiful

## 1. Phân hệ Sản phẩm & Bán hàng
- **DANH_MUC**
  - `DanhMucID` (INT, PK, Tự tăng)
  - `TenDanhMuc` (NVARCHAR)
  - `TrangThai` (BIT)

- **THUONG_HIEU**
  - `ThuongHieuID` (INT, PK, Tự tăng)
  - `TenThuongHieu` (NVARCHAR)
  - `TrangThaiHVT` (BIT - Hợp tác/Ngừng)

- **SAN_PHAM**
  - `SanPhamID` (INT, PK, Tự tăng)
  - `DanhMucID` (INT, FK)
  - `ThuongHieuID` (INT, FK)
  - `TenSP` (NVARCHAR)
  - `GiaBan` (DECIMAL)
  - `HoaHongCTV` (DECIMAL - Mức % hoặc số tiền hoa hồng cụ thể)
  - `HinhAnh` (VARCHAR)
  - `ThanhPhan`, `TinhChatDa` (NVARCHAR)
  - `TrangThai` (NVARCHAR - Đang bán/Ngừng)

- **MA_KHUYEN_MAI (Voucher)**
  - `VoucherID` (INT, PK, Tự tăng)
  - `MaCode` (VARCHAR)
  - `LoaiGiam` (NVARCHAR - PhanTram/TienMat)
  - `GiaTriGiam` (DECIMAL)
  - `GiaTriToiDa` (DECIMAL)
  - `DieuKienDonToiThieu` (DECIMAL)
  - `NgayBatDau`, `NgayKetThuc` (DATETIME)
  - `SoLuong` (INT)
  - `TrangThai` (BIT)

## 2. Phân hệ Người dùng & Cộng Tác Viên (Affiliate)
- **KHACH_HANG**
  - `KhachHangID` (INT, PK, Tự tăng - ID dùng nội bộ)
  - `MaKhachHang` (VARCHAR/UUID - Public ID dùng để bảo mật khi giao tiếp API)
  - `HoTen` (NVARCHAR)
  - `Sdt` (VARCHAR)
  - `Email` (VARCHAR)
  - `GoogleID` (VARCHAR)
  - `LoaiKhach` (NVARCHAR - Thuong, VIP)

- **NHAN_VIEN**
  - `NhanVienID` (INT, PK, Tự tăng)
  - `HoTen` (NVARCHAR)
  - `Sdt` (VARCHAR)
  - `Email` (VARCHAR)
  - `MatKhau` (VARCHAR)
  - `VaiTro` (NVARCHAR - Admin, Kho, QuanLy, Nhanvienban)
  - `TrangThai` (BIT)

- **CONG_TAC_VIEN**
  - `CTVID` (INT, PK, Tự tăng)
  - `HoTen` (NVARCHAR)
  - `Sdt` (VARCHAR)
  - `Email` (VARCHAR)
  - `MatKhau` (VARCHAR)
  - `LinkMXH` (VARCHAR)
  - `SoTaiKhoan` (VARCHAR)
  - `NganHang` (NVARCHAR)
  - `MaGioiThieu` (VARCHAR - Dùng để tạo link affiliate)
  - `SoDuVi` (DECIMAL - Số tiền hiện có thể rút)
  - `TongDoanhThu` (DECIMAL - Tổng tiền đã bán được)
  - `TrangThaiPheDuyet` (NVARCHAR - ChoDuyet, DaDuyet, TuChoi)

- **LICH_SU_VI_CTV**
  - `LichSuViID` (INT, PK, Tự tăng)
  - `CTVID` (INT, FK)
  - `LoaiGiaoDich` (NVARCHAR - CongHoaHong / TruTienRut)
  - `SoTien` (DECIMAL)
  - `DonHangID` (INT, FK - Nullable)
  - `MoTa` (NVARCHAR)
  - `ThoiGian` (DATETIME)

- **YEU_CAU_RUT_TIEN**
  - `RutTienID` (INT, PK, Tự tăng - ID dùng nội bộ)
  - `MaGiaoDich` (VARCHAR/UUID - Mã giao dịch an toàn, dùng để tra cứu)
  - `CTVID` (INT, FK)
  - `SoTienRut` (DECIMAL)
  - `NgayYeuCau` (DATETIME)
  - `NgayXuLy` (DATETIME)
  - `TrangThai` (NVARCHAR - ChoXuLy, DaChuyen, TuChoi)
  - `GhiChu` (NVARCHAR)

## 3. Phân hệ Đơn hàng & Dịch vụ
- **DON_HANG**
  - `DonHangID` (INT, PK, Tự tăng - ID dùng nội bộ)
  - `MaDonHang` (VARCHAR/UUID - Mã đơn công khai để khách tra cứu, tránh IDOR)
  - `KhachHangID` (INT, FK)
  - `NhanVienID` (INT, FK - Nullable)
  - `CTVID` (INT, FK - Nullable)
  - `VoucherID` (INT, FK - Nullable)
  - `NgayTao` (DATETIME)
  - `TongTien` (DECIMAL)
  - `TienHoaHong` (DECIMAL - Số tiền hoa hồng của CTV ở đơn này)
  - `PhuongThucThanhToan` (Online, COD)
  - `TrangThaiDon` (ChoXacNhan, DangGiao, DaGiao, Huy, TraHang)

- **CHI_TIET_DON_HANG**
  - `ChiTietDonHangID` (INT, PK, Tự tăng)
  - `DonHangID` (INT, FK)
  - `SanPhamID` (INT, FK)
  - `SoLuong` (INT)
  - `DonGia` (DECIMAL)

- **PHAN_HOI**
  - `PhanHoiID` (INT, PK, Tự tăng)
  - `KhachHangID` (INT, FK)
  - `SanPhamID` (INT, FK)
  - `NoiDung` (NVARCHAR)
  - `DiemDanhGia` (INT)

## 4. Phân hệ Nhập xuất & Kho
- **NHA_CUNG_CAP**
  - `NhaCungCapID` (INT, PK, Tự tăng)
  - `TenNhaCungCap` (NVARCHAR)
  - `Sdt` (VARCHAR)
  - `DiaChi` (NVARCHAR)

- **KHO_TON_KHO**
  - `KhoID` (INT, PK, Tự tăng)
  - `SanPhamID` (FK)
  - `SoLuongTon` (INT)

- **PHIEU_NHAP_KHO**
  - `PhieuNhapID` (INT, PK, Tự tăng)
  - `NhaCungCapID` (INT, FK)
  - `NhanVienID` (INT, FK)
  - `NgayNhap` (DATETIME)
  - `TongTien` (DECIMAL)

- **CHI_TIET_PHIEU_NHAP**
  - `ChiTietPhieuNhapID` (INT, PK, Tự tăng)
  - `PhieuNhapID` (INT, FK)
  - `SanPhamID` (INT, FK)
  - `SoLuong` (INT)
  - `GiaNhap` (DECIMAL)

- **PHIEU_XUAT_KHO**
  - `PhieuXuatID` (INT, PK, Tự tăng)
  - `NhanVienID` (FK)
  - `NgayXuat` (DATETIME)
  - `LyDoXuat` (NVARCHAR)

- **CHI_TIET_PHIEU_XUAT**
  - `ChiTietPhieuXuatID` (INT, PK, Tự tăng)
  - `PhieuXuatID` (INT, FK)
  - `SanPhamID` (INT, FK)
  - `SoLuong` (INT)

- **PHIEU_KIEM_KE**
  - `PhieuKiemKeID` (INT, PK, Tự tăng)
  - `NhanVienID` (FK)
  - `NgayKiemKe` (DATETIME)
  - `GhiChu` (NVARCHAR)

- **HANG_LOI**
  - `HangLoiID` (INT, PK, Tự tăng)
  - `SanPhamID` (INT, FK)
  - `NhanVienID` (INT, FK)
  - `SoLuong` (INT)
  - `PhanLoai` (NVARCHAR - Hỏng/Hết hạn)
  - `HinhAnh` (VARCHAR)
  - `DeXuatXuLy` (NVARCHAR)
  - `NgayBaoCao` (DATETIME)

---

## 5. Phụ lục: Các quyết định thiết kế & Cải tiến (So với sơ đồ gốc)
Dưới đây là các góp ý và thay đổi quan trọng đã được áp dụng vào bản thiết kế này so với Sơ đồ phân rã chức năng/Thiết kế ban đầu:

1. **Loại bỏ phân hệ Chi Nhánh (Branch):**
   - *Lý do:* Việc quản lý đa chi nhánh sẽ làm luồng tồn kho, điều chuyển kho và giao hàng trở nên quá phức tạp đối với scope của một Đồ án tốt nghiệp. Việc gom về 1 kho tổng giúp dự án khả thi và dễ tập trung vào các nghiệp vụ chính (Bán hàng, Affiliate) hơn.

2. **Bổ sung module Thương Hiệu (Brand):**
   - *Lý do:* Các trang web mỹ phẩm thực tế luôn cần phân loại theo cả Danh Mục (Son, Kem dưỡng) và Thương Hiệu (Mac, Cocoon, Romand). Việc tách riêng bảng `THUONG_HIEU` giúp frontend làm bộ lọc (Filter) dễ dàng và chính xác hơn.

3. **Áp dụng giải pháp bảo mật IDOR (Chống đoán ID):**
   - *Lý do:* Nếu dùng `KhachHangID` hoặc `DonHangID` là số tự tăng (1, 2, 3...) đẩy ra API, hacker có thể dễ dàng đổi URL (`/api/don-hang/2`) để xem trộm đơn hàng của người khác.
   - *Giải pháp:* Vẫn giữ `INT IDENTITY` làm khóa chính (Primary Key) và khóa ngoại (Foreign Key) để tối ưu tốc độ truy vấn trong DB. Tuy nhiên, bổ sung thêm các cột **Mã Public** (`MaKhachHang`, `MaDonHang` dạng `VARCHAR` Random/UUID) để giao tiếp với Frontend.

4. **Xây dựng luồng Cộng Tác Viên (Affiliate) có Ví điện tử:**
   - *Giải pháp:* Xây dựng hệ thống `CONG_TAC_VIEN` có `SoDuVi` riêng. Mỗi CTV có một `MaGioiThieu` (Dùng để tạo Link bán hàng). Khi có đơn thành công, tiền hoa hồng cộng vào ví (`LICH_SU_VI_CTV`), CTV có thể lên web tạo `YEU_CAU_RUT_TIEN` về tài khoản ngân hàng.
