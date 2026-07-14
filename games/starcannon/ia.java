/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends rb {
    static String field_l;
    static int field_k;
    private jb field_m;
    private int field_j;

    final static void a(String param0, String param1, int param2) {
        ne.a(false, param1, param0, param2 ^ 150);
        if (param2 == 0) {
            return;
        }
        field_k = 30;
    }

    final int m(int param0) {
        if (param0 != 255) {
            Object var3 = null;
            ia.a((rf) null, (rf) null, (byte) -73);
            ((ia) this).field_g = ((ia) this).field_g + 1;
            return ((ia) this).field_f[((ia) this).field_g] - ((ia) this).field_m.d(param0 ^ 252) & 255;
        }
        ((ia) this).field_g = ((ia) this).field_g + 1;
        return ((ia) this).field_f[((ia) this).field_g] - ((ia) this).field_m.d(param0 ^ 252) & 255;
    }

    final void d(byte param0, int param1) {
        ((ia) this).field_g = ((ia) this).field_g + 1;
        ((ia) this).field_f[((ia) this).field_g] = (byte)(param1 + ((ia) this).field_m.d(3));
        if (param0 >= 14) {
            return;
        }
        field_l = null;
    }

    final static void a(rf param0, rf param1, byte param2) {
        if (param2 != 57) {
            field_l = null;
            if (param0.field_d == null) {
                param0.field_a = param1.field_a;
                param0.field_d = param1;
                param0.field_d.field_a = param0;
                param0.field_a.field_d = param0;
                return;
            }
            param0.b(4);
            param0.field_a = param1.field_a;
            param0.field_d = param1;
            param0.field_d.field_a = param0;
            param0.field_a.field_d = param0;
            return;
        }
        if (param0.field_d != null) {
            param0.b(4);
            param0.field_a = param1.field_a;
            param0.field_d = param1;
            param0.field_d.field_a = param0;
            param0.field_a.field_d = param0;
            return;
        }
        param0.field_a = param1.field_a;
        param0.field_d = param1;
        param0.field_d.field_a = param0;
        param0.field_a.field_d = param0;
    }

    final void l(int param0) {
        int var2 = -5 / ((58 - param0) / 56);
        ((ia) this).field_g = (((ia) this).field_j - -7) / 8;
    }

    public static void k(int param0) {
        field_l = null;
        if (param0 > 29) {
            return;
        }
        Object var2 = null;
        ia.a((rf) null, (rf) null, (byte) -41);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var4 = 112 / ((param1 - -62) / 42);
          param2 = s.a(param2, '_', "", (byte) -10);
          var3 = vh.a(param0, 0);
          if (0 != (param2.indexOf(param0) ^ -1)) {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L0;
          } else {
            if ((param2.indexOf(var3) ^ -1) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return true;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    final void a(int[] param0, byte param1) {
        ((ia) this).field_m = new jb(param0);
        int var3 = -76 / ((param1 - -5) / 46);
    }

    final void b(int param0, byte param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var5 = 0;
        if (param1 != -54) {
          return;
        } else {
          L0: while (true) {
            if (var5 < param0) {
              ((ia) this).field_g = ((ia) this).field_g + 1;
              param2[param3 + var5] = (byte)(((ia) this).field_f[((ia) this).field_g] + -((ia) this).field_m.d(dg.a((int) param1, -55)));
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final void c(boolean param0) {
        if (!param0) {
            return;
        }
        ((ia) this).field_j = ((ia) this).field_g * 8;
    }

    final int e(int param0, int param1) {
        int var6 = StarCannon.field_A;
        int var3 = ((ia) this).field_j >> -639891805;
        int var4 = -(((ia) this).field_j & 7) + param0;
        int var5 = 0;
        ((ia) this).field_j = ((ia) this).field_j + param1;
        while (param1 > var4) {
            var3++;
            var5 = var5 + ((wh.field_e[var4] & ((ia) this).field_f[var3]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (wh.field_e[var4] & ((ia) this).field_f[var3]);
        } else {
            var5 = var5 + (((ia) this).field_f[var3] >> -param1 + var4 & wh.field_e[param1]);
        }
        return var5;
    }

    ia(int param0) {
        super(param0);
    }

    ia(byte[] param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Loading music";
    }
}
