package pl.gov.coi.hacking.cdi.injection.tests;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
@Slf4j
@RequiredArgsConstructor
public abstract class AbstractDao<L extends Number,T extends Identifiable<L>> implements FindById<L,T> {

    private final Class<T> cls;

    @Override
    public T find(Number id) {
        log.info("find({})", id);
        try {
            return cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
