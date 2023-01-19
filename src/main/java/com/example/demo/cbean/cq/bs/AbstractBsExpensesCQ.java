package com.example.demo.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.example.demo.allcommon.*;
import com.example.demo.cbean.*;
import com.example.demo.cbean.cq.*;

/**
 * The abstract condition-query of expenses.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsExpensesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsExpensesCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "expenses";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, NotNull, INT(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * @param date The value of date as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_Equal(java.time.LocalDate date) {
        regDate(CK_EQ,  date);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * @param date The value of date as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_GreaterThan(java.time.LocalDate date) {
        regDate(CK_GT,  date);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * @param date The value of date as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_LessThan(java.time.LocalDate date) {
        regDate(CK_LT,  date);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * @param date The value of date as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_GreaterEqual(java.time.LocalDate date) {
        regDate(CK_GE,  date);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * @param date The value of date as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDate_LessEqual(java.time.LocalDate date) {
        regDate(CK_LE, date);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * <pre>e.g. setDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * date: {NotNull, DATE(10)}
     * <pre>e.g. setDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of date. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDate(), nm, op);
    }

    protected void regDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDate(), "date"); }
    protected abstract ConditionValue xgetCValueDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryId The value of categoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryId_Equal(Integer categoryId) {
        doSetCategoryId_Equal(categoryId);
    }

    protected void doSetCategoryId_Equal(Integer categoryId) {
        regCategoryId(CK_EQ, categoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryId The value of categoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryId_NotEqual(Integer categoryId) {
        doSetCategoryId_NotEqual(categoryId);
    }

    protected void doSetCategoryId_NotEqual(Integer categoryId) {
        regCategoryId(CK_NES, categoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryId The value of categoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryId_GreaterThan(Integer categoryId) {
        regCategoryId(CK_GT, categoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryId The value of categoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryId_LessThan(Integer categoryId) {
        regCategoryId(CK_LT, categoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryId The value of categoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryId_GreaterEqual(Integer categoryId) {
        regCategoryId(CK_GE, categoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryId The value of categoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCategoryId_LessEqual(Integer categoryId) {
        regCategoryId(CK_LE, categoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param minNumber The min number of categoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of categoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCategoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCategoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param minNumber The min number of categoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of categoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCategoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCategoryId(), "category_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryIdList The collection of categoryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCategoryId_InScope(Collection<Integer> categoryIdList) {
        doSetCategoryId_InScope(categoryIdList);
    }

    protected void doSetCategoryId_InScope(Collection<Integer> categoryIdList) {
        regINS(CK_INS, cTL(categoryIdList), xgetCValueCategoryId(), "category_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * category_id: {IX, NotNull, INT(10), FK to category}
     * @param categoryIdList The collection of categoryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCategoryId_NotInScope(Collection<Integer> categoryIdList) {
        doSetCategoryId_NotInScope(categoryIdList);
    }

    protected void doSetCategoryId_NotInScope(Collection<Integer> categoryIdList) {
        regINS(CK_NINS, cTL(categoryIdList), xgetCValueCategoryId(), "category_id");
    }

    protected void regCategoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCategoryId(), "category_id"); }
    protected abstract ConditionValue xgetCValueCategoryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param income The value of income as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncome_Equal(Integer income) {
        doSetIncome_Equal(income);
    }

    protected void doSetIncome_Equal(Integer income) {
        regIncome(CK_EQ, income);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param income The value of income as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncome_NotEqual(Integer income) {
        doSetIncome_NotEqual(income);
    }

    protected void doSetIncome_NotEqual(Integer income) {
        regIncome(CK_NES, income);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param income The value of income as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncome_GreaterThan(Integer income) {
        regIncome(CK_GT, income);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param income The value of income as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncome_LessThan(Integer income) {
        regIncome(CK_LT, income);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param income The value of income as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncome_GreaterEqual(Integer income) {
        regIncome(CK_GE, income);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param income The value of income as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncome_LessEqual(Integer income) {
        regIncome(CK_LE, income);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param minNumber The min number of income. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of income. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIncome_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIncome_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * income: {INT(10)}
     * @param minNumber The min number of income. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of income. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setIncome_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIncome(), "income", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * income: {INT(10)}
     * @param incomeList The collection of income as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIncome_InScope(Collection<Integer> incomeList) {
        doSetIncome_InScope(incomeList);
    }

    protected void doSetIncome_InScope(Collection<Integer> incomeList) {
        regINS(CK_INS, cTL(incomeList), xgetCValueIncome(), "income");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * income: {INT(10)}
     * @param incomeList The collection of income as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIncome_NotInScope(Collection<Integer> incomeList) {
        doSetIncome_NotInScope(incomeList);
    }

    protected void doSetIncome_NotInScope(Collection<Integer> incomeList) {
        regINS(CK_NINS, cTL(incomeList), xgetCValueIncome(), "income");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * income: {INT(10)}
     */
    public void setIncome_IsNull() { regIncome(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * income: {INT(10)}
     */
    public void setIncome_IsNotNull() { regIncome(CK_ISNN, DOBJ); }

    protected void regIncome(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncome(), "income"); }
    protected abstract ConditionValue xgetCValueIncome();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditure The value of expenditure as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpenditure_Equal(Integer expenditure) {
        doSetExpenditure_Equal(expenditure);
    }

    protected void doSetExpenditure_Equal(Integer expenditure) {
        regExpenditure(CK_EQ, expenditure);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditure The value of expenditure as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpenditure_NotEqual(Integer expenditure) {
        doSetExpenditure_NotEqual(expenditure);
    }

    protected void doSetExpenditure_NotEqual(Integer expenditure) {
        regExpenditure(CK_NES, expenditure);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditure The value of expenditure as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpenditure_GreaterThan(Integer expenditure) {
        regExpenditure(CK_GT, expenditure);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditure The value of expenditure as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpenditure_LessThan(Integer expenditure) {
        regExpenditure(CK_LT, expenditure);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditure The value of expenditure as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpenditure_GreaterEqual(Integer expenditure) {
        regExpenditure(CK_GE, expenditure);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditure The value of expenditure as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpenditure_LessEqual(Integer expenditure) {
        regExpenditure(CK_LE, expenditure);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param minNumber The min number of expenditure. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expenditure. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setExpenditure_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setExpenditure_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     * @param minNumber The min number of expenditure. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expenditure. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setExpenditure_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpenditure(), "expenditure", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditureList The collection of expenditure as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpenditure_InScope(Collection<Integer> expenditureList) {
        doSetExpenditure_InScope(expenditureList);
    }

    protected void doSetExpenditure_InScope(Collection<Integer> expenditureList) {
        regINS(CK_INS, cTL(expenditureList), xgetCValueExpenditure(), "expenditure");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * expenditure: {INT(10)}
     * @param expenditureList The collection of expenditure as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpenditure_NotInScope(Collection<Integer> expenditureList) {
        doSetExpenditure_NotInScope(expenditureList);
    }

    protected void doSetExpenditure_NotInScope(Collection<Integer> expenditureList) {
        regINS(CK_NINS, cTL(expenditureList), xgetCValueExpenditure(), "expenditure");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     */
    public void setExpenditure_IsNull() { regExpenditure(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * expenditure: {INT(10)}
     */
    public void setExpenditure_IsNotNull() { regExpenditure(CK_ISNN, DOBJ); }

    protected void regExpenditure(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpenditure(), "expenditure"); }
    protected abstract ConditionValue xgetCValueExpenditure();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_Equal(String detail) {
        doSetDetail_Equal(fRES(detail));
    }

    protected void doSetDetail_Equal(String detail) {
        regDetail(CK_EQ, detail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_NotEqual(String detail) {
        doSetDetail_NotEqual(fRES(detail));
    }

    protected void doSetDetail_NotEqual(String detail) {
        regDetail(CK_NES, detail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_GreaterThan(String detail) {
        regDetail(CK_GT, fRES(detail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_LessThan(String detail) {
        regDetail(CK_LT, fRES(detail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_GreaterEqual(String detail) {
        regDetail(CK_GE, fRES(detail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_LessEqual(String detail) {
        regDetail(CK_LE, fRES(detail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detailList The collection of detail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_InScope(Collection<String> detailList) {
        doSetDetail_InScope(detailList);
    }

    protected void doSetDetail_InScope(Collection<String> detailList) {
        regINS(CK_INS, cTL(detailList), xgetCValueDetail(), "detail");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detailList The collection of detail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDetail_NotInScope(Collection<String> detailList) {
        doSetDetail_NotInScope(detailList);
    }

    protected void doSetDetail_NotInScope(Collection<String> detailList) {
        regINS(CK_NINS, cTL(detailList), xgetCValueDetail(), "detail");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * detail: {VARCHAR(20)} <br>
     * <pre>e.g. setDetail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param detail The value of detail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDetail_LikeSearch(String detail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDetail_LikeSearch(detail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * detail: {VARCHAR(20)} <br>
     * <pre>e.g. setDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param detail The value of detail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDetail_LikeSearch(String detail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(detail), xgetCValueDetail(), "detail", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDetail_NotLikeSearch(String detail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDetail_NotLikeSearch(detail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * detail: {VARCHAR(20)}
     * @param detail The value of detail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDetail_NotLikeSearch(String detail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(detail), xgetCValueDetail(), "detail", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     */
    public void setDetail_IsNull() { regDetail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     */
    public void setDetail_IsNullOrEmpty() { regDetail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * detail: {VARCHAR(20)}
     */
    public void setDetail_IsNotNull() { regDetail(CK_ISNN, DOBJ); }

    protected void regDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDetail(), "detail"); }
    protected abstract ConditionValue xgetCValueDetail();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ExpensesCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ExpensesCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ExpensesCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ExpensesCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ExpensesCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ExpensesCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ExpensesCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ExpensesCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ExpensesCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ExpensesCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ExpensesCB&gt;() {
     *     public void query(ExpensesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ExpensesCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ExpensesCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ExpensesCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ExpensesCQ sq);

    protected ExpensesCB xcreateScalarConditionCB() {
        ExpensesCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ExpensesCB xcreateScalarConditionPartitionByCB() {
        ExpensesCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ExpensesCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ExpensesCB cb = new ExpensesCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ExpensesCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ExpensesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ExpensesCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ExpensesCB cb = new ExpensesCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ExpensesCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ExpensesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ExpensesCB cb = new ExpensesCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ExpensesCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ExpensesCB newMyCB() {
        return new ExpensesCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ExpensesCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
