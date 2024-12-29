package com.CricBuzz.cricbuss.converter;

import com.CricBuzz.cricbuss.dtos.request.StatusRequest;
import com.CricBuzz.cricbuss.model.Status;

public class StatusConvertor {


    public static Status statsRequestToStats(StatusRequest statsRequest) {
        Status status = new Status();
        status.setBattingAverage(statsRequest.getBattingAverage());
        status.setBowlingAverage(statsRequest.getBowlingAverage());
        status.setWicketsTaken(statsRequest.getWicketsTaken());
        status.setRunsScored(statsRequest.getRunsScored());
        return status;
    }
}
