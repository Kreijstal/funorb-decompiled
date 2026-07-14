/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cm {
    static int field_j;
    int field_a;
    int field_g;
    int field_d;
    int field_e;
    static bh field_b;
    static mf field_i;
    int field_h;
    static int field_f;
    int field_c;

    final static void a(byte param0) {
        if (!hi.a((byte) -72)) {
          return;
        } else {
          if (param0 != -28) {
            cm.a((byte) 87);
            pf.a(4, 1, false);
            return;
          } else {
            pf.a(4, 1, false);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 < 44) {
            int discarded$0 = cm.b(91);
            field_b = null;
            return;
        }
        field_b = null;
    }

    abstract void a(int param0, int param1);

    final static int b(int param0) {
        if (param0 < 34) {
            return 54;
        }
        return 1;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        gi.a(true, 0, qh.field_D, -3300, lc.field_u, param0, ea.field_a);
        for (var2 = 0; qh.field_D > var2; var2++) {
            mh.field_y[param0 + var2] = var2;
        }
        var2 = -9 % ((79 - param1) / 38);
        gi.a(false, param0, qh.field_D - -param0, -3300, ok.field_L, param0 - -param0, ak.field_f);
        if (!(param0 >= qh.field_D)) {
            qh.field_D = param0;
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
