package lt.vtvpmc.cincikas.project2;

public class BetaRadiacija extends Radiacija {

    public BetaRadiacija(int stiprumas) {
        super(stiprumas);
    }

    @Override
    public void spinduliuoti() {
        System.out.println("As esu beta radiacija ir as spinduliuoju "+this.stiprumas+" stiprumu");
    }
}
