package com.future.assist.model.response_model;

import lombok.Data;

@Data
public class ItemTransactionResponse {
    private Long idItemTransaction;
    private ItemResponse item;
    private Integer boughtQty;
    private Long price;
}
