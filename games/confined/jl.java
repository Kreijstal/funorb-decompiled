/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jl extends rk {
    static int[] field_p;
    static String field_n;
    jl field_o;
    static String field_m;
    long field_r;
    jl field_q;

    final void b(boolean param0) {
        if (!(null != ((jl) this).field_q)) {
            return;
        }
        ((jl) this).field_q.field_o = ((jl) this).field_o;
        ((jl) this).field_o.field_q = ((jl) this).field_q;
        ((jl) this).field_o = null;
        ((jl) this).field_q = null;
        if (!param0) {
            field_p = null;
        }
    }

    final static nf[] a(int param0, int param1, int param2, mi param3) {
        if (param0 == -5744) {
          if (!mc.a(param2, param1, param3, (byte) 119)) {
            return null;
          } else {
            return si.a((byte) -9);
          }
        } else {
          field_p = null;
          if (!mc.a(param2, param1, param3, (byte) 119)) {
            return null;
          } else {
            return si.a((byte) -9);
          }
        }
    }

    final static void a(byte param0) {
        ki.field_b = new ke();
        int var1 = 18 % ((param0 - -84) / 36);
        dn.field_b.a((fj) (Object) ki.field_b, (byte) -72);
    }

    final static bm a(int[] param0, bm param1, int param2) {
        bm var3 = new bm(param2, 0, 0);
        var3.field_e = param1.field_e;
        var3.field_m = param0;
        var3.field_a = param1.field_a;
        var3.field_i = param1.field_i;
        var3.field_h = param1.field_h;
        var3.field_c = param1.field_c;
        var3.field_n = param1.field_n;
        var3.field_g = param1.field_g;
        return var3;
    }

    public static void b(int param0) {
        if (param0 != 9898) {
          jl.a((byte) -120);
          field_p = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_p = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    protected jl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Loading animations";
        field_m = "Type your password again to make sure it's correct";
    }
}
