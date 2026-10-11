/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static vm field_d;
    static int field_b;
    static ta field_a;
    static String[] field_c;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var12 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var21 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var14 = MinerDisturbance.field_ab;
        try {
          param0 = 0 - param0;
          if (!param3) {
            stackIn_4_0 = sj.field_d;
          } else {
            stackIn_4_0 = di.field_x;
          }
          var18 = stackIn_4_0;
          var16 = var18;
          var15 = var16;
          var21 = var15;
          if (var15 == null) {
            return;
          }
          var5 = 0;
          var6 = 0;
          for (var7 = 33; var7 >= 0; var7--) {
            stackIn_11_0 = (!nm.a(var7, var18, -827843803)) ? 0 : 1;
            var8 = stackIn_11_0;
            if (param3) {
              stackIn_21_0 = 0;
            } else {
              if (!pi.field_k[var7]) {
                if (pi.field_e[var7]) {
                  stackIn_21_0 = (0 < pj.field_a) ? 1 : 0;
                } else {
                  stackIn_21_0 = 1;
                }
              } else {
                stackIn_21_0 = 0;
              }
            }
            var9 = stackIn_21_0;
            if (var8 != 0 ||
              var9 != 0) {
              var6++;
            }
          }
          var7Lifetime1 = var6 / 9;
          var8Lifetime1 = param0 + 145;
          if (param1) {
            return;
          }
          var9Lifetime1 = 126;
          var10 = (var7Lifetime1 * 9 + (-var6 + 9)) * 20;
          var11 = 0;
          for (var12 = 0; var12 < ld.field_A.length; var12++) {
            if (nm.a(var12, var21, -827843803) ||
              !pi.field_k[var12] &&
              !param3 &&
              (!(0 >= pj.field_a) ||
              !pi.field_e[var12])) {
              if (var8Lifetime1 <= wi.field_w &&
                wi.field_w <= var8Lifetime1 + 32 &&
                m.field_e >= var9Lifetime1 &&
                m.field_e <= 32 + var9Lifetime1) {
                qh.field_c = 0;
                if (ah.field_e != var12) {
                  ah.field_e = var12;
                } else {
                  ah.field_e = -1;
                }
              }
              var5++;
              if (var5 == 9) {
                var11++;
                var8Lifetime1 = 145 + param0;
                var9Lifetime1 += 32;
                if (!param2) {
                  var9Lifetime1 += 5;
                }
                if (var7Lifetime1 == var11) {
                  var8Lifetime1 = var8Lifetime1 + var10;
                }
                var5 = 0;
              } else {
                var8Lifetime1 += 40;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "ce.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        int[] var2 = new int[]{14, 1, 5, 6, 12, 2, 3, 4};
        int[] var1 = var2;
        nb.field_i[4] = new ml(4, var1, 10, 200, kb.field_c == 2 ? 350 : 320, 270, 270 / var2.length, true, 1);
        int[] var3 = new int[]{13, 1, 19, 5, 6, 12, 3, 17};
        var1 = var3;
        nb.field_i[0] = new ml(0, var1, 10, 180, 320, 280, 280 / var3.length, true, 1);
        int[] var4 = new int[]{21, 20, 0};
        var1 = var4;
        nb.field_i[9] = new ml(9, var1, 10, 356, 390, 340, 110 / var4.length, true, 1);
        int[] var5 = new int[]{7, 8, 9, 0, 25};
        var1 = var5;
        nb.field_i[2] = new ml(2, var1, 320, 372, 640, param0, 600 / (var5.length - 2), false, 1);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >> 16;
        if (param0 != 4316) {
          ce.a(32, 8, 19);
        }
        int var4 = param1 & 65535;
        int var5 = param2 >> 16;
        int var6 = param2 & 65535;
        return var5 * var4 + (var3 * param2 + (var4 * var6 >> 16));
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 14480) {
          field_b = -61;
        }
    }

    static {
        field_a = new ta();
    }
}
