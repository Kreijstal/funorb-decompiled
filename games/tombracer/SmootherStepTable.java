/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SmootherStepTable {
    static int[] values;
    static String field_a;
    static String field_d;
    static String field_c;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 == 4096) {
          values = null;
          field_a = null;
          field_d = null;
          return;
        }
        SmootherStepTable.releaseStatics(-39);
        values = null;
        field_a = null;
        field_d = null;
    }

    static {
        int var0 = 0;
        field_z = "pba.A(";
        values = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
          values[var0] = LegacyOpenGlRidgedWaterEffect.smootherStep(var0, 5888);
        }
        field_d = "Accept invitation to <%0>'s game";
        field_c = "Shoot a pistol, if you've collected one. Bullets are unlimited.";
        field_a = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
