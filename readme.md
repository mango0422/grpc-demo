# gRPC Bank Service (Spring Boot + Armeria + gRPC)

간단한 예제로 “입금(Deposit)” 및 “출금(Withdraw)” gRPC 서비스를 Spring Boot 3.4.5와 Armeria 1.32.5 기반으로 구현한 멀티모듈 프로젝트입니다.

## 📂 전체 디렉터리 구조

```
grpc/                               # 루트 멀티모듈 프로젝트
├── build.gradle                    # 공통 Gradle 설정
├── settings.gradle                 # include ':proto-interface', ':grpc-server', ':grpc-client'
├── proto-interface/                # 공통 .proto 모듈
│   ├── build.gradle
│   └── src/main/proto/
│       ├── deposit.proto
│       └── withdraw.proto
├── grpc-server/                    # gRPC 서버 모듈
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java/baas/grpc/server/
│       │   │   ├── GrpcServerApplication.java
│       │   │   ├── GrpcServerConfig.java
│       │   │   └── service/
│       │   │       ├── DepositServiceImpl.java
│       │   │       └── WithdrawServiceImpl.java
│       │   └── resources/
│       │       └── application.yaml
│       └── test
│           └── java/…
└── grpc-client/                    # gRPC 클라이언트(REST 프록시) 모듈
    ├── build.gradle
    └── src
        ├── main
        │   ├── java/baas/grpc/client/
        │   │   ├── GrpcClientApplication.java
        │   │   ├── DepositClientController.java
        │   │   ├── DepositRequestDto.java
        │   │   └── DepositResponseDto.java
        │   └── resources/
        │       └── application.yaml
        └── test
            └── java/…
```

---

## ⚙️ 기술 스택

| 항목              | 버전     | 설명                   |
| --------------- | ------ | -------------------- |
| Java            | 17     | LTS 버전               |
| Spring Boot     | 3.4.5  | Spring Boot 메인 프레임워크 |
| Gradle          | 8.12   | 빌드 및 의존성 관리          |
| Armeria         | 1.32.5 | gRPC+HTTP 서버         |
| gRPC Java       | 1.70.0 | gRPC 구현체             |
| Protobuf        | 3.24.0 | 메시지 정의               |
| Jackson         | 2.18.3 | JSON 직렬화             |
| SLF4J / Logback | 최신     | 로깅                   |

---

## 🔍 모듈별 상세 설명

| 모듈명                 | 역할                                  |
| ------------------- | ----------------------------------- |
| **proto-interface** | `.proto` 정의 → Java Stub/DTO 생성      |
| **grpc-server**     | gRPC 서비스 구현 및 Armeria 서버 기동         |
| **grpc-client**     | REST API → gRPC 호출 프록시, JSON DTO 반환 |

---

## 🔧 주요 설정 옵션

### Armeria `application.yaml` 옵션

| 키 경로                                            | 타입      | 기본값           | 설명                                         |
| ----------------------------------------------- | ------- | ------------- | ------------------------------------------ |
| `armeria.ports[].port`                          | integer | —             | 바인딩할 포트 번호                                 |
| `armeria.ports[].protocols`                     | list    | `[http]`      | 지원할 프로토콜 목록 (`http`, `h2`, `h2c`, `https`) |
| `armeria.max-concurrent-requests`               | integer | 0 (unlimited) | 최대 동시 요청 수 제한                              |
| `armeria.idle-timeout-millis`                   | integer | 60000         | 비활성 연결 타임아웃(ms)                            |
| `armeria.graceful-shutdown-quiet-period-millis` | integer | 2000          | 종료 시 조용 대기 시간(ms)                          |
| `armeria.graceful-shutdown-timeout-millis`      | integer | 10000         | 종료 시 최대 대기 시간(ms)                          |
| `armeria.verbose-exceptions`                    | boolean | false         | 예외 발생 시 상세 스택트레이스 반환                       |
| `armeria.access-log.format`                     | string  | —             | 접근 로그 포맷 (e.g. `%h %m %U %s`)              |
| `armeria.tls.key-file`, `armeria.tls.cert-file` | string  | —             | TLS 설정 (HTTPS/gRPC TLS)                    |

### gRPC 서버 (`grpc.server`) 옵션

| 키 경로                                     | 타입   | 기본값   | 설명                                 |
| ---------------------------------------- | ---- | ----- | ---------------------------------- |
| `grpc.server.port`                       | int  | 9091  | gRPC 전용 포트 (Armeria와 매핑)           |
| `grpc.server.reflection-service-enabled` | bool | false | gRPC 리플렉션 서비스 활성화 (grpcurl 등에서 사용) |

### Spring Boot 공통 옵션

| 키 경로                      | 타입     | 기본값  | 설명                  |
| ------------------------- | ------ | ---- | ------------------- |
| `server.port`             | int    | 8080 | Spring Web(REST) 포트 |
| `spring.application.name` | string | —    | 애플리케이션 이름           |
| `logging.level.*`         | string | INFO | 패키지/클래스별 로깅 레벨 설정   |

---

## 🚀 실행 가이드

1. **프로젝트 클론 & 이동**

   ```bash
   git clone <repo-url> grpc
   cd grpc
   ```

2. **gRPC 서버 실행**

   ```bash
   cd grpc-server
   ./gradlew bootRun
   ```

    * gRPC (H2C): **localhost:9091**
    * HTTP (REST 선택): **localhost:8080**

3. **gRPC 클라이언트 실행**

   ```bash
   cd grpc-client
   ./gradlew bootRun
   ```

    * REST API: **[http://localhost:8081](http://localhost:8081)**

---

## 📫 REST API 예시 (Postman)

| 용도            | Method | URL                                  | Body (JSON)                                 |
| ------------- | ------ | ------------------------------------ | ------------------------------------------- |
| 입금 (Deposit)  | POST   | `http://localhost:8081/api/deposit`  | `{ "accountId":"123456", "amount":1000.0 }` |
| 출금 (Withdraw) | POST   | `http://localhost:8081/api/withdraw` | `{ "accountId":"123456", "amount":500.0 }`  |

**응답 예시**

```json
{
  "success": true,
  "transactionId": "tx-deposit-1715073770000",
  "message": "입금 성공"
}
```

---

## 📈 로깅

* **서버** (`baas.grpc.server.service` 패키지): 요청 수신/응답 전송 시 `INFO` 출력
* **클라이언트** (`baas.grpc.client` 패키지): REST 요청/응답 시 `INFO` 출력

```yaml
logging:
  level:
    baas.grpc.server.service: INFO
    baas.grpc.client: INFO
```

---

## 📚 참고 자료

* Armeria + Spring Boot 통합
  [https://armeria.dev/docs/advanced-spring-boot-integration](https://armeria.dev/docs/advanced-spring-boot-integration)
* gRPC Java
  [https://grpc.io/docs/languages/java/](https://grpc.io/docs/languages/java/)
* Protobuf
  [https://developers.google.com/protocol-buffers](https://developers.google.com/protocol-buffers)

---

**Author**: Mango
**Create_At**: 2025‑05‑07
