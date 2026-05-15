# QueenBeautiful - Trang Web Bán Mỹ Phẩm (Đồ Án Tốt Nghiệp) Chờ chức năng

Dự án Hệ thống bán hàng mỹ phẩm cao cấp **QueenBeautiful** với các tính năng cốt lõi như quản lý bán hàng, lọc sản phẩm theo Thương Hiệu và đặc biệt là hệ thống **Cộng Tác Viên (Affiliate)** tích hợp Ví điện tử và Rút tiền.

## 🚀 Công nghệ sử dụng (Tech Stack)
- **Backend:** Java 17, Spring Boot 3, Spring Data JPA
- **Frontend:** Vue.js 3, Vite
- **Cơ sở dữ liệu (Database):** Microsoft SQL Server

## 📂 Cấu trúc thư mục dự án
- 📁 **`backend/`**: Mã nguồn API Spring Boot (Chạy ở cổng 8080).
- 📁 **`frontend/`**: Mã nguồn giao diện Vue 3 (Chạy ở cổng 5173).
- 📁 **`schema/`**: Chứa file thiết kế `DatabaseSchema.md` và 2 file lệnh SQL (`schema.sql`, `data.sql`) để khởi tạo CSDL nhanh chóng.

## ⚙️ Hướng dẫn cài đặt nhanh (Dành cho thành viên nhóm)

### 1. Setup Cơ sở dữ liệu (Bắt buộc làm đầu tiên)
1. Mở **SQL Server Management Studio (SSMS)** và tạo một Database mới tinh tên là **`QueenBeautiful`**.
2. Mở file `backend/src/main/resources/application.properties` và sửa lại `username` / `password` cho đúng với cấu hình SQL Server trên máy.

### 2. Chạy Backend & Bơm dữ liệu mẫu
1. Mở IDE, bấm Run chạy file `BackendApplication.java`. (Spring Boot sẽ tự động quét và tự tạo bảng vào DB).
2. Sau khi Backend chạy xong (báo `Started...`), mở SSMS lên, kéo thả file `schema/data.sql` vào và ấn phím `F5` (Execute) **ĐÚNG 1 LẦN** để bơm dữ liệu test (Tài khoản Admin, Sản phẩm mẫu...).
3. Test thử xem Backend đã sống chưa bằng cách truy cập: `http://localhost:8080/api/v1/san-pham`

---
*Dự án Đồ án tốt nghiệp.*
