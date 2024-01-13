# Kiến Trúc Phần Mềm

## API User (http://localhost:8080/api/user)
![API User](https://github.com/chicuongdev2002/KienTrucPhanMem_Week1/assets/124854803/43575d53-611e-449d-958c-2598da2bbdc3)

## API Product (http://localhost:8081/api/product/{user_id}/{product_id})
### Sử dụng RestTemplate để gọi User từ API(http://localhost:8080/api/user)

## 2 API ở 2 Database khác nhau
### DB User
![image](https://github.com/chicuongdev2002/KienTrucPhanMem_Week1/assets/124854803/30093adf-31c7-473b-aece-82e59b63621a)
### DB Product
![DB Product](https://github.com/chicuongdev2002/KienTrucPhanMem_Week1/assets/124854803/f7d2feec-85ef-49ce-9e4f-bf2acee8b6b7)

## Ví Dụ (http://localhost:8081/api/product/1/1)
### user_id=1, product_id=1
![Product 1](https://github.com/chicuongdev2002/KienTrucPhanMem_Week1/assets/124854803/15337e99-ed7a-4d83-9a8c-90aa6600d541)

## Ví Dụ (http://localhost:8081/api/product/2/3)
### user_id=2, product_id=3
![Product 2](https://github.com/chicuongdev2002/KienTrucPhanMem_Week1/assets/124854803/d3da515d-51b3-49e3-a8ba-7ab7d1c7232b)



