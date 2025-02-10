import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { StocksPage } from "./components/StocksPage";
import { Header } from "./components/Header";
import { Footer } from "./components/Footer";

function App() {
    return (
        <body>
            <Header />
            <Router>
                <Routes>
                    <Route path="/" element={<StocksPage />} />
                </Routes>
            </Router>
            <Footer/>
        </body>

    );
}

export default App;