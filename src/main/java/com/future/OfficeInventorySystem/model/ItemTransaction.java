package com.future.OfficeInventorySystem.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;




@Entity
@Data
@Table(name ="ItemTransaction")
public class ItemTransaction {

    @Id

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="idTransaction", nullable = false)
    private Transaction transaction;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="idItem", nullable = false)
    private Item item;

    private Integer boughtQty;

    private Integer availableQty;
}
