package com.directi.training.ocp.exercise_refactored;

public interface BusyResource
{
    int findFree();
    void markBusy(int resourceId);
}
