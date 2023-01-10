package org.docksidestage.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of category as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String categoryName = entity.getCategoryName();
 * Boolean categoryFlag = entity.getCategoryFlag();
 * entity.setId(id);
 * entity.setCategoryName(categoryName);
 * entity.setCategoryFlag(categoryFlag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCategory extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, INT(10)} */
    protected Integer _id;

    /** category_name: {UQ, NotNull, VARCHAR(15)} */
    protected String _categoryName;

    /** category_flag: {NotNull, BIT} */
    protected Boolean _categoryFlag;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "category";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param categoryName : UQ, NotNull, VARCHAR(15). (NotNull)
     */
    public void uniqueBy(String categoryName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("categoryName");
        setCategoryName(categoryName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** expenses by category_id, named 'expensesList'. */
    protected List<Expenses> _expensesList;

    /**
     * [get] expenses by category_id, named 'expensesList'.
     * @return The entity list of referrer property 'expensesList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Expenses> getExpensesList() {
        if (_expensesList == null) { _expensesList = newReferrerList(); }
        return _expensesList;
    }

    /**
     * [set] expenses by category_id, named 'expensesList'.
     * @param expensesList The entity list of referrer property 'expensesList'. (NullAllowed)
     */
    public void setExpensesList(List<Expenses> expensesList) {
        _expensesList = expensesList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsCategory) {
            BsCategory other = (BsCategory)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_expensesList != null) { for (Expenses et : _expensesList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "expensesList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_categoryName));
        sb.append(dm).append(xfND(_categoryFlag));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_expensesList != null && !_expensesList.isEmpty())
        { sb.append(dm).append("expensesList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Category clone() {
        return (Category)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, INT(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] category_name: {UQ, NotNull, VARCHAR(15)} <br>
     * @return The value of the column 'category_name'. (basically NotNull if selected: for the constraint)
     */
    public String getCategoryName() {
        checkSpecifiedProperty("categoryName");
        return _categoryName;
    }

    /**
     * [set] category_name: {UQ, NotNull, VARCHAR(15)} <br>
     * @param categoryName The value of the column 'category_name'. (basically NotNull if update: for the constraint)
     */
    public void setCategoryName(String categoryName) {
        registerModifiedProperty("categoryName");
        _categoryName = categoryName;
    }

    /**
     * [get] category_flag: {NotNull, BIT} <br>
     * @return The value of the column 'category_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getCategoryFlag() {
        checkSpecifiedProperty("categoryFlag");
        return _categoryFlag;
    }

    /**
     * [set] category_flag: {NotNull, BIT} <br>
     * @param categoryFlag The value of the column 'category_flag'. (basically NotNull if update: for the constraint)
     */
    public void setCategoryFlag(Boolean categoryFlag) {
        registerModifiedProperty("categoryFlag");
        _categoryFlag = categoryFlag;
    }
}
