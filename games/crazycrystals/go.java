/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends ln {
    static String field_k;
    static boolean field_i;
    static String field_g;
    static ef field_l;
    static String field_j;
    static long field_h;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        pj.a(ae.field_F, param0, be.field_c, true, uo.field_m, (byte) 119, 0);
        for (var2 = 0; be.field_c > var2; var2++) {
            wp.field_d[var2 + param0] = var2;
        }
        if (param1 != 240) {
            return;
        }
        pj.a(db.field_i, param0 + param0, be.field_c + param0, false, em.field_i, (byte) 119, param0);
        if (!(param0 >= be.field_c)) {
            be.field_c = param0;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 < 48) {
            go.b((byte) -69);
        }
        field_g = null;
        field_j = null;
        field_k = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 45 % ((55 - param1) / 50);
        return q.field_a[param0].field_l;
    }

    go(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(int param0) {
        int var4 = CrazyCrystals.field_B;
        if (param0 != -21587) {
            return;
        }
        int[] var5 = ga.field_J;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            int incrementValue$0 = var2;
            var2++;
            var5[incrementValue$0] = 0;
            int incrementValue$1 = var2;
            var2++;
            var5[incrementValue$1] = 0;
            int incrementValue$2 = var2;
            var2++;
            var5[incrementValue$2] = 0;
            int incrementValue$3 = var2;
            var2++;
            var5[incrementValue$3] = 0;
            int incrementValue$4 = var2;
            var2++;
            var5[incrementValue$4] = 0;
            int incrementValue$5 = var2;
            var2++;
            var5[incrementValue$5] = 0;
            int incrementValue$6 = var2;
            var2++;
            var5[incrementValue$6] = 0;
            int incrementValue$7 = var2;
            var2++;
            var5[incrementValue$7] = 0;
        }
    }

    final static void b(int param0) {
        ne.field_b = false;
        int discarded$7 = kd.field_n.h(param0 ^ 287);
        if (param0 != 480) {
            field_l = null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        var3 = 228 - 12 * param1;
        var4 = param1 * 12 + 252;
        var5 = 228 + -(12 * param0);
        var6 = 12 * param0 + 252;
        kh.d(0, 0, 480, var5, 0, 64);
        kh.d(0, var5, var3, -var5 + var6, 0, 64);
        kh.d(var3, var5, -var3 + var4, -var5 + var6, 0, 192);
        kh.d(var4, var5, 480 - var4, var6 + -var5, 0, 64);
        kh.d(0, var6, 480, 480 + -var6, 0, 64);
        var7 = tm.field_d[0][0].a((byte) -46);
        var8 = le.field_g[var7][0];
        var9 = -1;
        L0: while (true) {
          if (param1 < var9) {
            L1: {
              var9 = 0;
              if (!param2) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var9 >= param0) {
                var9 = -1;
                L3: while (true) {
                  if (var9 > param1) {
                    return;
                  } else {
                    var8.b(var9 * 24 + (240 + -(12 * param1)), 234 - -(12 * param0), 24, 36);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                var8.b(-24 + (240 + -(param1 * 12)), var9 * 24 + (-(param0 * 12) + 234), 24, 36);
                var8.b(240 - -(param1 * 12), 234 - 12 * param0 - -(var9 * 24), 24, 36);
                var9++;
                continue L2;
              }
            }
          } else {
            var8.b(-(param1 * 12) + (240 - -(24 * var9)), 234 - param0 * 12 - 24, 24, 36);
            var9++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "You cannot play this level yet.";
        field_g = "Your email address is used to identify this account";
        field_j = "Continue";
    }
}
