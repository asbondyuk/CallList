package ru.bondyuk.calllist.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task extends AbstractPersistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "delivery_date")
    private Date deliveryDate;

    @Column(name = "creation_date")
    private final Date creationDate = new Date(System.currentTimeMillis());

    @Column(name = "is_done")
    private boolean isDone = false;

    public Task(String orderId, Date deliveryDate) {
        this.orderId = orderId;
        this.deliveryDate = deliveryDate;
        isDone = false;
    }
}