export interface ProductData {
  id: string;
  name: string;
  price: number;
}

type ProductProps = {
  product: ProductData;
};

const Product = ({ product }: ProductProps) => {
  const handleClick = () => {
    console.log("Clicked on the component ", product.name);
  };

  return (
    <div
      className="flex gap-2 rounded-2xl bg-white px-2 py-4 shadow-md"
      onClick={handleClick}
    >
      <p>{product.id}</p>
      <h2 className="font-bold">{product.name}</h2>
      <p>{product.price}</p>
    </div>
  );
};

export default Product;
