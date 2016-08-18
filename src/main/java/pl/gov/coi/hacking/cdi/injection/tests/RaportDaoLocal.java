package pl.gov.coi.hacking.cdi.injection.tests;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
public interface RaportDaoLocal {

    /**
     * Metoda usuwa wszystkie raporty starsze niż delay ilość dni.
     *
     * @param delay liczba dni
     */
    void usunStareRaporty(int delay);

}
