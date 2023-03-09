/*
 * This file is generated by jOOQ.
 */
package keywhiz.jooq.tables;


import java.util.Arrays;
import java.util.List;

import keywhiz.jooq.Indexes;
import keywhiz.jooq.Keys;
import keywhiz.jooq.KeywhizdbTest;
import keywhiz.jooq.tables.records.DeletedSecretsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class DeletedSecrets extends TableImpl<DeletedSecretsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>keywhizdb_test.deleted_secrets</code>
     */
    public static final DeletedSecrets DELETED_SECRETS = new DeletedSecrets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeletedSecretsRecord> getRecordType() {
        return DeletedSecretsRecord.class;
    }

    /**
     * The column <code>keywhizdb_test.deleted_secrets.id</code>.
     */
    public final TableField<DeletedSecretsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.name</code>.
     */
    public final TableField<DeletedSecretsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.updatedat</code>.
     */
    public final TableField<DeletedSecretsRecord, Long> UPDATEDAT = createField(DSL.name("updatedat"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.createdat</code>.
     */
    public final TableField<DeletedSecretsRecord, Long> CREATEDAT = createField(DSL.name("createdat"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.description</code>.
     */
    public final TableField<DeletedSecretsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.createdby</code>.
     */
    public final TableField<DeletedSecretsRecord, String> CREATEDBY = createField(DSL.name("createdby"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.updatedby</code>.
     */
    public final TableField<DeletedSecretsRecord, String> UPDATEDBY = createField(DSL.name("updatedby"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.type</code>.
     */
    public final TableField<DeletedSecretsRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.options</code>.
     */
    public final TableField<DeletedSecretsRecord, String> OPTIONS = createField(DSL.name("options"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("{}", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.current</code>.
     */
    public final TableField<DeletedSecretsRecord, Long> CURRENT = createField(DSL.name("current"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.row_hmac</code>.
     */
    public final TableField<DeletedSecretsRecord, String> ROW_HMAC = createField(DSL.name("row_hmac"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.owner</code>.
     */
    public final TableField<DeletedSecretsRecord, Long> OWNER = createField(DSL.name("owner"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>keywhizdb_test.deleted_secrets.expiry</code>.
     */
    public final TableField<DeletedSecretsRecord, Long> EXPIRY = createField(DSL.name("expiry"), SQLDataType.BIGINT, this, "");

    private DeletedSecrets(Name alias, Table<DeletedSecretsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeletedSecrets(Name alias, Table<DeletedSecretsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>keywhizdb_test.deleted_secrets</code> table
     * reference
     */
    public DeletedSecrets(String alias) {
        this(DSL.name(alias), DELETED_SECRETS);
    }

    /**
     * Create an aliased <code>keywhizdb_test.deleted_secrets</code> table
     * reference
     */
    public DeletedSecrets(Name alias) {
        this(alias, DELETED_SECRETS);
    }

    /**
     * Create a <code>keywhizdb_test.deleted_secrets</code> table reference
     */
    public DeletedSecrets() {
        this(DSL.name("deleted_secrets"), null);
    }

    public <O extends Record> DeletedSecrets(Table<O> child, ForeignKey<O, DeletedSecretsRecord> key) {
        super(child, key, DELETED_SECRETS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : KeywhizdbTest.KEYWHIZDB_TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DELETED_SECRETS_DS_CURRENT_IDX, Indexes.DELETED_SECRETS_DS_EXPIRY_CURRENT, Indexes.DELETED_SECRETS_DS_EXPIRY_IDX, Indexes.DELETED_SECRETS_DS_NAME_IDX, Indexes.DELETED_SECRETS_DS_OWNER_IDX);
    }

    @Override
    public UniqueKey<DeletedSecretsRecord> getPrimaryKey() {
        return Keys.KEY_DELETED_SECRETS_PRIMARY;
    }

    @Override
    public DeletedSecrets as(String alias) {
        return new DeletedSecrets(DSL.name(alias), this);
    }

    @Override
    public DeletedSecrets as(Name alias) {
        return new DeletedSecrets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeletedSecrets rename(String name) {
        return new DeletedSecrets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeletedSecrets rename(Name name) {
        return new DeletedSecrets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, Long, Long, String, String, String, String, String, Long, String, Long, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}