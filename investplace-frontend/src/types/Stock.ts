export interface Stock {
    figi: string,
    name: string,
    ticker: string,
    price?: number,
    uid: string,
    currency: string
}