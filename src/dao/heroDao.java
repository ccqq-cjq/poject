package dao;

import pojo.hero;

import java.util.List;

public interface heroDao {

    public int addHero(hero hero);

    public int deleteHerobyId(Integer id);

    public int updataHero(hero hero);

    public hero queryHerobyId(Integer id);

    public List<hero> queryHeros();
}
