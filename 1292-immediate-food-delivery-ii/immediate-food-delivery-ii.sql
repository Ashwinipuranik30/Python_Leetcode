# Write your MySQL query statement below
SELECT ROUND(((SUM(CASE 
WHEN order_date=customer_pref_delivery_date THEN 1 ELSE 0 END)
)/COUNT(customer_id))*100,2) AS immediate_percentage FROM Delivery 
WHERE (customer_id , order_date) in (SELECT customer_id , min(order_date) FROM Delivery
GROUP BY customer_id)
