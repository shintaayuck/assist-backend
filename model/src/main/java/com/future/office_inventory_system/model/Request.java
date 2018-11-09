package com.future.office_inventory_system.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import lombok.Data;

@Entity
@Data
@Table(name = TableName.REQUEST)
public class Request {
    @Id
    @GeneratedValue
    private Long idRequest;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    @JsonIgnoreProperties({"request", "hibernateLazyInitializer", "handler"})
    private User requestBy;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idItem", nullable = false)
    @JsonIgnoreProperties({"request", "hibernateLazyInitializer", "handler"})
    private Item item;

    private Date requestDate;

    private Integer reqQty;

    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;
    
    private Long approvedBy;

    private Date approvedDate;

    private Long rejectedBy;

    private Date rejectedDate;

    private Long handedOverBy;

    private Date handedOverDate;

    private Long returnedBy;

    private Date returnedDate;

}