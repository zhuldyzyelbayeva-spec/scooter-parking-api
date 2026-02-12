package com.endterm.scooterparkingapi.cache;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache {

    private static SimpleCache instance;
    private final Map<String, Object> cache;

    private SimpleCache() {
        this.cache = new HashMap<>();
    }

    public static synchronized SimpleCache getInstance() {
        if (instance == null) {
            instance = new SimpleCache();
        }
        return instance;
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public boolean contains(String key) {
        return cache.containsKey(key);
    }

    public void clear() {
        cache.clear();
    }
}
