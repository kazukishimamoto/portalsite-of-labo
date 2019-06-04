package Test;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.18.0" }, date = "2019-06-03T09:34:19.736+0900")
public class UserDomaDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements Test.UserDomaDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.18.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(Test.UserDomaDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(Test.UserDomaDao.class, "selectById", int.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserDomaDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<Test.UserDomaEntity> selectAll() {
        entering("Test.UserDomaDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/Test/UserDomaDao/selectAll.sql");
            __query.setEntityType(Test._UserDomaEntity.getSingletonInternal());
            __query.setCallerClassName("Test.UserDomaDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<Test.UserDomaEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<Test.UserDomaEntity>(Test._UserDomaEntity.getSingletonInternal()));
            java.util.List<Test.UserDomaEntity> __result = __command.execute();
            __query.complete();
            exiting("Test.UserDomaDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("Test.UserDomaDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public Test.UserDomaEntity selectById(int id) {
        entering("Test.UserDomaDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/Test/UserDomaDao/selectById.sql");
            __query.setEntityType(Test._UserDomaEntity.getSingletonInternal());
            __query.addParameter("id", int.class, id);
            __query.setCallerClassName("Test.UserDomaDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<Test.UserDomaEntity> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<Test.UserDomaEntity>(Test._UserDomaEntity.getSingletonInternal()));
            Test.UserDomaEntity __result = __command.execute();
            __query.complete();
            exiting("Test.UserDomaDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("Test.UserDomaDaoImpl", "selectById", __e);
            throw __e;
        }
    }

}
