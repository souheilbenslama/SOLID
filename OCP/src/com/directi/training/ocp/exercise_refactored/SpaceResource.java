package com.directi.training.ocp.exercise_refactored;

public class SpaceResource implements FreeResource , BusyResource
{
    @Override
    public int findFree()
    {
        return 0;
    }

    @Override
    public void markBusy(int resourceId)
    {

    }

    @Override
    public void markFree(int resourceId)
    {

    }
}
