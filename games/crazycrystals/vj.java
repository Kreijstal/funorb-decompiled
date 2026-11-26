/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static RgbSprite[][] field_a;
    static PlatformTask field_b;
    static String field_c;
    private static String field_z;

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_c = null;
        field_a = (RgbSprite[][]) null;
        if (param0 != 26988) {
          vj.clearStaticReferences(-88);
        }
    }

    static {
        field_z = "vj.A(";
        field_c = "Waiting for levels";
    }
}
