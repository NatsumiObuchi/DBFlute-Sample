package org.docksidestage.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.dbflute.exbhv.*;
import org.docksidestage.dbflute.exentity.*;
import org.docksidestage.dbflute.cbean.*;

/**
 * The referrer loader of category as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, category_name, category_flag
 *
 * [sequence]
 *     
 *
 * [identity]
 *     id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     expenses
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     expensesList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Category> _selectedList;
    protected BehaviorSelector _selector;
    protected CategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCategory ready(List<Category> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Expenses> _referrerExpenses;

    /**
     * Load referrer of expensesList by the set-upper of referrer. <br>
     * expenses by category_id, named 'expensesList'.
     * <pre>
     * <span style="color: #0000C0">categoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">categoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadExpenses</span>(<span style="color: #553000">expensesCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">expensesCB</span>.setupSelect...
     *         <span style="color: #553000">expensesCB</span>.query().set...
     *         <span style="color: #553000">expensesCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">expensesLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    expensesLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Category category : <span style="color: #553000">categoryList</span>) {
     *     ... = category.<span style="color: #CC4747">getExpensesList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCategoryId_InScope(pkList);
     * cb.query().addOrderBy_CategoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfExpenses> loadExpenses(ReferrerConditionSetupper<ExpensesCB> refCBLambda) {
        myBhv().loadExpenses(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerExpenses = refLs);
        return hd -> hd.handle(new LoaderOfExpenses().ready(_referrerExpenses, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Category> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
