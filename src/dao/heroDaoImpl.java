package dao;

import pojo.hero;

import java.util.List;

public class heroDaoImpl extends BaseDao implements heroDao{
    @Override
    public int addHero(hero hero) {
        String sql = "insert into t_lol('name','Q','W','E','R')value(?,?,?,?,?)";
        return updata(sql,hero.getName(),hero.getQ(),hero.getW(),hero.getE(),hero.getR());
    }

    @Override
    public int deleteHerobyId(Integer id) {
        String sql = "delete from t_lol where id=? ";
        return updata(sql,id);
    }

    @Override
    public int updataHero(hero hero) {
        String sql = "updata t_lol set 'name'=?,'Q'=?,'W'=?,'E'=?,'R'=? where id=? ";
        return updata(sql,hero.getName(),hero.getQ(),hero.getW(),hero.getE(),hero.getR(),hero.getId());
    }

    @Override
    public hero queryHerobyId(Integer id) {
        String sql = "select 'id','name','Q','W','E','R' from t_lol where id=? ";
        return queryForOne(hero.class,sql,id);
    }

    @Override
    public List<hero> queryHeros() {
        String sql = "select 'id','name','Q','W','E','R' from t_lol";
        return queryForList(hero.class,sql);
    }
}
