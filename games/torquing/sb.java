/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends q {
    private int field_m;
    private int field_k;
    private String field_o;
    static boolean field_p;
    private int field_j;
    private int field_l;
    static String[] field_n;

    public static void a() {
        field_n = null;
    }

    final void a(byte param0) {
        if (param0 > -77) {
          return;
        } else {
          L0: {
            ((sb) this).field_j = ((sb) this).field_j - 2;
            ((sb) this).field_m = ((sb) this).field_m - ((sb) this).field_l;
            if (((sb) this).field_j >= 16) {
              break L0;
            } else {
              ((sb) this).f(0);
              break L0;
            }
          }
          return;
        }
    }

    final static boolean b() {
        return no.field_n.a((byte) -74);
    }

    final void c(int param0) {
        int var2 = 60 % ((param0 - -38) / 54);
        int discarded$0 = dd.field_c.a(((sb) this).field_o, -80 + ((sb) this).field_k, ((sb) this).field_m, 160, 1000, 16776960, -1, ((sb) this).field_j, 1, 0, dd.field_c.field_t + dd.field_c.field_x);
    }

    sb(String param0, int param1, int param2, int param3) {
        try {
            ((sb) this).field_m = param2;
            ((sb) this).field_j = 255;
            ((sb) this).field_k = param1;
            ((sb) this).field_o = param0;
            ((sb) this).field_l = param3;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
