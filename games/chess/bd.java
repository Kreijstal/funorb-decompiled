/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static String[] field_e;
    static String field_c;
    static SoftwareModelMesh field_b;
    static cf field_a;
    static int field_d;
    private static String field_z;

    public static void clearStaticReferences(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 >= -2) {
          field_b = (SoftwareModelMesh) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_z = "bd.A(";
        field_c = "Please check if address is correct";
    }
}
