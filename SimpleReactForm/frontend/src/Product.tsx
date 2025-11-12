import axios from "axios";
import { useEffect, useState } from "react";

type ProductType = {
  id: number;
  name: string;
  desc: string;
};

const Product = () => {
  const [products, setProducts] = useState<ProductType[]>([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/products")
      .then((res) => {
        setProducts(res.data);
      })
      .catch((err) => {
        console.log("Error: ", err);
      });
  }, []);

  return (
    <div>
      {products.map((prod) => (
        <div key={prod.id}>
          <p>{prod.name}</p>
          <p>{prod.desc}</p>
        </div>
      ))}
    </div>
  );
};

export default Product;
