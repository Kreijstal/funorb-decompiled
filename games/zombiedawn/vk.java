/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_c;
    static int[] field_d;
    static String[] field_b;
    static int field_a;

    final static ma a(dj param0, int param1, int param2) {
        byte[] var4 = param0.a(param1, (byte) 41);
        byte[] var3 = var4;
        if (var4 == null) {
            return null;
        }
        if (param2 != 0) {
            field_a = -35;
        }
        return new ma(var4);
    }

    public static void a(byte param0) {
        int var1 = 22 / ((-31 - param0) / 57);
        field_d = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static on a(byte param0, byte[] param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        L0: {
          var17 = ZombieDawn.field_J;
          var2 = 1;
          var2++;
          var3 = md.a(var2, param1, 49);
          var4 = 0;
          if (0 != (4096 & var3)) {
            var4 = 1;
            var3 = var3 & -4097;
            break L0;
          } else {
            break L0;
          }
        }
        var2++;
        var5 = md.a(var2, param1, 91);
        var2++;
        var6 = md.a(var2, param1, 75);
        var32 = new int[4];
        var28 = var32;
        var24 = var28;
        var20 = var24;
        var7 = var20;
        var33 = new int[4];
        var29 = var33;
        var25 = var29;
        var21 = var25;
        var8 = var21;
        if (param0 <= -22) {
          var9 = 0;
          L1: while (true) {
            if (4 <= var9) {
              var2++;
              var9 = md.a(var2, param1, 86);
              var2++;
              var10 = md.a(var2, param1, 55);
              var2++;
              var11 = md.a(var2, param1, 107);
              var2++;
              var12 = md.a(var2, param1, 76);
              var30 = new int[var12][var11];
              var14 = 0;
              L2: while (true) {
                if (var14 >= var12) {
                  var2++;
                  var14 = md.a(var2, param1, 79);
                  var31 = new int[4 * var14];
                  var27 = var31;
                  var23 = var27;
                  var19 = var23;
                  var15 = var19;
                  var16 = 0;
                  L3: while (true) {
                    if (4 * var14 <= var16) {
                      return new on(var30, var31, var3, var5, var6, var32, var33, var9, var10, var4 != 0);
                    } else {
                      var2++;
                      var15[var16] = md.a(var2, param1, 76);
                      var16++;
                      continue L3;
                    }
                  }
                } else {
                  var15_int = 0;
                  L4: while (true) {
                    if (var11 <= var15_int) {
                      var14++;
                      continue L2;
                    } else {
                      var2++;
                      var30[var14][var15_int] = md.a(var2, param1, 94);
                      var15_int++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              var2++;
              var7[var9] = md.a(var2, param1, 59);
              var2++;
              var8[var9] = md.a(var2, param1, 119);
              var9++;
              continue L1;
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
