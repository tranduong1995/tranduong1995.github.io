let products = [
    {
        name: "Iphone 13 Pro Max", // Tên sản phẩm
        price: 30000000, // Giá mỗi sản phẩm
        brand: "Apple", // Thương hiệu
        count: 2, // Số lượng sản phẩm trong giỏ hàng
    },
    {
        name: "Samsung Galaxy Z Fold3",
        price: 41000000,
        brand: "Samsung",
        count: 1,
    },
    {
        name: "IPhone 11",
        price: 15500000,
        brand: "Apple",
        count: 1,
    },
    {
        name: "OPPO Find X3 Pro",
        price: 19500000,
        brand: "OPPO",
        count: 3,
    },
]

let newproducts = {
    name: "vietle telecom",
    price: 12000000,
    brand: "vietle",
    count: 3,
};

// 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product
products.push(newproducts);
console.log(products);

// 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng
 let xoaSanpham = products.filter(function(e){
    return e.brand !== "Samsung";
 }
 );
 console.log(xoaSanpham);


// 8. Sắp xếp giỏ hàng theo price tăng dần
 
products.sort(function(a, b) {
    return a.price - b.price;
  });
  console.log(products);

  // 9. Sắp xếp giỏ hàng theo count giảm dần
  products.sort(function(c, d) {
    return d.count - c.count;
  });
  console.log(products);

  // 10. Lấy ra 2 sản phẩm bất kỳ từ giỏ hàng
let randomProducts = products.slice(0, 2);
console.log(randomProducts);