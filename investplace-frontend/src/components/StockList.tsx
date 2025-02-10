import { Stock } from "../types/Stock.ts";


interface StockListProps {
    stocks: Stock[];
  }
  
  export function StockList({ stocks }: StockListProps) {
    return (
      <ul>
        {stocks.map((stock) => (
          <li key={stock.figi} className="border p-2 my-2 rounded">
            {stock.name} ({stock.ticker}) -{" "}
            {stock.price ? `$${stock.price}` : "Цена не найдена"} {stock.currency}
          </li>
        ))}
      </ul>
    );
  }