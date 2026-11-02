/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends IntrusiveNode {
    int field_m;
    static String[] field_i;
    int field_k;
    static int field_j;
    static mk field_l;

    final static void e(int param0) {
        gh.field_k = false;
        vg.field_o = false;
        ProxySocketConnector.b(-1, (byte) -42);
        if (param0 != 640) {
          return;
        }
        rk.field_X = DiskArchiveStore.field_f;
        fd.field_h = DiskArchiveStore.field_f;
    }

    public static void d(int param0) {
        if (param0 != 640) {
          jf.d(-73);
          field_l = null;
          field_i = null;
          return;
        }
        field_l = null;
        field_i = null;
    }

    private jf() throws Throwable {
        throw new Error();
    }

    static {
        field_j = 640;
        field_l = new mk();
    }
}
