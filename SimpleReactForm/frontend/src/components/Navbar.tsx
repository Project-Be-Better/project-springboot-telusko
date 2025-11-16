import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <div>
      <nav>
        <Link to="/products">View Products</Link>
      </nav>
    </div>
  );
};

export default Navbar;
