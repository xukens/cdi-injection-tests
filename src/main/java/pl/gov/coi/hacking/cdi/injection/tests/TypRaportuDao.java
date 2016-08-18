package pl.gov.coi.hacking.cdi.injection.tests;

import javax.ejb.Stateless;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
@Stateless
@Slf4j
public class TypRaportuDao extends SecAbstractDao<TypRaportu> implements  FindById<Long,TypRaportu> {

    public TypRaportuDao() {
        super(TypRaportu.class);
    }

}
