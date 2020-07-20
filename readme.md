# Design pattern: Behavior Pattern

## Observer pattern example
- Ví dụ 1: 
  - Giả sử hệ thống của chúng ta cần theo dõi về tài khoản của người dùng. Mọi thao tác của người dùng đều cần được ghi log lại, sẽ thực hiện gửi mail thông báo khi tài khoản hết hạn, thực hiện chặn người dùng nếu truy cập không hợp lệ, …
- Ví dụ 2: 
  - A làm việc cho một công ty gia công phần mềm. Công ty nhận được một đơn đặt hàng cho việc thiết kế và xây dựng một hệ thống phần mềm cho một trạm quan sát thời tiết. Dữ liệu của hệ thống được xây dựng thông qua một đối tượng gọi là WeatherData - đóng vai trò theo dõi điều kiện thời tiết hiện tại (nhiệt độ, độ ẩm, áp suất). 
  - Bên khách hàng yêu cầu công ty xây dựng một ứng dụng mà cung cấp 3 phần tử màn hình hiển thị: CurrentConditionDisplay, StatsisticsDisplay, ForcastDisplay, tất cả sẽ được cập nhật theo thời gian thực mỗi khi đối tượng WeatherData lấy được dữ liệu mới nhất. Ngoài ra, trạm quan sát cũng muốn "public" những API để những lập trình viên khác có thể viết ra những màn hình hiển thị thời tiết của riêng họ.

## Strategy pattern example
- Ví dụ: 
  - Chương trình của chúng ta cung cấp nhiều giải thuật sắp xếp khác nhau: quick sort, merge sort, selection sort, heap sort, timsort,… tùy theo loại dữ liệu, số lượng phần tử,… mà người dùng có thể chọn một giải thuật sắp xếp phù hợp.

## Visitor pattern example
- Ví dụ:
  - Phân loại sách
