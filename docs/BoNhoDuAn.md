# Bộ Nhớ Dự Án (Project Context Memory) - QueenBeautiful

> **Mục đích:** File này dùng để lưu trữ lại các thông tin quan trọng, quyết định thiết kế và tóm tắt ngữ cảnh dự án để (AI) có thể đọc lại và tiếp tục công việc một cách liền mạch.
> **Cách sử dụng:** Mỗi khi bắt đầu một phiên làm việc mới "Hãy đọc lại file BoNhoDuAn.md để nắm ngữ cảnh dự án DATN".

---

## 1. Thông tin chung về dự án
- **Tên dự án:** QueenBeautiful (Đồ án tốt nghiệp)
- **Chủ đề:** Trang web bán hàng mỹ phẩm
- **Vị trí thư mục:** `d:\DATN\QueenBeautiful`
- **Mô hình:** Client-Server hoàn toàn độc lập, giao tiếp qua REST API.

## 2. Nguyên tắc làm việc bắt buộc (Rules)
- **Cập nhật tài liệu:** Luôn update file `CauTrucDuAn.md` ngay khi có thay đổi/thêm mới thư viện hoặc công nghệ.
- **Báo cáo tiến độ:** Luôn update file `TienDoCongViec.md` ngay sau khi hoàn thành một chức năng hoặc đầu việc.
- **Cẩn trọng & Hiểu rõ logic:** LUÔN PHẢI đọc hiểu rõ logic hiện tại và check project thật kỹ lưỡng trước khi bắt tay vào code sửa đổi hoặc thêm tính năng mới.
- **Cập nhật Schema:** Luôn cập nhật thông tin Database Schema (cấu trúc DB) vào các file tài liệu tương ứng mỗi khi có bảng mới hoặc thay đổi dữ liệu.
- **Ghi chú Code (Comment/Docstring):** Luôn phải ghi chú (comment) cẩn thận, rõ ràng và dễ hiểu về tác dụng của từng hàm (method) ở tất cả các class khi viết code.
- **Quy tắc đặt tên Class:** Tên class (đặc biệt là các Entity đại diện cho DB) bắt buộc phải đặt bằng Tiếng Việt (Ví dụ: `SanPham`, `KhachHang`, `DonHang`...).

## 3. Các quyết định kỹ thuật chính (Tech Stack)
- **Backend:** Java 17, Spring Boot, Spring Data JPA, Validation. Database là Microsoft SQL Server.
- **Frontend:** Vue.js 3, Vite làm build tool.

## 4. Lịch sử và Tiến độ tổng quan
- **Ngày 16/05/2026:**
  - Khởi tạo thành công cấu trúc dự án cơ bản gồm 2 thư mục `backend` và `frontend`.
  - Xây dựng thành công `DatabaseSchema.md` với 20 bảng, tối ưu UUID và thêm hệ thống Ví Affiliate.
  - Tự động sinh thành công 20 class `@Entity` (Java) và file SQL (`schema.sql`, `data.sql`). Đã đồng bộ chuẩn `UPPER_SNAKE_CASE` toàn dự án.
  - Khắc phục lỗi Naming Strategy của Spring Boot. Xây dựng thành công bộ API Sản Phẩm (`Controller`, `Service`, `DTO`, `Repository`) đầu tiên.

## 5. Trạng thái hiện tại (Đang dừng ở đâu?)
- **Hoàn thành:** Cấu trúc Backend đã thông suốt từ API Controller xuống Database SQL Server.
- **Việc cần làm ngay khi quay lại:** 
  - Code tiếp các API quan trọng khác: Đăng nhập/Đăng ký, Quản lý Khách Hàng, Đơn Hàng.
  - Setup cấu trúc mã nguồn cho Frontend (Vue 3) để chuẩn bị gọi API.

---
*(Lưu ý: File này sẽ được chúng ta liên tục cập nhật sau mỗi buổi làm việc hoặc khi có những quyết định thay đổi quan trọng)*
