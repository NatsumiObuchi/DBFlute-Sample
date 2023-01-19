package com.example.demo.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.demo.cbean.cq.ciq.*;
import com.example.demo.cbean.*;
import com.example.demo.cbean.cq.*;

/**
 * The base condition-query of category.
 * @author DBFlute(AutoGenerator)
 */
public class BsCategoryCQ extends AbstractBsCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from category) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CategoryCIQ xcreateCIQ() {
        CategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CategoryCIQ xnewCIQ() {
        return new CategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join category on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, ExpensesCQ> xdfgetId_ExistsReferrer_ExpensesList() { return xgetSQueMap("id_ExistsReferrer_ExpensesList"); }
    public String keepId_ExistsReferrer_ExpensesList(ExpensesCQ sq) { return xkeepSQue("id_ExistsReferrer_ExpensesList", sq); }

    public Map<String, ExpensesCQ> xdfgetId_NotExistsReferrer_ExpensesList() { return xgetSQueMap("id_NotExistsReferrer_ExpensesList"); }
    public String keepId_NotExistsReferrer_ExpensesList(ExpensesCQ sq) { return xkeepSQue("id_NotExistsReferrer_ExpensesList", sq); }

    public Map<String, ExpensesCQ> xdfgetId_SpecifyDerivedReferrer_ExpensesList() { return xgetSQueMap("id_SpecifyDerivedReferrer_ExpensesList"); }
    public String keepId_SpecifyDerivedReferrer_ExpensesList(ExpensesCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_ExpensesList", sq); }

    public Map<String, ExpensesCQ> xdfgetId_QueryDerivedReferrer_ExpensesList() { return xgetSQueMap("id_QueryDerivedReferrer_ExpensesList"); }
    public String keepId_QueryDerivedReferrer_ExpensesList(ExpensesCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_ExpensesList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_ExpensesListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_ExpensesList"); }
    public String keepId_QueryDerivedReferrer_ExpensesListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_ExpensesList", pm); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsCategoryCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsCategoryCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _categoryName;
    public ConditionValue xdfgetCategoryName()
    { if (_categoryName == null) { _categoryName = nCV(); }
      return _categoryName; }
    protected ConditionValue xgetCValueCategoryName() { return xdfgetCategoryName(); }

    /**
     * Add order-by as ascend. <br>
     * category_name: {NotNull, VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsCategoryCQ addOrderBy_CategoryName_Asc() { regOBA("category_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * category_name: {NotNull, VARCHAR(15)}
     * @return this. (NotNull)
     */
    public BsCategoryCQ addOrderBy_CategoryName_Desc() { regOBD("category_name"); return this; }

    protected ConditionValue _categoryNumber;
    public ConditionValue xdfgetCategoryNumber()
    { if (_categoryNumber == null) { _categoryNumber = nCV(); }
      return _categoryNumber; }
    protected ConditionValue xgetCValueCategoryNumber() { return xdfgetCategoryNumber(); }

    /**
     * Add order-by as ascend. <br>
     * category_number: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsCategoryCQ addOrderBy_CategoryNumber_Asc() { regOBA("category_number"); return this; }

    /**
     * Add order-by as descend. <br>
     * category_number: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsCategoryCQ addOrderBy_CategoryNumber_Desc() { regOBD("category_number"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CategoryCQ> _myselfExistsMap;
    public Map<String, CategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CategoryCB.class.getName(); }
    protected String xCQ() { return CategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
