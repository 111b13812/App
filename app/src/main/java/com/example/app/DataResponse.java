package com.example.app;

import java.util.List;

public class DataResponse {
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public static class Result {
        private List<SpeedEnforcementLocation> records;

        public List<SpeedEnforcementLocation> getRecords() {
            return records;
        }

        public void setRecords(List<SpeedEnforcementLocation> records) {
            this.records = records;
        }
    }
}
