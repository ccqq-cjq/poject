package service;

import dao.heroDao;
import pojo.hero;
import service.HeroService;

import java.util.List;

public class HeroServiceImpl implements HeroService{

    @Override
    public void addhero(hero hero) {

    }

    @Override
    public void deleteHerobyId(Integer id) {

    }

    @Override
    public int updataHero(hero hero) {
        return 0;
    }

    @Override
    public hero queryHerobyId(Integer id) {
        return null;
    }

    @Override
    public List<hero> queryHeros() {
        return null;
    }
}
