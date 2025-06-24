FROM node:18-alpine AS build-step
WORKDIR /app

COPY package.json package-lock.json* ./
ARG VITE_API_URL
ENV VITE_API_URL=$VITE_API_URL

# Hier schreiben wir die Umgebungsvariable in eine .env-Datei
RUN echo "VITE_API_URL=$VITE_API_URL" > .env

RUN npm install
COPY . .
RUN npm run build

FROM nginx:1.17.1-alpine
COPY --from=build-step /app/dist /usr/share/nginx/html

