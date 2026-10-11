/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static dl field_a;
    static byte[][] field_b;
    static int[] field_c;

    public static void a(int param0) {
        if (param0 == 1000) {
          field_a = null;
          field_b = (byte[][]) null;
          field_c = null;
          return;
        }
        field_c = (int[]) null;
        field_a = null;
        field_b = (byte[][]) null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 == 1000) {
          return wl.field_d.field_gc == hh.field_d ? true : false;
        }
        field_b = (byte[][]) null;
        return wl.field_d.field_gc == hh.field_d ? true : false;
    }

    static {
        field_a = new dl();
        field_b = new byte[1000][];
    }
}
