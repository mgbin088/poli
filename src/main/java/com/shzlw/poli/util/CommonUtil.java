package com.shzlw.poli.util;

import org.springframework.lang.Nullable;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public final class CommonUtil {

    private CommonUtil() {}

    public static LocalDateTime fromEpoch(long epoch) {
        return Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static long toEpoch(@Nullable LocalDateTime dateTime) {
        return dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
