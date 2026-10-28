/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static TerrainMaskSupport field_c;
    static LoginStage field_b;
    static Sprite[] field_d;
    static String field_a;
    private static String field_z;

    public static void releaseStatics(int guard) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (guard != 8123) {
          field_d = (Sprite[]) null;
        }
    }

    static {
        field_z = "mc.A(";
        field_c = new TerrainMaskSupport();
        field_b = new LoginStage();
        field_a = "Instructions";
    }
}
