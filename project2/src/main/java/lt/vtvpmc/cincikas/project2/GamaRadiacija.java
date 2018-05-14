package lt.vtvpmc.cincikas.project2;

public class GamaRadiacija extends Radiacija {

    public GamaRadiacija(int stiprumas) {
        super(stiprumas);
    }

    @Override
    public void spinduliuoti() {
        System.out.println("As esu gama radiacija ir as spinduliuoju "+this.stiprumas+" stiprumu");
    }
}
