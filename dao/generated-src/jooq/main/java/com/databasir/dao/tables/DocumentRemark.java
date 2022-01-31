/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables;


import com.databasir.dao.Databasir;
import com.databasir.dao.Indexes;
import com.databasir.dao.Keys;
import com.databasir.dao.tables.records.DocumentRemarkRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentRemark extends TableImpl<DocumentRemarkRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>databasir.document_remark</code>
     */
    public static final DocumentRemark DOCUMENT_REMARK = new DocumentRemark();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentRemarkRecord> getRecordType() {
        return DocumentRemarkRecord.class;
    }

    /**
     * The column <code>databasir.document_remark.id</code>.
     */
    public final TableField<DocumentRemarkRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>databasir.document_remark.remark</code>.
     */
    public final TableField<DocumentRemarkRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>databasir.document_remark.user_id</code>. user.id
     */
    public final TableField<DocumentRemarkRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "user.id");

    /**
     * The column <code>databasir.document_remark.project_id</code>.
     */
    public final TableField<DocumentRemarkRecord, Integer> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>databasir.document_remark.table_name</code>.
     */
    public final TableField<DocumentRemarkRecord, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>databasir.document_remark.column_name</code>.
     */
    public final TableField<DocumentRemarkRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>databasir.document_remark.create_at</code>.
     */
    public final TableField<DocumentRemarkRecord, LocalDateTime> CREATE_AT = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private DocumentRemark(Name alias, Table<DocumentRemarkRecord> aliased) {
        this(alias, aliased, null);
    }

    private DocumentRemark(Name alias, Table<DocumentRemarkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>databasir.document_remark</code> table reference
     */
    public DocumentRemark(String alias) {
        this(DSL.name(alias), DOCUMENT_REMARK);
    }

    /**
     * Create an aliased <code>databasir.document_remark</code> table reference
     */
    public DocumentRemark(Name alias) {
        this(alias, DOCUMENT_REMARK);
    }

    /**
     * Create a <code>databasir.document_remark</code> table reference
     */
    public DocumentRemark() {
        this(DSL.name("document_remark"), null);
    }

    public <O extends Record> DocumentRemark(Table<O> child, ForeignKey<O, DocumentRemarkRecord> key) {
        super(child, key, DOCUMENT_REMARK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Databasir.DATABASIR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DOCUMENT_REMARK_IDX_PROJECT_ID);
    }

    @Override
    public Identity<DocumentRemarkRecord, Integer> getIdentity() {
        return (Identity<DocumentRemarkRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DocumentRemarkRecord> getPrimaryKey() {
        return Keys.KEY_DOCUMENT_REMARK_PRIMARY;
    }

    @Override
    public DocumentRemark as(String alias) {
        return new DocumentRemark(DSL.name(alias), this);
    }

    @Override
    public DocumentRemark as(Name alias) {
        return new DocumentRemark(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DocumentRemark rename(String name) {
        return new DocumentRemark(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DocumentRemark rename(Name name) {
        return new DocumentRemark(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
