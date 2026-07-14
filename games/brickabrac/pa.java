/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ta {
    static jp[] field_l;
    static th field_k;
    static jp[] field_h;
    static jp[] field_m;
    static int[] field_i;
    static jp field_j;
    static int field_n;

    final static void a(int param0, int param1, int param2, dh param3, int param4, int param5, int param6, ta param7, int param8, int param9, int param10, int param11, int param12, ta param13, int param14, int param15, dh param16, ta param17, int param18, int param19, int param20) {
        fr.a(param6, param16, param3, true);
        tn.a(param11, param14, 256, param18, param0);
        pp.a(param5, param4, (byte) 19);
        cp.a(param15, param2, param13, 73, param17, param19);
        hd.a(117, param7, param10, param1);
        mj.a(param12, param9, false, param8);
        if (param20 != 10) {
            pa.a(true);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        lb.d(param2 + 1, 1 + param4, param0 + -2, param1 - 2, 0, 128);
        super.a(param0, param1, param2, param3, param4);
    }

    final static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          pa.a(-2, -34, -105, (dh) null, -37, -46, -79, (ta) null, 96, 79, -47, -14, 91, (ta) null, -22, -64, (dh) null, (ta) null, 77, -115, -55);
          ed.a(0, 0);
          return;
        } else {
          ed.a(0, 0);
          return;
        }
    }

    pa(jp[] param0) {
        super(param0);
    }

    public static void c(int param0) {
        field_m = null;
        field_i = null;
        field_k = null;
        field_h = null;
        field_j = null;
        if (param0 != 5) {
            return;
        }
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[1500];
        field_k = new th(10, 2, 2, 0);
        field_n = 5;
    }
}
