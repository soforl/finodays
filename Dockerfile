# Используем образ с Maven для сборки и выполнения Java-приложения
FROM maven:3.8.4-openjdk-17 AS build

# Копируем файлы проекта в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Собираем проект с помощью Maven
RUN mvn clean package -DskipTests

# Открываем порт, на котором будет работать приложение
EXPOSE 8080

# Запускаем приложение при старте контейнера
CMD ["java", "-jar", "target/proj-0.0.1-SNAPSHOT.jar"]

