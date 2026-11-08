/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPoolState {
    static int[] field_c;
    static byte[][] field_b;
    static long[] field_d;
    static UiLayoutNode field_a;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_b = (byte[][]) null;
        field_d = null;
        field_a = null;
        if (param0) {
          ByteArrayPoolState.releaseStatics(false);
        }
    }

    static {
        field_z = "sg.A(";
        field_b = new byte[250][];
        field_c = new int[5];
        field_d = new long[]{64356L, 64749L, 64749L};
    }
}
