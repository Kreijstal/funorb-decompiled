/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fm {
    static boolean field_e;
    static String field_c;
    static boolean field_b;
    static long field_d;
    static boolean field_f;
    static String field_a;

    final static void a(byte param0, bh param1, bh param2) {
        int var3 = 32 % ((param0 - 60) / 49);
        if (!(null == param1.field_a)) {
            param1.b((byte) 113);
        }
        param1.field_b = param2;
        param1.field_a = param2.field_a;
        param1.field_a.field_b = param1;
        param1.field_b.field_a = param1;
    }

    final static void a(byte param0, int param1, kn param2) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        uf var7 = we.field_b;
        uf var8 = var7;
        var8.f(param1, -4);
        var8.field_n = var8.field_n + 1;
        int var4 = var8.field_n;
        var8.a(true, 1);
        var8.d(-1, param2.field_u);
        var8.d(-1, param2.field_x);
        var8.d(-1, param2.field_q);
        var8.a(param2.field_t, false);
        var8.a(param2.field_v, false);
        var8.a(param2.field_w, false);
        var8.a(param2.field_y, false);
        var8.a(true, param2.field_s.length);
        for (var5 = 0; var5 < param2.field_s.length; var5++) {
            var7.a(param2.field_s[var5], false);
        }
        int discarded$5 = var8.a((byte) -15, var4);
        var8.b(var8.field_n - var4, true);
        if (param0 > -90) {
            field_b = true;
        }
    }

    abstract void a(wl param0, byte param1);

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            Object var2 = null;
            fm.a((byte) 8, -15, (kn) null);
        }
    }

    abstract gh a(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          if (80 > param4) {
            stackOut_2_0 = param4 / 20 * 18;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 54;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          var8 = 0;
          if (60 <= param4) {
            if ((param4 ^ -1) > -81) {
              var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
              break L1;
            } else {
              if (param4 < 93) {
                var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                break L1;
              } else {
                hk.a(param1 + -36 + -3, param2 + 36 - 3, 78, 60, 4, 65280, 100);
                break L1;
              }
            }
          } else {
            var7 = var7 + vl.a(23841, 80, param3 * 18 - -40);
            break L1;
          }
        }
        cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
        cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
        cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
        cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
        fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
        fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
        var9 = 16 / ((59 - param5) / 43);
        fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
        fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "In Single-player";
        field_a = "Connection restored.";
    }
}
