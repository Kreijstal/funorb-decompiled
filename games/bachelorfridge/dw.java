/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw extends kj {
    private int field_h;
    static int field_f;
    static byte[] field_g;

    dw(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((dw) this).field_h = 39;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            return;
        }
        dw.a(30, -41, 76, 123, -15, -79);
    }

    final boolean b(int param0) {
        if (param0 >= 21) {
          ((dw) this).field_h = ((dw) this).field_h - 1;
          if (((dw) this).field_h - 1 != 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        var25 = BachelorFridge.field_y;
        var6 = param2;
        var7 = param1;
        var8 = param3 * param3;
        var9 = param1 * param1;
        var10 = var9 << -2002178271;
        var11 = var8 << 1995104129;
        var12 = param1 << -876583007;
        var13 = (1 + -var12) * var8 + var10;
        var14 = -(var11 * (var12 + -1)) + var9;
        var15 = var8 << 457629442;
        var16 = var9 << -1981960286;
        var17 = var10 * (3 + (var6 << 278404801));
        var18 = ((var7 << 251199585) + -3) * var11;
        var19 = var16 * (1 + var6);
        hba.a(param4, -param3 + param5, tj.field_b[param0], 7, param3 + param5);
        var20 = var15 * (-1 + var7);
        L0: while (true) {
          if (var7 < -1) {
            L1: {
              if (var13 >= 0) {
                break L1;
              } else {
                L2: while (true) {
                  if (-1 <= var13) {
                    break L1;
                  } else {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var19 = var19 + var16;
                    var17 = var17 + var16;
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (0 <= var14) {
                break L3;
              } else {
                var13 = var13 + var17;
                var14 = var14 + var19;
                var19 = var19 + var16;
                var17 = var17 + var16;
                var6++;
                break L3;
              }
            }
            var14 = var14 + -var18;
            var13 = var13 + -var20;
            var7--;
            var18 = var18 - var15;
            var20 = var20 - var15;
            var21 = param0 + -var7;
            var22 = param0 + var7;
            var23 = var6 + param5;
            var24 = param5 + -var6;
            hba.a(param4, var24, tj.field_b[var21], 7, var23);
            hba.a(param4, var24, tj.field_b[var22], param2 ^ 7, var23);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 0) {
            return;
        }
        dw.a(-16, -27, -89, -115, 68, -58);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          ((dw) this).a(-64, false, -127);
          mba.field_d[(-((dw) this).field_h + 39) / 4].e(param2, -16 + param0);
          return;
        } else {
          mba.field_d[(-((dw) this).field_h + 39) / 4].e(param2, -16 + param0);
          return;
        }
    }

    static {
    }
}
