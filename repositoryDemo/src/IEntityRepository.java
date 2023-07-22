public interface IEntityRepository <T extends IEntity>{
    void add(T entity);//entity-> veri tabanı nesnesi
    void delete(T entity);
    void update(T entity);
}
