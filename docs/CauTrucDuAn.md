# Cấu Trúc Dự Án QueenBeautiful

Dự án QueenBeautiful được xây dựng theo mô hình Client-Server, chia làm 2 phần chính: **Backend** và **Frontend** hoạt động độc lập và giao tiếp với nhau thông qua RESTful API.

---

## 1. Cấu Trúc Database (Database Schema)

Bản thiết kế cấu trúc Cơ sở dữ liệu chính thức của dự án (Có hỗ trợ Ví Affiliate) được lưu trữ tại file riêng biệt để dễ theo dõi và cập nhật.
👉 **Xem chi tiết tại:** [DatabaseSchema.md](./schema/DatabaseSchema.md)

---

## 2. Backend

**Vị trí thư mục:** `/backend`

### Công Nghệ & Thư Viện Sử Dụng:
- **Ngôn ngữ:** Java 17
- **Framework Chính:** Spring Boot (phiên bản 4.0.6)
  - *Giải thích:* Giúp khởi tạo dự án nhanh chóng, cấu hình tự động (auto-configuration) và nhúng sẵn server (Tomcat) để chạy ứng dụng dễ dàng mà không cần cài đặt server bên ngoài.
- **Spring WebMVC:** (`spring-boot-starter-webmvc`)
  - *Giải thích:* Cung cấp môi trường để xây dựng các RESTful APIs. Hỗ trợ xử lý các HTTP request (GET, POST, PUT, DELETE) từ Frontend gửi lên và trả về dữ liệu (thường là định dạng JSON).
- **Spring Data JPA:** (`spring-boot-starter-data-jpa`)
  - *Giải thích:* Thư viện hỗ trợ ORM (Object-Relational Mapping), giúp thao tác với cơ sở dữ liệu dễ dàng thông qua các interface (Repository) thay vì phải viết các câu lệnh SQL thuần túy phức tạp.
- **Spring Validation:** (`spring-boot-starter-validation`)
  - *Giải thích:* Hỗ trợ kiểm tra (validate) dữ liệu đầu vào từ client một cách tự động (ví dụ: email có đúng định dạng không, mật khẩu có đủ độ dài không) trước khi xử lý, đảm bảo tính toàn vẹn dữ liệu.
- **Cơ Sở Dữ Liệu:** Microsoft SQL Server
  - *Giải thích:* Sử dụng thư viện `mssql-jdbc` làm driver để ứng dụng Java có thể kết nối và thao tác với hệ quản trị cơ sở dữ liệu SQL Server.
- **Lombok:** (`lombok`)
  - *Giải thích:* Công cụ giúp tự động sinh ra các đoạn code lặp đi lặp lại như getter, setter, constructor, builder... thông qua các annotation (`@Getter`, `@Setter`, `@Data`), giúp code gọn gàng, dễ đọc hơn rất nhiều.

### Cấu Trúc Thư Mục Backend (Dự kiến):
- `src/main/java/.../backend`: Chứa toàn bộ source code Java.
  - `/controller`: Nơi tiếp nhận request từ client, gọi service xử lý và trả về response.
  - `/service`: Chứa các logic nghiệp vụ chính (business logic).
  - `/repository`: Interface kế thừa Spring Data JPA để giao tiếp với Database.
  - `/entity`: Các class được mapping trực tiếp với các bảng trong Database.
  - `/dto` (Data Transfer Object): Các class dùng để hứng và trả dữ liệu giao tiếp với Frontend, giúp ẩn đi các Entity nhạy cảm.
  - `/config`: Chứa các class cấu hình hệ thống (như Security, CORS, Swagger...).
- `src/main/resources`: 
  - `application.properties`: File cấu hình biến môi trường, port, kết nối database...

---

## 3. Frontend

**Vị trí thư mục:** `/frontend`

### Công Nghệ & Thư Viện Sử Dụng:
- **Framework Chính:** Vue.js (phiên bản 3.5.x)
  - *Giải thích:* Framework JavaScript hiện đại, dễ học, chuyên dùng để xây dựng giao diện người dùng (UI) tương tác và ứng dụng Single Page Application (SPA). Mang lại trải nghiệm mượt mà không cần load lại trang.
- **Build Tool:** Vite (phiên bản 8.0.x)
  - *Giải thích:* Công cụ build siêu tốc thế hệ mới dành cho Frontend. Cung cấp server phát triển cực nhanh với Hot Module Replacement (HMR) (lưu file là giao diện cập nhật tức thì), giúp tăng năng suất dev.
- **Plugin Vite cho Vue:** `@vitejs/plugin-vue`
  - *Giải thích:* Giúp Vite có thể biên dịch được các file `.vue` (Single File Components - chứa cả HTML, JS, CSS trong 1 file).

### Cấu Trúc Thư Mục Frontend (Dự kiến):
- `node_modules/`: Thư viện npm đã được tải về.
- `public/`: Chứa các file tĩnh không cần qua bước build (như `favicon.ico`, các file ảnh không đổi).
- `src/`: Thư mục chứa mã nguồn chính của Frontend.
  - `/components`: Chứa các component giao diện dùng chung (như Header, Footer, Button, Modal...).
  - `/views` (hoặc `/pages`): Chứa các component đại diện cho các trang (như HomePage, LoginPage, Dashboard...).
  - `/assets`: Chứa các tài nguyên tĩnh như file CSS/SCSS dùng chung, hình ảnh, icon...
  - `/router` (sẽ thêm): Cấu hình đường dẫn (URL) tương ứng với component nào.
  - `/store` (sẽ thêm): Quản lý trạng thái (state management) với Pinia hoặc Vuex.
  - `App.vue`: Component gốc bao bọc toàn bộ ứng dụng.
  - `main.js`: File khởi chạy ứng dụng Vue, nơi đăng ký các plugin (router, store, UI framework...).
- `index.html`: File HTML gốc, điểm vào của toàn bộ SPA, nơi Vue app sẽ được gắn (mount) vào.
- `package.json`: Quản lý thông tin dự án, danh sách các thư viện và các lệnh script (dev, build).
- `vite.config.js`: File cấu hình của Vite (ví dụ cấu hình port, alias, proxy gọi API).
