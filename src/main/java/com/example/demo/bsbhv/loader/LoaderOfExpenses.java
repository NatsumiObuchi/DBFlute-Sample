package com.example.demo.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.example.demo.exbhv.*;
import com.example.demo.exentity.*;

/**
 * The referrer loader of expenses as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, date, category_id, income, expenditure, detail
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
 *     category
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     category
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfExpenses {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Expenses> _selectedList;
    protected BehaviorSelector _selector;
    protected ExpensesBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfExpenses ready(List<Expenses> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ExpensesBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ExpensesBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCategory _foreignCategoryLoader;
    public LoaderOfCategory pulloutCategory() {
        if (_foreignCategoryLoader == null)
        { _foreignCategoryLoader = new LoaderOfCategory().ready(myBhv().pulloutCategory(_selectedList), _selector); }
        return _foreignCategoryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Expenses> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
