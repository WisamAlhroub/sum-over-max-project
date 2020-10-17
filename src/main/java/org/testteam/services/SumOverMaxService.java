package org.testteam.services;

public class SumOverMaxService {
    private ListSumService sumService;
    private ListMaxService maxService;

    public SumOverMaxService(ListSumService sumService, ListMaxService maxService) {
        this.sumService = sumService;
        this.maxService = maxService;
    }

    public double sumOverMax(){
        return sumService.sum() / (double) maxService.getMax();
    }
}
