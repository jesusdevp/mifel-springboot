# 💳 Mifel Backend – Evaluación Técnica

Proyecto de backend desarrollado en **Java 11 + Spring Boot 2.7.18**, que implementa:

✅ CRUD con filtro  
✅ Cifrado AES/CBC/PKCS5Padding  
✅ Consumo de PokeAPI  
✅ Autenticación JWT  
✅ Seguridad con OAuth2-like (Bearer Token)  
✅ Base de datos en memoria H2  
✅ Desplegado en [Railway](https://railway.app)

---

## 🚀 Tecnologías utilizadas

- Java 11
- Spring Boot 2.7.x
- Spring Security
- JWT (Java Web Token)
- Spring WebClient
- JPA + H2
- Maven

---

## ⚙️ Configuración local

### 1. Clonar repositorio

```bash
git clone https://github.com/tu-usuario/mifel-springboot.git
cd mifel-springboot
mvn clean install
mvn spring-boot:run

## Credenciales de prueba
Usuario	Contraseña
admin	admin123