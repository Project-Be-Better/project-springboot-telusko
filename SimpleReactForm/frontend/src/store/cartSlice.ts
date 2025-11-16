import { createSlice } from "@reduxjs/toolkit";

interface CartState {
  items: string[];
}

const initialState: CartState = { items: [] };

const cartSlice = createSlice({ name: "cart", initialState, reducers: {} });

export default cartSlice.reducer;
