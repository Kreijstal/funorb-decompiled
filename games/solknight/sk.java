/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sk extends ec {
    boolean field_r;
    boolean field_q;
    static int field_o;
    static mg field_n;
    volatile boolean field_m;
    static fg field_p;

    final static hd a(byte param0, da param1, int param2, int param3, da param4) {
        int var5 = 0;
        if (!l.a(103, param2, param3, param1)) {
          return null;
        } else {
          var5 = 50 / ((param0 - 21) / 49);
          return sb.a(param4.b(param3, 12257, param2), 32223);
        }
    }

    final static void a(int param0, int param1, int param2, dl param3, int param4, int param5, int param6, int param7, String param8) {
        ue.field_a = param2;
        qk.field_o = param8;
        vc.field_e = param4;
        n.field_a = param3;
        hj.field_x = param5;
        sa.field_o = param7;
        if (param0 != -11400) {
          field_o = 5;
          q.field_a = param6;
          nc.field_a = param1;
          il.field_c = (va) (Object) new ea();
          pf.field_d = new ae(param3);
          d.field_b = new ne(il.field_c, pf.field_d);
          return;
        } else {
          q.field_a = param6;
          nc.field_a = param1;
          il.field_c = (va) (Object) new ea();
          pf.field_d = new ae(param3);
          d.field_b = new ne(il.field_c, pf.field_d);
          return;
        }
    }

    final static int g(int param0) {
        if (param0 != -9917) {
            field_o = 29;
            return 1;
        }
        return 1;
    }

    abstract int a(byte param0);

    abstract byte[] f(int param0);

    public static void h(int param0) {
        field_n = null;
        if (param0 >= -78) {
            sk.h(-30);
            field_p = null;
            return;
        }
        field_p = null;
    }

    sk() {
        ((sk) this).field_m = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_p = new fg("email");
    }
}
