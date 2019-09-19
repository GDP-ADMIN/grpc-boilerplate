package com.muhtar.demo.common.response;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class CustomErrorResponse {
    private int status;
    @NonNull
    private String code;
    @NonNull
    private String message;
}
