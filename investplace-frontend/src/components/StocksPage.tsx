import { useEffect, useState } from "react";
import { Stock } from "../types/Stock";
import { fetchStocks } from "../services/api";
import { StockList } from "./StockList";

export function StocksPage() {
  const [stocks, setStocks] = useState<Stock[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string>("");

  useEffect(() => {
    async function loadStocks() {
      try {
        const data = await fetchStocks();
        setStocks(data);
      } catch (err) {
        console.error(err);
        setError("Не удалось загрузить данные акций");
      } finally {
        setLoading(false);
      }
    }
    loadStocks();
  }, []);

  if (loading) {
    return <p>Загрузка...</p>;
  }

  if (error) {
    return <p>{error}</p>;
  }

  return (
    <div>
      <h1>Список акций</h1>
      <StockList stocks={stocks} />
    </div>
  );
}