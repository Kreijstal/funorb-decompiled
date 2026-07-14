/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends um {
    static dl field_h;
    static String field_j;
    private int field_g;
    static ko field_k;
    private int field_i;

    final void a(byte param0) {
        int var2 = 57 / ((29 - param0) / 42);
        tb.field_d.a(ck.field_cb, 100, 48 * (gi.field_m * ((ad) this).field_i), ((ad) this).field_g / ((ad) this).field_i);
        ((ad) this).field_i = 0;
        ((ad) this).field_g = 0;
    }

    public static void c(int param0) {
        field_k = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
            field_h = null;
        }
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            pb discarded$0 = ((ad) this).b((byte) 105);
            return (pb) (Object) new eq();
        }
        return (pb) (Object) new eq();
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          ((ad) this).a(true, 97, 64, -58);
          pd.field_g[param1] = pd.field_g[param1] + param2 * 100;
          return;
        } else {
          pd.field_g[param1] = pd.field_g[param1] + param2 * 100;
          return;
        }
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        if (param0) {
          ((ad) this).field_g = -58;
          ((ad) this).field_i = ((ad) this).field_i + 1;
          ((ad) this).field_g = ((ad) this).field_g + param3;
          ph.a(100, (byte) 107, param1, param4);
          return bm.field_g;
        } else {
          ((ad) this).field_i = ((ad) this).field_i + 1;
          ((ad) this).field_g = ((ad) this).field_g + param3;
          ph.a(100, (byte) 107, param1, param4);
          return bm.field_g;
        }
    }

    ad() {
        ((ad) this).field_g = 0;
        ((ad) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Type your password again to make sure it's correct";
    }
}
