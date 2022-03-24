package tech.getarrays.tricomms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.tricomms.tricommsService;
import tech.getarrays.tricomms.model.Tricomms;
import tech.getarrays.tricomms.repo.TricommsRepo;
import java.util.List;

@Service
public class tricommsServiceImpl implements tricommsService {

    @Autowired
    private TricommsRepo repo;

    @Override
    public Tricomms addTricomms(Tricomms entity){
        return repo.save(entity);
    }

    @Override
    public List<Tricomms> getAll(){
        return repo.findAll();
    }

    @Override
    public Tricomms updateTricomms(Tricomms entity){
        return repo.save(entity);
    }

    @Override
    public void deleteAnyUser(Long id){
        repo.deleteById(id);
    }
}
