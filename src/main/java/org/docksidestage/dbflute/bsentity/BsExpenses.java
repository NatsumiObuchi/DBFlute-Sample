package org.docksidestage.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.dbflute.exentity.*;

/**
 * The entity of expenses as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * java.time.LocalDate date = entity.getDate();
 * Integer categoryId = entity.getCategoryId();
 * Integer income = entity.getIncome();
 * Integer expenditure = entity.getExpenditure();
 * String detail = entity.getDetail();
 * entity.setId(id);
 * entity.setDate(date);
 * entity.setCategoryId(categoryId);
 * entity.setIncome(income);
 * entity.setExpenditure(expenditure);
 * entity.setDetail(detail);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsExpenses extends AbstractEntity implements DomainEntity {

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

    /** date: {NotNull, DATE(10)} */
    protected java.time.LocalDate _date;

    /** category_id: {IX, NotNull, INT(10), FK to category} */
    protected Integer _categoryId;

    /** income: {INT(10)} */
    protected Integer _income;

    /** expenditure: {INT(10)} */
    protected Integer _expenditure;

    /** detail: {VARCHAR(20)} */
    protected String _detail;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "expenses";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** category by my category_id, named 'category'. */
    protected OptionalEntity<Category> _category;

    /**
     * [get] category by my category_id, named 'category'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'category'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Category> getCategory() {
        if (_category == null) { _category = OptionalEntity.relationEmpty(this, "category"); }
        return _category;
    }

    /**
     * [set] category by my category_id, named 'category'.
     * @param category The entity of foreign property 'category'. (NullAllowed)
     */
    public void setCategory(OptionalEntity<Category> category) {
        _category = category;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsExpenses) {
            BsExpenses other = (BsExpenses)obj;
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
        if (_category != null && _category.isPresent())
        { sb.append(li).append(xbRDS(_category, "category")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_date));
        sb.append(dm).append(xfND(_categoryId));
        sb.append(dm).append(xfND(_income));
        sb.append(dm).append(xfND(_expenditure));
        sb.append(dm).append(xfND(_detail));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_category != null && _category.isPresent())
        { sb.append(dm).append("category"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Expenses clone() {
        return (Expenses)super.clone();
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
     * [get] date: {NotNull, DATE(10)} <br>
     * @return The value of the column 'date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDate() {
        checkSpecifiedProperty("date");
        return _date;
    }

    /**
     * [set] date: {NotNull, DATE(10)} <br>
     * @param date The value of the column 'date'. (basically NotNull if update: for the constraint)
     */
    public void setDate(java.time.LocalDate date) {
        registerModifiedProperty("date");
        _date = date;
    }

    /**
     * [get] category_id: {IX, NotNull, INT(10), FK to category} <br>
     * @return The value of the column 'category_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCategoryId() {
        checkSpecifiedProperty("categoryId");
        return _categoryId;
    }

    /**
     * [set] category_id: {IX, NotNull, INT(10), FK to category} <br>
     * @param categoryId The value of the column 'category_id'. (basically NotNull if update: for the constraint)
     */
    public void setCategoryId(Integer categoryId) {
        registerModifiedProperty("categoryId");
        _categoryId = categoryId;
    }

    /**
     * [get] income: {INT(10)} <br>
     * @return The value of the column 'income'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getIncome() {
        checkSpecifiedProperty("income");
        return _income;
    }

    /**
     * [set] income: {INT(10)} <br>
     * @param income The value of the column 'income'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncome(Integer income) {
        registerModifiedProperty("income");
        _income = income;
    }

    /**
     * [get] expenditure: {INT(10)} <br>
     * @return The value of the column 'expenditure'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getExpenditure() {
        checkSpecifiedProperty("expenditure");
        return _expenditure;
    }

    /**
     * [set] expenditure: {INT(10)} <br>
     * @param expenditure The value of the column 'expenditure'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpenditure(Integer expenditure) {
        registerModifiedProperty("expenditure");
        _expenditure = expenditure;
    }

    /**
     * [get] detail: {VARCHAR(20)} <br>
     * @return The value of the column 'detail'. (NullAllowed even if selected: for no constraint)
     */
    public String getDetail() {
        checkSpecifiedProperty("detail");
        return _detail;
    }

    /**
     * [set] detail: {VARCHAR(20)} <br>
     * @param detail The value of the column 'detail'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDetail(String detail) {
        registerModifiedProperty("detail");
        _detail = detail;
    }
}
