package Test;

/** */
@javax.annotation.Generated(value = { "Doma", "2.18.0" }, date = "2019-06-03T09:34:19.568+0900")
public final class _UserDomaEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<Test.UserDomaEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.18.0");
    }

    private static final _UserDomaEntity __singleton = new _UserDomaEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, Test.UserDomaEntity, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(Test.UserDomaEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, false, __idGenerator);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, Test.UserDomaEntity, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(Test.UserDomaEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, true, true, false);

    /** the tag */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, Test.UserDomaEntity, java.lang.Integer, Object> $tag = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(Test.UserDomaEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "tag", "", __namingType, true, true, false);

    /** the year */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, Test.UserDomaEntity, java.lang.Integer, Object> $year = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(Test.UserDomaEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "year", "", __namingType, true, true, false);

    /** the description */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, Test.UserDomaEntity, java.lang.String, Object> $description = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(Test.UserDomaEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "description", "", __namingType, true, true, false);

    /** the url */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, Test.UserDomaEntity, java.lang.String, Object> $url = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(Test.UserDomaEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "url", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<Test.UserDomaEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> __entityPropertyTypeMap;

    private _UserDomaEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "UserDomaEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "user_information";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> __map = new java.util.HashMap<>(6);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __list.add($tag);
        __map.put("tag", $tag);
        __list.add($year);
        __map.put("year", $year);
        __list.add($description);
        __map.put("description", $description);
        __list.add($url);
        __map.put("url", $url);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(Test.UserDomaEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<Test.UserDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(Test.UserDomaEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<Test.UserDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(Test.UserDomaEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<Test.UserDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(Test.UserDomaEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<Test.UserDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(Test.UserDomaEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<Test.UserDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(Test.UserDomaEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<Test.UserDomaEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<Test.UserDomaEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, Test.UserDomaEntity, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, Test.UserDomaEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, Test.UserDomaEntity, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public Test.UserDomaEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<Test.UserDomaEntity, ?>> __args) {
        Test.UserDomaEntity entity = new Test.UserDomaEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("tag") != null) __args.get("tag").save(entity);
        if (__args.get("year") != null) __args.get("year").save(entity);
        if (__args.get("description") != null) __args.get("description").save(entity);
        if (__args.get("url") != null) __args.get("url").save(entity);
        return entity;
    }

    @Override
    public Class<Test.UserDomaEntity> getEntityClass() {
        return Test.UserDomaEntity.class;
    }

    @Override
    public Test.UserDomaEntity getOriginalStates(Test.UserDomaEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(Test.UserDomaEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserDomaEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserDomaEntity newInstance() {
        return new _UserDomaEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<Test.UserDomaEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
