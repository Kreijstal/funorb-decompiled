/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BoosterOrderText {
    static boolean field_a;
    static String fireBoostersText;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        fireBoostersText = null;
        if (param0 != 12472) {
          fireBoostersText = (String) null;
        }
    }

    static {
        field_z = "jb.A(";
        field_a = false;
        fireBoostersText = "Fire boosters";
    }
}
