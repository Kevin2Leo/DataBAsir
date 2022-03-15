/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.records;


import com.databasir.dao.tables.DocumentDiscussion;
import com.databasir.dao.tables.pojos.DocumentDiscussionPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentDiscussionRecord extends UpdatableRecordImpl<DocumentDiscussionRecord> implements Record7<Integer, String, Integer, Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>databasir.document_discussion.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>databasir.document_discussion.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>databasir.document_discussion.user_id</code>. user.id
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.user_id</code>. user.id
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>databasir.document_discussion.project_id</code>.
     */
    public void setProjectId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>databasir.document_discussion.table_name</code>.
     */
    public void setTableName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.table_name</code>.
     */
    public String getTableName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>databasir.document_discussion.column_name</code>.
     */
    public void setColumnName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>databasir.document_discussion.create_at</code>.
     */
    public void setCreateAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>databasir.document_discussion.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, Integer, Integer, String, String, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.ID;
    }

    @Override
    public Field<String> field2() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.CONTENT;
    }

    @Override
    public Field<Integer> field3() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.USER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.PROJECT_ID;
    }

    @Override
    public Field<String> field5() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.TABLE_NAME;
    }

    @Override
    public Field<String> field6() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.COLUMN_NAME;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return DocumentDiscussion.DOCUMENT_DISCUSSION.CREATE_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getContent();
    }

    @Override
    public Integer component3() {
        return getUserId();
    }

    @Override
    public Integer component4() {
        return getProjectId();
    }

    @Override
    public String component5() {
        return getTableName();
    }

    @Override
    public String component6() {
        return getColumnName();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getContent();
    }

    @Override
    public Integer value3() {
        return getUserId();
    }

    @Override
    public Integer value4() {
        return getProjectId();
    }

    @Override
    public String value5() {
        return getTableName();
    }

    @Override
    public String value6() {
        return getColumnName();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateAt();
    }

    @Override
    public DocumentDiscussionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord value2(String value) {
        setContent(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord value4(Integer value) {
        setProjectId(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord value5(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord value6(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord value7(LocalDateTime value) {
        setCreateAt(value);
        return this;
    }

    @Override
    public DocumentDiscussionRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, String value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DocumentDiscussionRecord
     */
    public DocumentDiscussionRecord() {
        super(DocumentDiscussion.DOCUMENT_DISCUSSION);
    }

    /**
     * Create a detached, initialised DocumentDiscussionRecord
     */
    public DocumentDiscussionRecord(Integer id, String content, Integer userId, Integer projectId, String tableName, String columnName, LocalDateTime createAt) {
        super(DocumentDiscussion.DOCUMENT_DISCUSSION);

        setId(id);
        setContent(content);
        setUserId(userId);
        setProjectId(projectId);
        setTableName(tableName);
        setColumnName(columnName);
        setCreateAt(createAt);
    }

    /**
     * Create a detached, initialised DocumentDiscussionRecord
     */
    public DocumentDiscussionRecord(DocumentDiscussionPojo value) {
        super(DocumentDiscussion.DOCUMENT_DISCUSSION);

        if (value != null) {
            setId(value.getId());
            setContent(value.getContent());
            setUserId(value.getUserId());
            setProjectId(value.getProjectId());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setCreateAt(value.getCreateAt());
        }
    }
}