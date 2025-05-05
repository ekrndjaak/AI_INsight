AI_INSIGHT
AI_INSIGHT는 데이터 분석과 인공지능 기반의 통찰력을 제공하는 웹 애플리케이션입니다. 이 프로젝트는 Spring Boot와 Docker를 사용하여 개발되었으며, AI 모델을 활용하여 다양한 분석 결과를 제공합니다.

📝 목차
프로젝트 소개

기술 스택

기능

디렉토리 구조

💡 프로젝트 소개
AI_INSIGHT는 데이터를 기반으로 하는 AI 분석을 통해 비즈니스 인사이트를 제공하는 애플리케이션입니다. 이 프로젝트는 사용자가 데이터를 업로드하고, AI 모델을 통해 분석한 후 결과를 대시보드 형식으로 제공하는 시스템입니다.

주요 기능:
데이터 업로드 및 처리: CSV 또는 Excel 파일을 업로드하고 AI 모델로 분석

AI 모델 통합: 예측 모델을 통해 데이터 분석

대시보드 제공: 분석 결과를 시각화하여 대시보드 형태로 제공

Dockerized: Docker로 애플리케이션을 컨테이너화하여 쉽고 빠르게 배포 가능

⚙️ 기술 스택
이 프로젝트는 다음과 같은 기술들을 사용하여 개발되었습니다:

Backend:

Java, Spring Boot

Frontend:

HTML, CSS, JavaScript

Database:

MySQL

AI/ML Framework:

TensorFlow, Scikit-learn

Containerization:

Docker

CI/CD:

GitHub Actions

## 📁 **디렉토리 구조**

프로젝트의 주요 디렉토리 구조는 다음과 같습니다:
## 📁 디렉토리 구조

프로젝트의 주요 디렉토리 구조는 다음과 같습니다:

```
AI_Insight/
├── Dockerfile             # Docker 이미지 빌드를 위한 설정 파일
├── docker-compose.yml     # Docker Compose 설정 파일
├── gradle/                # Gradle 빌드 설정 파일
├── src/                   # 프로젝트 소스 코드
│   ├── main/
│   │   ├── java/          # Java 소스 코드
│   │   └── resources/     # 설정 파일 (application.properties 등)
│   └── test/              # 테스트 코드
├── models/                # AI 모델 파일
├── README.md              # 프로젝트 설명서
```
