# Этап сборки: используем образ Node для установки зависимостей и сборки проекта
FROM node:23-alpine AS build

# Задаём рабочую директорию
WORKDIR /app

# Копируем файлы package.json и package-lock.json (или yarn.lock)
COPY package*.json ./

# Устанавливаем зависимости
RUN npm install

# Копируем весь исходный код в контейнер
COPY . .

# Выполняем сборку проекта (согласно настройкам package.json)
RUN npm run build

# Этап рантайма: используем Nginx для раздачи статических файлов
FROM nginx:alpine

# Копируем собранные файлы из этапа сборки в каталог Nginx
COPY --from=build /app/dist /usr/share/nginx/html

# Открываем порт 80 для доступа к фронтенду
EXPOSE 80

# Запускаем Nginx в режиме фореграунда
CMD ["nginx", "-g", "daemon off;"]