package tech.getarrays.tricomms;

import tech.getarrays.tricomms.model.Tricomms;
import java.util.List;

public interface tricommsService {
    Tricomms addTricomms(Tricomms entity);
    List<Tricomms> getAll();
    Tricomms updateTricomms(Tricomms entity);
    void deleteAnyUser(Long id);
}
