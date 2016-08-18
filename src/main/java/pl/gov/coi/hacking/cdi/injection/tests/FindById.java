package pl.gov.coi.hacking.cdi.injection.tests;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
public interface FindById<L extends Number,T extends Identifiable<L>> {
    T find(L id);
}
