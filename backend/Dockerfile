# Используем официальный образ OpenJDK (например, для Java 17)
FROM openjdk:21-jdk-slim

# Задаём рабочую директорию внутри контейнера
WORKDIR /app

# Копируем собранный JAR-файл в контейнер
COPY build/libs/invest-place-0.0.1-SNAPSHOT.jar invest-place.jar

# Открываем порт 8090 (если приложение слушает этот порт)
EXPOSE 8090

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "invest-place.jar"]