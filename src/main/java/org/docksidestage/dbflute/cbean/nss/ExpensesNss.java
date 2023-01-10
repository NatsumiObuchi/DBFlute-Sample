package org.docksidestage.dbflute.cbean.nss;

import org.docksidestage.dbflute.cbean.cq.ExpensesCQ;

/**
 * The nest select set-upper of expenses.
 * @author DBFlute(AutoGenerator)
 */
public class ExpensesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ExpensesCQ _query;
    public ExpensesNss(ExpensesCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * category by my category_id, named 'category'.
     */
    public void withCategory() {
        _query.xdoNss(() -> _query.queryCategory());
    }
}
