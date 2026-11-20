/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuFaceNormal {
    int z;
    int y;
    static Sprite field_b;
    int x;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        int var1 = 110 % ((6 - param0) / 37);
        field_b = null;
    }

    static {
        field_z = "vib.A(";
    }
}
