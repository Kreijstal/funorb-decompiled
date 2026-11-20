/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuVertexKeyBuffer {
    static int field_a;
    static long[] renderVertexKeys;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        renderVertexKeys = null;
        if (param0 != 23870) {
          GpuVertexKeyBuffer.clearSharedReferences(81);
        }
    }

    static {
        field_z = "bsb.A(";
        field_a = 2;
    }
}
