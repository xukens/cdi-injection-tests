package pl.gov.coi.hacking.cdi.injection.tests;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
public abstract class SecAbstractDao<T extends Identifiable<Long>> extends AbstractDao<Long,T>{

    public SecAbstractDao(Class<T> cls) {
        super(cls);
    }
}
