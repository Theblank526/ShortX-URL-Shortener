package com.Shortex.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class UrlCreateRequest {
    private String originalUrl;
    private LocalDateTime expireDate;
}
