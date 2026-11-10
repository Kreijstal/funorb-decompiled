/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static jea field_e;
    static TriangleMesh[] field_b;
    static GameClock field_a;
    static String field_c;
    static BinaryBitmapFont field_d;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        int var1 = -104 / ((param0 - 18) / 32);
        field_c = null;
        field_d = null;
    }

    static {
        field_z = "cq.A(";
        field_c = "to keep fullscreen or";
    }
}
