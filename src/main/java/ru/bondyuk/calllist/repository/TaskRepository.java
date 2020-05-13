package ru.bondyuk.calllist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.bondyuk.calllist.domain.Task;

import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query("SELECT t FROM Task t " +
            "WHERE (t.deliveryDate BETWEEN :fromDate AND :toDate) " +
            "AND (:orderId IS NULL OR t.orderId = :orderId)")
    List<Task> findAllByDeliveryDateBetweenAndOptionalOrderId(Date fromDate, Date toDate, String orderId);
}
