# Write your MySQL query statement below
SELECT DISTINCT log1.num AS ConsecutiveNums  FROM Logs log1, Logs log2 ,Logs log3 
WHERE log1.id=log2.id-1 
AND 
log2.id=log3.id-1
AND 
log1.num=log2.num AND log2.num=log3.num; 