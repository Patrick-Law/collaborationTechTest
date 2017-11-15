package com.swipejobs.matchingengine.service;

import com.swipejobs.matchingengine.exception.RestException;
import com.swipejobs.matchingengine.model.job.Job;
import com.swipejobs.matchingengine.service.job.JobService;
import com.swipejobs.matchingengine.service.worker.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchingService {

    public JobService jobService;
    public WorkerService workerService;

    public List<Job> getJobs() throws RestException {
        List<Job> jobs = jobService.getJobs();

        return jobs.subList(0, 2);
    }

/*    public List<Job> getJobsByLiscence(Boolean driverLiscenceRequired) throws RestException {
        List<Job> candidates = jobService.getJobs();
        List<Job> results = candidates.stream().filter(item -> {
            try {
                return item.getDriverLicenseRequired().equals(workerService.getWorkers().get(0).getHasDriversLicense());
            } catch (RestException e) {
                e.printStackTrace();
            }
        }).collect(Collectors.toList());
        return results;
    }*/

}
