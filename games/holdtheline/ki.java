/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends IntrusiveNode {
    static int field_o;
    PlatformTask[] field_k;
    int[] field_j;
    static String[] field_i;
    int[] field_m;
    int[] field_r;
    int field_n;
    int field_p;
    byte[][][] field_q;
    PlatformTask[] field_l;

    final static boolean a(boolean param0) {
        go.field_n = true;
        bn.field_k = 15000L + bb.b(-1);
        if (!param0) {
          return DiskCacheRequest.field_w == 11 ? true : false;
        }
        ki.a(false);
        return DiskCacheRequest.field_w == 11 ? true : false;
    }

    public static void clearSharedReferences(boolean param0) {
        field_i = null;
        if (!param0) {
          field_i = (String[]) null;
        }
    }

    ki() {
    }

    static {
        field_o = 4;
    }
}
