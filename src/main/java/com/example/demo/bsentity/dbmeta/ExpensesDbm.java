package com.example.demo.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.example.demo.allcommon.*;
import com.example.demo.exentity.*;

/**
 * The DB meta of expenses. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ExpensesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ExpensesDbm _instance = new ExpensesDbm();
    private ExpensesDbm() {}
    public static ExpensesDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Expenses)et).getId(), (et, vl) -> ((Expenses)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Expenses)et).getDate(), (et, vl) -> ((Expenses)et).setDate(ctld(vl)), "date");
        setupEpg(_epgMap, et -> ((Expenses)et).getCategoryId(), (et, vl) -> ((Expenses)et).setCategoryId(cti(vl)), "categoryId");
        setupEpg(_epgMap, et -> ((Expenses)et).getIncome(), (et, vl) -> ((Expenses)et).setIncome(cti(vl)), "income");
        setupEpg(_epgMap, et -> ((Expenses)et).getExpenditure(), (et, vl) -> ((Expenses)et).setExpenditure(cti(vl)), "expenditure");
        setupEpg(_epgMap, et -> ((Expenses)et).getDetail(), (et, vl) -> ((Expenses)et).setDetail((String)vl), "detail");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Expenses)et).getCategory(), (et, vl) -> ((Expenses)et).setCategory((OptionalEntity<Category>)vl), "category");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "expenses";
    protected final String _tableDispName = "expenses";
    protected final String _tablePropertyName = "expenses";
    protected final TableSqlName _tableSqlName = new TableSqlName("expenses", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDate = cci("date", "date", null, null, java.time.LocalDate.class, "date", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCategoryId = cci("category_id", "category_id", null, null, Integer.class, "categoryId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "category", null, null, false);
    protected final ColumnInfo _columnIncome = cci("income", "income", null, null, Integer.class, "income", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpenditure = cci("expenditure", "expenditure", null, null, Integer.class, "expenditure", null, false, false, false, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDetail = cci("detail", "detail", null, null, String.class, "detail", null, false, false, false, "VARCHAR", 20, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * date: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDate() { return _columnDate; }
    /**
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCategoryId() { return _columnCategoryId; }
    /**
     * income: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncome() { return _columnIncome; }
    /**
     * expenditure: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpenditure() { return _columnExpenditure; }
    /**
     * detail: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDetail() { return _columnDetail; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnDate());
        ls.add(columnCategoryId());
        ls.add(columnIncome());
        ls.add(columnExpenditure());
        ls.add(columnDetail());
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
    /**
     * category by my category_id, named 'category'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCategoryId(), CategoryDbm.getInstance().columnId());
        return cfi("expenses_ibfk_1", "category", this, CategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "expensesList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.demo.exentity.Expenses"; }
    public String getConditionBeanTypeName() { return "com.example.demo.cbean.ExpensesCB"; }
    public String getBehaviorTypeName() { return "com.example.demo.exbhv.ExpensesBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Expenses> getEntityType() { return Expenses.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Expenses newEntity() { return new Expenses(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Expenses)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Expenses)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
