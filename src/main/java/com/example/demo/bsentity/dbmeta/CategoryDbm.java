package com.example.demo.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.example.demo.allcommon.*;
import com.example.demo.exentity.*;

/**
 * The DB meta of category. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CategoryDbm _instance = new CategoryDbm();
    private CategoryDbm() {}
    public static CategoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Category)et).getId(), (et, vl) -> ((Category)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Category)et).getCategoryName(), (et, vl) -> ((Category)et).setCategoryName((String)vl), "categoryName");
        setupEpg(_epgMap, et -> ((Category)et).getCategoryFlag(), (et, vl) -> ((Category)et).setCategoryFlag((Boolean)vl), "categoryFlag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "category";
    protected final String _tableDispName = "category";
    protected final String _tablePropertyName = "category";
    protected final TableSqlName _tableSqlName = new TableSqlName("dbflute_sample.category", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "expensesList", null, false);
    protected final ColumnInfo _columnCategoryName = cci("category_name", "category_name", null, null, String.class, "categoryName", null, false, false, true, "VARCHAR", 15, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCategoryFlag = cci("category_flag", "category_flag", null, null, Boolean.class, "categoryFlag", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * category_name: {NotNull, VARCHAR(15)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCategoryName() { return _columnCategoryName; }
    /**
     * category_flag: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCategoryFlag() { return _columnCategoryFlag; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnCategoryName());
        ls.add(columnCategoryFlag());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * expenses by category_id, named 'expensesList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerExpensesList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), ExpensesDbm.getInstance().columnCategoryId());
        return cri("expenses_ibfk_1", "expensesList", this, ExpensesDbm.getInstance(), mp, false, "category");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.demo.exentity.Category"; }
    public String getConditionBeanTypeName() { return "com.example.demo.cbean.CategoryCB"; }
    public String getBehaviorTypeName() { return "com.example.demo.exbhv.CategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Category> getEntityType() { return Category.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Category newEntity() { return new Category(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Category)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Category)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
