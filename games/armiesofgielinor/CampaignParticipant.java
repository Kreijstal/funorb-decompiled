/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignParticipant extends IntrusiveNode {
    int[] availableUnitTypes;
    String displayName;
    static String field_l;
    int[] godFavourLevels;
    static int[][] field_s;
    int overrideCount;
    int[] equippedSpellIds;
    static String field_r;
    CampaignUnitOverride[] unitOverrides;
    int participantId;
    CoatOfArms coatOfArms;
    private static String field_z;

    public static void a(byte param0) {
        int var1 = -111 / ((param0 - 44) / 53);
        field_s = (int[][]) null;
        field_l = null;
        field_r = null;
    }

    CampaignParticipant() {
        this.unitOverrides = new CampaignUnitOverride[10];
    }

    static {
        field_z = "sd.A(";
        field_l = "Units must be able to move to be cloned.";
        field_r = "This unit has no use for flammable materials.";
    }
}
