/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static byte[] field_e;
    static String field_c;
    static String field_d;
    static ce field_b;
    static int[] field_a;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -712028927;
        param1 = param1 | param1 >>> 1692747906;
        param1 = param1 | param1 >>> 1691135556;
        param1 = param1 | param1 >>> 1222173608;
        if (param0 != 8742) {
          field_d = null;
          param1 = param1 | param1 >>> 383713200;
          return param1 - -1;
        } else {
          param1 = param1 | param1 >>> 383713200;
          return param1 - -1;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, hn param2) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        hg var7 = gk.field_g;
        hg var8 = var7;
        var8.g(param0, param1 + 7);
        var8.field_l = var8.field_l + 1;
        int var4 = var8.field_l;
        var8.a(param1, -113);
        var8.a((byte) -111, param2.field_j);
        var8.a((byte) 122, param2.field_g);
        var8.a((byte) -119, param2.field_l);
        var8.a(param2.field_t, (byte) -42);
        var8.a(param2.field_m, (byte) -42);
        var8.a(param2.field_r, (byte) -42);
        var8.a(param2.field_k, (byte) -42);
        var8.a(param2.field_o.length, -67);
        for (var5 = 0; param2.field_o.length > var5; var5++) {
            var7.a(param2.field_o[var5], (byte) -42);
        }
        int discarded$0 = var8.b((byte) -111, var4);
        var8.b(var8.field_l - var4, -1);
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 3) {
            return;
        }
        if (he.field_Xb != null) {
            he.field_Xb.a(param1, 24960);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0>'s game";
        field_d = "Join <%0>'s game";
        field_e = new byte[]{(byte)7, (byte)3};
        field_a = new int[]{7, 9, 11};
    }
}
