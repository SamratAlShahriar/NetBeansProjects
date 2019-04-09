package info.nayeem.sim.dao;

import info.nayeem.sim.domain.SimInfo;
import java.util.List;

/**
 *
 * @author Nayeem
 */
public interface SimInfoDAO {

    public void add(SimInfo add);

    public void update(SimInfo update);

    public void delete(int id);

    List<SimInfo> getSimInfoByMobileNo(String mobileNo);

    List<SimInfo> getAllSimInfo();
}
