package service;

import pojo.hero;

import java.util.List;

public interface HeroService {
    public void addhero(hero hero);

    public void deleteHerobyId(Integer id);

    public int updataHero(hero hero);

    public hero queryHerobyId(Integer id);

    public List<hero> queryHeros();
}
