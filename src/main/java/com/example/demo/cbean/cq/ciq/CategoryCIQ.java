package com.example.demo.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.demo.cbean.*;
import com.example.demo.cbean.cq.bs.*;
import com.example.demo.cbean.cq.*;

/**
 * The condition-query for in-line of category.
 * @author DBFlute(AutoGenerator)
 */
public class CategoryCIQ extends AbstractBsCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsCategoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CategoryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsCategoryCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueId() { return _myCQ.xdfgetId(); }
    public String keepId_ExistsReferrer_ExpensesList(ExpensesCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_ExpensesList(ExpensesCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_SpecifyDerivedReferrer_ExpensesList(ExpensesCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_ExpensesList(ExpensesCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_ExpensesListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCategoryName() { return _myCQ.xdfgetCategoryName(); }
    protected ConditionValue xgetCValueCategoryFlag() { return _myCQ.xdfgetCategoryFlag(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(CategoryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(CategoryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(CategoryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(CategoryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return CategoryCB.class.getName(); }
    protected String xinCQ() { return CategoryCQ.class.getName(); }
}
