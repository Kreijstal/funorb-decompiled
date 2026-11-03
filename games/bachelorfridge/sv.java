/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv {
    static cf field_a;
    static String field_b;
    static IndexedSprite field_c;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 == 24173) {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        sv.releaseStatics(90);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_z = "sv.A(";
        field_a = new cf();
        field_b = "Report abuse";
    }
}
