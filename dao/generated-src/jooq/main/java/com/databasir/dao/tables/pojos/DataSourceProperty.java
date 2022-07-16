/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataSourceProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       dataSourceId;
    private String        key;
    private String        value;
    private LocalDateTime createAt;

    public DataSourceProperty() {}

    public DataSourceProperty(DataSourceProperty value) {
        this.id = value.id;
        this.dataSourceId = value.dataSourceId;
        this.key = value.key;
        this.value = value.value;
        this.createAt = value.createAt;
    }

    public DataSourceProperty(
        Integer       id,
        Integer       dataSourceId,
        String        key,
        String        value,
        LocalDateTime createAt
    ) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.key = key;
        this.value = value;
        this.createAt = createAt;
    }

    /**
     * Getter for <code>databasir.data_source_property.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>databasir.data_source_property.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>databasir.data_source_property.data_source_id</code>.
     */
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Setter for <code>databasir.data_source_property.data_source_id</code>.
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * Getter for <code>databasir.data_source_property.key</code>.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>databasir.data_source_property.key</code>.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for <code>databasir.data_source_property.value</code>.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>databasir.data_source_property.value</code>.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for <code>databasir.data_source_property.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    /**
     * Setter for <code>databasir.data_source_property.create_at</code>.
     */
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DataSourceProperty (");

        sb.append(id);
        sb.append(", ").append(dataSourceId);
        sb.append(", ").append(key);
        sb.append(", ").append(value);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}