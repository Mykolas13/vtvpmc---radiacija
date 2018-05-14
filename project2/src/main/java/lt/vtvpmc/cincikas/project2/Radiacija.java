package lt.vtvpmc.cincikas.project2;

public abstract class Radiacija implements IRadiacija{
    protected int stiprumas;

    public Radiacija(int stiprumas) {
        this.stiprumas = stiprumas;
    }

    @Override
    public abstract void spinduliuoti();
}
