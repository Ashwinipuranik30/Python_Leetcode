# Write your MySQL query statement below
SELECT S.student_id, S.student_name , Su.subject_name , COUNT(E.student_id) AS "attended_exams" FROM Students S 
CROSS JOIN Subjects su
LEFT JOIN Examinations E ON S.student_id=E.student_id AND su.subject_name=E.subject_name
GROUP BY S.student_id, Su.subject_name
ORDER BY S.student_id, Su.subject_name;