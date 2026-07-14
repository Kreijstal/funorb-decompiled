/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends oh {
    byte[] field_o;
    static String field_i;
    static gq field_h;
    boolean field_l;
    static pf field_p;
    static String field_n;
    static String field_k;
    static String field_q;
    static bc field_m;
    static int field_j;

    public static void a(int param0) {
        field_q = null;
        if (param0 != 16711680) {
          field_q = null;
          field_m = null;
          field_n = null;
          field_h = null;
          field_k = null;
          field_i = null;
          field_p = null;
          return;
        } else {
          field_m = null;
          field_n = null;
          field_h = null;
          field_k = null;
          field_i = null;
          field_p = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, bi param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        param5 = param5 - param7.field_t;
        if (param4 >= -20) {
          ld.a(97);
          param0 = param0 - param7.field_x;
          var8 = param5 + param7.field_z * param0;
          var9 = param1 + gf.field_b * param3;
          var14 = -param6 + 256;
          L0: while (true) {
            param2--;
            if (param2 < 0) {
              return;
            } else {
              var8++;
              var10 = param7.field_B[var8];
              var11 = gf.field_h[var9];
              var12 = 16711935 & var10;
              var10 = var10 & 65280;
              var13 = 16711935 & var11;
              var11 = var11 & 65280;
              var12 = (-16711936 & var12 * param6) - -(-16711936 & var14 * var13);
              var10 = (16711680 & var11 * var14) + (16711680 & var10 * param6);
              var10 = (var10 | var12) >>> -1308830744;
              var9++;
              gf.field_h[var9] = var10;
              continue L0;
            }
          }
        } else {
          param0 = param0 - param7.field_x;
          var8 = param5 + param7.field_z * param0;
          var9 = param1 + gf.field_b * param3;
          var14 = -param6 + 256;
          L1: while (true) {
            param2--;
            if (param2 < 0) {
              return;
            } else {
              var8++;
              var10 = param7.field_B[var8];
              var11 = gf.field_h[var9];
              var12 = 16711935 & var10;
              var10 = var10 & 65280;
              var13 = 16711935 & var11;
              var11 = var11 & 65280;
              var12 = (-16711936 & var12 * param6) - -(-16711936 & var14 * var13);
              var10 = (16711680 & var11 * var14) + (16711680 & var10 * param6);
              var10 = (var10 | var12) >>> -1308830744;
              var9++;
              gf.field_h[var9] = var10;
              continue L1;
            }
          }
        }
    }

    ld() {
    }

    final static void d(int param0) {
        if (param0 != 0) {
          L0: {
            field_m = null;
            if (di.field_m == 0) {
              sg.a(true, false, 0, aa.field_P, tk.field_C);
              sg.a(true, false, 700, qf.field_c, tk.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            di.field_m = di.field_m + 1;
            if (-951 == (di.field_m + 1 ^ -1)) {
              jc.a(5, (byte) -67);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (di.field_m == 0) {
              sg.a(true, false, 0, aa.field_P, tk.field_C);
              sg.a(true, false, 700, qf.field_c, tk.field_C);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            di.field_m = di.field_m + 1;
            if (-951 == (di.field_m + 1 ^ -1)) {
              jc.a(5, (byte) -67);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "to keep fullscreen or";
        field_h = new gq(10, 2, 2, 0);
        field_n = "TAB - hide chat temporarily";
        field_q = "Won";
        field_k = "Add friend";
    }
}
