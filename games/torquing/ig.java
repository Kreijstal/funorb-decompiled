/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ig extends pc {
    static hc field_q;
    static nj[] field_r;

    ig(uc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_x, -1, 2147483647, false);
    }

    public static void b(int param0) {
        field_q = null;
        int var1 = 69 % ((param0 - -28) / 63);
        field_r = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        Object var7 = null;
        if (!param3) {
          if (param0 < 89) {
            var7 = null;
            ((ig) this).a(-112, 5, -61, true, (gm) null);
            super.a(117, param1, param2, param3, param4);
            return;
          } else {
            super.a(117, param1, param2, param3, param4);
            return;
          }
        } else {
          tk.a(param4.field_k + param1, param4.field_w + param2, param4.field_o, param4.field_p, false);
          if (param0 >= 89) {
            super.a(117, param1, param2, param3, param4);
            return;
          } else {
            var7 = null;
            ((ig) this).a(-112, 5, -61, true, (gm) null);
            super.a(117, param1, param2, param3, param4);
            return;
          }
        }
    }

    ig(int param0) {
        this(dg.field_e, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new nj[29];
    }
}
