/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int[] field_b;
    static int field_e;
    static je field_c;
    static String field_f;
    static String field_d;
    static int[] field_a;
    static hl field_g;

    final static oh[] a(int param0, int param1, int param2, int param3, byte param4) {
        oh[] var5 = null;
        oh[] var6 = null;
        var6 = new oh[9];
        var5 = var6;
        oh dupTemp$4 = ce.a(param2, 1, 0);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        oh dupTemp$5 = ce.a(param0, 1, 0);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param3 != 0) {
          var6[4] = ce.a(param3, 64, 0);
          return var5;
        } else {
          return var5;
        }
    }

    final static String a(int param0) {
        if (!(null != ph.field_w)) {
            return "";
        }
        return ph.field_w;
    }

    final static void a(oh param0, int param1) {
        try {
            if (param1 != 6) {
                Object var3 = null;
                bd.a((oh) null, -66);
            }
            me.a(false);
            param0.c();
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new je();
        field_f = "Report abuse";
        field_d = "Quick Chat game";
    }
}
