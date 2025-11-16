import { useNavigate, useParams } from "react-router-dom";
import useFetch from "../hooks/useFetch";
import type { ProductData } from "../components/Product";

const ProductDetailPage = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const { data, loading, error } = useFetch<ProductData>(
    `http://localhost:8080/api/products/${id}`,
  );

  if (loading) {
    return <p>Loading</p>;
  }

  if (error) {
    return <p>Error {error}</p>;
  }

  return (
    <div className="flex justify-center">
      <div className="">
        <button
          className="bg-red-400"
          onClick={() => {
            navigate("/products");
          }}
        >
          go to Products
        </button>
        <p>{data?.id}</p>
        <div className="flex gap-4 bg-amber-50">
          <h2 className="font-bold">{data?.name}</h2>
          <p>{data?.price}</p>
        </div>
      </div>
    </div>
  );
};

export default ProductDetailPage;
