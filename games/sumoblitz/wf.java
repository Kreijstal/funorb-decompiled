/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static SpriteData field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 <= 70) {
          wf.releaseStatics(34);
        }
    }

    static {
        field_z = "wf.A(";
    }
}
