package pl.gov.coi.hacking.cdi.injection.tests;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import lombok.AccessLevel;
import lombok.Setter;

/**
 * @author Paweł Nowakowski <pawel.nowakowski@coi.gov.pl>
 */
@Path("/")
public class GreetingController {

    @Setter(onMethod = @__(@Inject), value = AccessLevel.PROTECTED)
    private RaportDaoLocal raportDao;

    @Setter(onMethod = @__(@Inject), value = AccessLevel.PROTECTED)
    private FindById<Long,Raport> raportFindById;

    @Setter(onMethod = @__(@Inject), value = AccessLevel.PROTECTED)
    private FindById<Long,TypRaportu> typRaportFindById;

    @GET
    @Path("dao")
    public String dao() {
        raportDao.usunStareRaporty(16);
        return "usunStareRaporty - success";
    }

    @GET
    @Path("abstract")
    public String abs() {
        Raport raport = raportFindById.find(56L);
        typRaportFindById.find(11L);
        return raport.toString();
    }
}
