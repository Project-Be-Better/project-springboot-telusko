import ProductList from "./components/ProductList";
import { Navigate, Route, Routes } from "react-router-dom";
import ProductDetailPage from "./pages/ProductDetailPage";
import Navbar from "./components/Navbar";

const App = () => {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route path="/" element={<Navigate to={"/products"} />} />
        <Route path="/products" element={<ProductList />} />
        <Route path="/products/:id" element={<ProductDetailPage />} />
      </Routes>
      Footer
    </div>
  );
};

export default App;
