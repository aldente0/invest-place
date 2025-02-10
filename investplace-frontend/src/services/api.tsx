import { Stock } from "../types/Stock";

const API_URL = "http://localhost:8090/api"; // Замените на URL вашего backend

export async function fetchStocks(): Promise<Stock[]> {
  const response = await fetch(`${API_URL}/stocks`);
  if (!response.ok) {
    throw new Error("Network response was not ok");
  }
  // Предполагается, что API возвращает массив объектов Stock
  const data: Stock[] = await response.json();
  return data;
}