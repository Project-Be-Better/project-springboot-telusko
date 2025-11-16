import useFetch from "../hooks/useFetch";
import Product, { type ProductData } from "./Product";

const ProductList = () => {
  const { data, loading, error } = useFetch<ProductData[]>(
    "http://localhost:8080/api/products",
  );

  if (loading) {
    return <p>Loading</p>;
  }

  if (error) {
    return <p>Error {error}</p>;
  }

  return (
    <div className="grid grid-cols-3 gap-6">
      {data?.map((product, index) => (
        <div key={index}>
          <Product product={product} />
        </div>
      ))}
    </div>
  );
};

export default ProductList;
