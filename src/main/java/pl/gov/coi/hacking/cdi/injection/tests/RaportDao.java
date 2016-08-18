package pl.gov.coi.hacking.cdi.injection.tests;

import javax.ejb.Stateless;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
@Stateless
@Slf4j
public class RaportDao extends SecAbstractDao<Raport> implements RaportDaoLocal, FindById<Long,Raport> {

    public RaportDao() {
        super(Raport.class);
    }

    @Override
    public void usunStareRaporty(int delay) {
        log.info("usunStareRaporty({})", delay);
    }
}
