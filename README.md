# Laboratuvar Raporlama Uygulaması
Bu proje, laboratuvar ortamlarında kullanılmak üzere geliştirilmiş bir raporlama uygulamasıdır. Uygulama, hastalar, laborantlar ve raporlar arasında ilişkisel bir veritabanı kullanarak çalışır.

# Teknolojiler
Backend Teknolojileri: Java, Spring Boot, Spring Data JPA, PostgreSQL
ve Swagger
Diğer Kullanılan Araçlar: Lombok, Maven

## Uygulama, Spring Boot framework'ü üzerinde geliştirilmiştir ve aşağıdaki özelliklere sahiptir:
**Hastaların Yönetimi:**

Yeni hastalar ekleyebilirsiniz.
Varolan hastaları güncelleyebilir veya silebilirsiniz.
Tüm hastaları listelemek için API isteği yapabilirsiniz.
**Laborantların Yönetimi:**

Laborantlar ekleyebilir, güncelleyebilir ve silebilirsiniz.
Tüm laborantları listelemek için API isteği yapabilirsiniz.
**Raporların Yönetimi:**

Yeni raporlar oluşturabilirsiniz.
Var olan raporları güncelleyebilir veya silebilirsiniz.
Herhangi bir raporun detaylarını görüntülemek için API isteği yapabilirsiniz.
API Endpoint'leri ve Kullanımı
Uygulama, aşağıdaki API endpoint'lerini destekler:

**Hastalar API Endpoint'leri:**

GET /api/patients: Tüm hastaları listeler.
POST /api/patients: Yeni bir hasta ekler.
PUT /api/patients/{id}: Belirli bir hasta kaydını günceller.
DELETE /api/patients/{id}: Belirli bir hasta kaydını siler.

**Laborantlar API Endpoint'leri:**

GET /api/laborants: Tüm laborantları listeler.

POST /api/laborants: Yeni bir laborant ekler.

PUT /api/laborants/{id}: Belirli bir laborant kaydını günceller.

DELETE /api/laborants/{id}: Belirli bir laborant kaydını siler.


**Raporlar API Endpoint'leri:**

GET /api/reports: Tüm raporları listeler.
POST /api/reports: Yeni bir rapor ekler.
PUT /api/reports/{id}: Belirli bir rapor kaydını günceller.
DELETE /api/reports/{id}: Belirli bir rapor kaydını siler.
GET /api/reports/{id}: Belirli bir raporun detaylarını getirir.

## Kurulum ve Çalıştırma

**Java ve Maven Kurulumu:**

Bilgisayarınızda Java JDK 11 ve Maven yüklü olmalıdır.

**PostgreSQL Kurulumu:**
Bir PostgreSQL veritabanı kurun ve çalıştırın.

**Projeyi Başlatma:**

**Proje dizinine gidin ve aşağıdaki komutu çalıştırın:**
bash
Kodu kopyala
./mvnw spring-boot:run

# Uygulamaya Erişim:

Uygulama başladıktan sonra http://localhost:8080 adresinden API'lere erişebilirsiniz.
Swagger API Belgelendirme ve Test
Uygulama, Swagger aracılığıyla API'lerin belgelendirilmesini ve test edilmesini destekler. Uygulama başladıktan sonra Swagger UI adresinden API belgelerine erişebilirsiniz.
