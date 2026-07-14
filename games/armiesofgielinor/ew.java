/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ew {
    static String field_b;
    static ou field_e;
    static int[] field_a;
    static je field_d;
    static String field_c;

    final static nj a(byte param0, wk param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        nj var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        L0: {
          var20 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = param1.field_y;
          var3 = param1.field_v;
          var4 = param1.field_B;
          var5 = var2 >> -1061382942;
          var6 = var3 >> -1427048606;
          if (param0 == 107) {
            break L0;
          } else {
            var21 = null;
            rn discarded$1 = ew.a((String) null, (byte) 84);
            break L0;
          }
        }
        var7 = new nj(var5, var6);
        var25 = var7.field_B;
        var24 = var25;
        var23 = var24;
        var22 = var23;
        var8 = var22;
        var9 = 0;
        L1: while (true) {
          if (var3 <= var9) {
            return var7;
          } else {
            var10 = var9 * var2;
            var11 = var5 * (var9 >> 565006786);
            var12 = 0;
            L2: while (true) {
              if (var2 <= var12) {
                var9 += 4;
                continue L1;
              } else {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                L3: while (true) {
                  if (var18 >= 4) {
                    L4: {
                      var18 = var17 << 1889053860;
                      if (-256 <= (var18 ^ -1)) {
                        break L4;
                      } else {
                        var18 = 255;
                        break L4;
                      }
                    }
                    if (var17 == 0) {
                      var25 = var24;
                      var25[var11] = 0;
                      var11++;
                      var12 += 4;
                      var10 += 4;
                      continue L2;
                    } else {
                      var8[var11] = oe.c(oe.c(rn.a(var14 / var17, 16711680), oe.c(var18 << 1467327832, rn.a(255, var15 / var17))), rn.a(var16 / var17, 65280));
                      var11++;
                      var12 += 4;
                      var10 += 4;
                      continue L2;
                    }
                  } else {
                    var19 = 0;
                    L5: while (true) {
                      if (var19 <= -5) {
                        var18++;
                        continue L3;
                      } else {
                        var13 = var4[var19 + var2 * var18 + var10];
                        if (-1 != var13) {
                          var17++;
                          var15 = var15 + (var13 & 255);
                          var16 = var16 + (65280 & var13);
                          var14 = var14 + (16711680 & var13);
                          var19++;
                          continue L5;
                        } else {
                          var19++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    abstract jm a(int param0);

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
            Object var2 = null;
            nj discarded$0 = ew.a((byte) 24, (wk) null);
        }
        field_e = null;
        field_d = null;
    }

    final static rn a(String param0, byte param1) {
        int var6 = 0;
        String var7 = null;
        rn var8 = null;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
            return hv.field_N;
        }
        if (!(var2 <= 255)) {
            return el.field_e;
        }
        int var3 = 82 / ((param1 - 50) / 49);
        String[] var4 = dj.a(32, '.', param0);
        if (!(-3 >= (var4.length ^ -1))) {
            return hv.field_N;
        }
        String[] var5 = var4;
        for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            var8 = sb.a(var7, (byte) -107);
            if (!(var8 == null)) {
                return var8;
            }
        }
        return mb.a(var4[-1 + var4.length], -19);
    }

    abstract int b(int param0, int param1);

    abstract byte[] a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Start Game";
        field_a = new int[8192];
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
