/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int[] firstVertexTransformedZ;
    static String pleaseTryAgainText;
    static boolean field_e;
    static int field_d;
    static ResourceArchive field_c;

    public static void b(int param0) {
        pleaseTryAgainText = null;
        firstVertexTransformedZ = null;
        if (param0 != -15647) {
            return;
        }
        field_c = null;
    }

    final static boolean a(int param0) {
        int var1 = -59 / ((param0 - 34) / 41);
        return al.a((byte) -109, NodeHashTableIterator.c(118));
    }

    static {
        pleaseTryAgainText = "Please try again in a few minutes.";
        firstVertexTransformedZ = new int[8192];
        field_d = 10;
    }
}
