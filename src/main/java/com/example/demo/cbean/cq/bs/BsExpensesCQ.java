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
 * The base condition-query of expenses.
 * @author DBFlute(AutoGenerator)
 */
public class BsExpensesCQ extends AbstractBsExpensesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ExpensesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsExpensesCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from expenses) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ExpensesCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ExpensesCIQ xcreateCIQ() {
        ExpensesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ExpensesCIQ xnewCIQ() {
        return new ExpensesCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join expenses on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ExpensesCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ExpensesCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _date;
    public ConditionValue xdfgetDate()
    { if (_date == null) { _date = nCV(); }
      return _date; }
    protected ConditionValue xgetCValueDate() { return xdfgetDate(); }

    /**
     * Add order-by as ascend. <br>
     * date: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Date_Asc() { regOBA("date"); return this; }

    /**
     * Add order-by as descend. <br>
     * date: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Date_Desc() { regOBD("date"); return this; }

    protected ConditionValue _categoryId;
    public ConditionValue xdfgetCategoryId()
    { if (_categoryId == null) { _categoryId = nCV(); }
      return _categoryId; }
    protected ConditionValue xgetCValueCategoryId() { return xdfgetCategoryId(); }

    /**
     * Add order-by as ascend. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_CategoryId_Asc() { regOBA("category_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_CategoryId_Desc() { regOBD("category_id"); return this; }

    protected ConditionValue _income;
    public ConditionValue xdfgetIncome()
    { if (_income == null) { _income = nCV(); }
      return _income; }
    protected ConditionValue xgetCValueIncome() { return xdfgetIncome(); }

    /**
     * Add order-by as ascend. <br>
     * income: {INT(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Income_Asc() { regOBA("income"); return this; }

    /**
     * Add order-by as descend. <br>
     * income: {INT(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Income_Desc() { regOBD("income"); return this; }

    protected ConditionValue _expenditure;
    public ConditionValue xdfgetExpenditure()
    { if (_expenditure == null) { _expenditure = nCV(); }
      return _expenditure; }
    protected ConditionValue xgetCValueExpenditure() { return xdfgetExpenditure(); }

    /**
     * Add order-by as ascend. <br>
     * expenditure: {INT(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Expenditure_Asc() { regOBA("expenditure"); return this; }

    /**
     * Add order-by as descend. <br>
     * expenditure: {INT(10)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Expenditure_Desc() { regOBD("expenditure"); return this; }

    protected ConditionValue _detail;
    public ConditionValue xdfgetDetail()
    { if (_detail == null) { _detail = nCV(); }
      return _detail; }
    protected ConditionValue xgetCValueDetail() { return xdfgetDetail(); }

    /**
     * Add order-by as ascend. <br>
     * detail: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Detail_Asc() { regOBA("detail"); return this; }

    /**
     * Add order-by as descend. <br>
     * detail: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsExpensesCQ addOrderBy_Detail_Desc() { regOBD("detail"); return this; }

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
    public BsExpensesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsExpensesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ExpensesCQ bq = (ExpensesCQ)bqs;
        ExpensesCQ uq = (ExpensesCQ)uqs;
        if (bq.hasConditionQueryCategory()) {
            uq.queryCategory().reflectRelationOnUnionQuery(bq.queryCategory(), uq.queryCategory());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * category by my category_id, named 'category'.
     * @return The instance of condition-query. (NotNull)
     */
    public CategoryCQ queryCategory() {
        return xdfgetConditionQueryCategory();
    }
    public CategoryCQ xdfgetConditionQueryCategory() {
        String prop = "category";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCategory()); xsetupOuterJoinCategory(); }
        return xgetQueRlMap(prop);
    }
    protected CategoryCQ xcreateQueryCategory() {
        String nrp = xresolveNRP("expenses", "category"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "category", nrp);
    }
    protected void xsetupOuterJoinCategory() { xregOutJo("category"); }
    public boolean hasConditionQueryCategory() { return xhasQueRlMap("category"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ExpensesCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ExpensesCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ExpensesCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ExpensesCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ExpensesCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ExpensesCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ExpensesCQ> _myselfExistsMap;
    public Map<String, ExpensesCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ExpensesCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ExpensesCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ExpensesCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ExpensesCB.class.getName(); }
    protected String xCQ() { return ExpensesCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
