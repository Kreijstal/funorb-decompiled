/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadStep {
    static String field_j;
    int field_f;
    String field_i;
    String field_g;
    String field_k;
    static int field_d;
    static PendingFlagRequest field_l;
    static int[] field_a;
    static ContentTransitionPhase field_h;
    Js5Archive field_c;
    static Sprite[] field_e;
    static int[] field_b;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_l = null;
        field_h = null;
        if (param0 == -3) {
          field_j = null;
          field_e = null;
          field_a = null;
          return;
        }
        field_j = (String) null;
        field_j = null;
        field_e = null;
        field_a = null;
    }

    static {
        field_z = "j.A(";
        field_j = "Full screen";
        field_l = null;
        field_h = new ContentTransitionPhase();
    }
}
