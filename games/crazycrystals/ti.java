/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends rd {
    static ko field_l;
    static boolean field_o;
    private int field_n;
    private int field_k;
    static ko field_m;
    static String field_j;

    final static int a(int param0, CharSequence param1) {
        Object var3 = null;
        if (param0 != 100) {
          var3 = null;
          int discarded$2 = ti.a(92, (CharSequence) null);
          return ud.a(param1, 10, (byte) -76, true);
        } else {
          return ud.a(param1, 10, (byte) -76, true);
        }
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((ti) this).field_k = ((ti) this).field_k + 1;
        ((ti) this).field_n = ((ti) this).field_n + param3;
        if (param0) {
          field_j = null;
          ph.a(100, (byte) 107, param1, param4);
          return bm.field_g;
        } else {
          ph.a(100, (byte) 107, param1, param4);
          return bm.field_g;
        }
    }

    final void a(byte param0) {
        int var2 = -79 / ((param0 - 29) / 42);
        tb.field_d.a(rd.field_i, 100, 48 * (gi.field_m * ((ti) this).field_k), ((ti) this).field_n / ((ti) this).field_k);
        ((ti) this).field_k = 0;
        ((ti) this).field_n = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        pd.field_g[param1] = pd.field_g[param1] + 100 * param2;
        if (!param0) {
            ((ti) this).a((byte) -20);
        }
    }

    final pb b(byte param0) {
        if (param0 > -127) {
            return null;
        }
        return (pb) (Object) new qh();
    }

    public static void c(int param0) {
        field_l = null;
        field_m = null;
        field_j = null;
        int var1 = 124 % ((52 - param0) / 38);
    }

    ti() {
        ((ti) this).field_n = 0;
        ((ti) this).field_k = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "No adverts";
    }
}
