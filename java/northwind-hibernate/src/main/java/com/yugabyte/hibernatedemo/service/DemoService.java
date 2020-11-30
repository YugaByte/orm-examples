package com.yugabyte.hibernatedemo.service;

import java.util.List;

import com.yugabyte.hibernatedemo.dao.CustomerDAO;
import com.yugabyte.hibernatedemo.dao.OrderDAO;
import com.yugabyte.hibernatedemo.dao.ProductDAO;
import com.yugabyte.hibernatedemo.dao.UserDAO;
import com.yugabyte.hibernatedemo.model.Order;
import com.yugabyte.hibernatedemo.model.Product;
import com.yugabyte.hibernatedemo.model.User;
import com.yugabyte.hibernatedemo.model.requests.CreateOrderRequest;
import com.yugabyte.hibernatedemo.model.response.CreateOrderResponse;
import com.yugabyte.hibernatedemo.model.response.ListOrdersResponse;

public class DemoService {
    private UserDAO userDao;
    private ProductDAO productDao;
    private OrderDAO orderDao;
//    private OrderLineDAO orderLineDao;
    private CustomerDAO customerDao;

    public DemoService() {
        userDao = new UserDAO();
        productDao = new ProductDAO();
        orderDao = new OrderDAO();
//        orderLineDao = new OrderLineDAO();
        customerDao = new CustomerDAO();
    }

    public User create(final User newUser) {
        userDao.save(newUser);
        return newUser;
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public Product create(final Product product) {
        productDao.save(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }


    public CreateOrderResponse create(CreateOrderRequest request) {

//        CreateOrderResponse response = new CreateOrderResponse();
//        Order newOrder = new Order();
//
//        Map<OrderLine, Product> orderLineMap = new HashMap<>();
////        Map<OrderDetail, Product> orderDetailMap = new HashMap<>();
//        double orderTotal = 0;
//        for( CreateOrderRequest.OrderDetails detailLine : request.getProducts() ) {
//
//            Product product = productDao.findById(detailLine.getProductId())
//                    .orElseThrow(() -> new ResourceNotFoundException("Product not found: productId: " + detailLine.getProductId()));
//
//            orderTotal += product.getUnitPrice() * detailLine.getQuantity();
//
//            OrderLine line = new OrderLine();
//            line.setQuantity(detailLine.getQuantity());
//            line.setProductId(detailLine.getProductId());
//
//            orderLineMap.put(line, product);
//            
////            OrderDetail orderDetail = new OrderDetail();
////            orderDetail.setQuantity(detailLine.getQuantity());
////            orderDetail.setProductID(detailLine.getProductId());
////            
////            orderDetailMap.put(orderDetail, product);
//            
//        }
//
////        newOrder.setUser(
////            userDao.findById(request.getUserId())
////                .orElseThrow(() ->  new ResourceNotFoundException("User not found: UserId: " + request.getUserId())));
//
//
//        newOrder.setOrderTotal(orderTotal);
//
//        orderDao.save(newOrder);
//
//        List<ResponseOrderLine> responseOrderDetails = new ArrayList<>();
//        for ( OrderLine line : orderLineMap.keySet() ) {
//            line.setOrderId(newOrder.getOrderId());
//            orderLineDao.save(line);
//            responseOrderDetails.add(new ResponseOrderLine(orderLineMap.get(line), line.getQuantity()));
//        }
//
//        response.setUserId(request.getUserId());
//        response.setOrderLines(responseOrderDetails);
//        response.setOrderId(newOrder.getOrderId().toString());
//        response.setOrderTotal(orderTotal);
//
//        return response;
    	  return null;
    }

    public List<Order> listOrders(String userId) {
    	
    	List<Order> orders = orderDao.findOrdersForUser(userId);
    	return orders;
    }
}