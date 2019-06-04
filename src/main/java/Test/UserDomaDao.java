package Test;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface UserDomaDao {
    @Select
    List<UserDomaEntity> selectAll();

    @Select
    UserDomaEntity selectById(int id);
}