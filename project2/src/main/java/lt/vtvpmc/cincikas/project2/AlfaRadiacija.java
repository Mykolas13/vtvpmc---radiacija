package lt.vtvpmc.cincikas.project2;

public class AlfaRadiacija extends Radiacija {

    public AlfaRadiacija(int stiprumas) {
        super(stiprumas);
    }

    @Override
    public void spinduliuoti() {
        System.out.println("As esu alfa radiacija ir as spinduliuoju "+this.stiprumas+" stiprumu");
    }
}
