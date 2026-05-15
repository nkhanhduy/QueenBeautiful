# Quản Lý Tiến Độ Công Việc - Dự án DATN QueenBeautiful

## Hôm nay (Ngày 16/05/2026)

### Đã làm được:
- Khởi tạo thành công cấu trúc cơ bản của dự án `QueenBeautiful`.
- **Backend**: Khởi tạo dự án Spring Boot sử dụng Java 17, đã tích hợp sẵn các dependency quan trọng (Spring Web, Data JPA, Validation, MSSQL JDBC, Lombok).
- **Frontend**: Khởi tạo dự án Vue 3 sử dụng Vite làm công cụ build siêu tốc.
- Cấu trúc thư mục đã được chia tách rõ ràng thành `backend` và `frontend` độc lập.
- Thiết lập xong nguyên tắc làm việc (Cập nhật Schema & Bắt buộc Comment code).
- **Thiết kế Database**: Đã phân tích Sơ đồ phân rã chức năng và chốt bản thiết kế Database Schema (Bao gồm Ví điện tử cho Affiliate/Cộng tác viên). Đã xuất file tổng hợp `schema/DatabaseSchema.md`.

### Công việc tiếp theo (Dự kiến):
- [x] Thiết kế sơ đồ cơ sở dữ liệu (Database Schema).
- [x] Khởi tạo các Class `@Entity` của Spring Boot tương ứng với Database Schema
- [x] Cấu hình file `application.properties` kết nối cơ sở dữ liệu SQL Server.
- [x] Thiết lập các package chuẩn cho Backend (Controller, Service, Repository, Entity, DTO, Config).
- [x] Xây dựng các API cơ bản đầu tiên (API Sản Phẩm).
- [ ] Xây dựng tiếp bộ API Đăng nhập/Đăng ký và Quản lý Đơn hàng.
- [ ] Cài đặt thêm các thư viện điều hướng và trạng thái cho Frontend (Vue Router, Pinia/Vuex) và thư viện UI.
