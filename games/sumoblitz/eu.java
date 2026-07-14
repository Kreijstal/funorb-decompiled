/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eu {
    static ri[] field_a;

    final static int a(byte param0) {
        if (param0 != -97) {
            return -56;
        }
        return lq.field_d;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var28 = Sumoblitz.field_L ? 1 : 0;
          if (-1 <= (param2 ^ -1)) {
            break L0;
          } else {
            if (rm.a(param2, -113)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if ((param1 ^ -1) >= -1) {
            break L1;
          } else {
            if (!rm.a(param1, -108)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        if (32993 != param7) {
          throw new IllegalArgumentException("");
        } else {
          var8 = 0;
          if (param0 <= -64) {
            L2: {
              if (param2 < param1) {
                stackOut_14_0 = param2;
                stackIn_15_0 = stackOut_14_0;
                break L2;
              } else {
                stackOut_13_0 = param1;
                stackIn_15_0 = stackOut_13_0;
                break L2;
              }
            }
            var9 = stackIn_15_0;
            var10 = param2 >> 1851954721;
            var11 = param1 >> -1830949375;
            var12 = param4;
            var13 = new int[var11 * var10];
            L3: while (true) {
              jaggl.OpenGL.glTexImage2Di(param3, var8, param5, param2, param1, 0, param7, param6, var12, 0);
              if (-2 > (var9 ^ -1)) {
                var15 = 0;
                var24 = 0;
                var25 = param2 + var24;
                var14 = var13;
                var26 = 0;
                L4: while (true) {
                  if (var26 >= var11) {
                    var13 = var12;
                    param2 = var10;
                    param1 = var11;
                    var12 = var14;
                    var8++;
                    var10 = var10 >> 1;
                    var11 = var11 >> 1;
                    var9 = var9 >> 1;
                    continue L3;
                  } else {
                    var27 = 0;
                    L5: while (true) {
                      if (var10 <= var27) {
                        var24 = var24 + param2;
                        var25 = var25 + param2;
                        var26++;
                        continue L4;
                      } else {
                        var24++;
                        var16 = var12[var24];
                        var24++;
                        var17 = var12[var24];
                        var25++;
                        var18 = var12[var25];
                        var21 = var16 >> -126182264 & 255;
                        var25++;
                        var19 = var12[var25];
                        var23 = var16 >> 554048280 & 255;
                        var22 = 255 & var16;
                        var20 = var16 >> -2422160 & 255;
                        var20 = var20 + ((var17 & 16749302) >> 1054046608);
                        var23 = var23 + (var17 >> 459251192 & 255);
                        var21 = var21 + ((65490 & var17) >> -439656760);
                        var22 = var22 + (255 & var17);
                        var23 = var23 + (255 & var18 >> 450257976);
                        var21 = var21 + ((65476 & var18) >> -1830625976);
                        var22 = var22 + (var18 & 255);
                        var20 = var20 + (255 & var18 >> 1634697712);
                        var21 = var21 + (var19 >> 849413544 & 255);
                        var23 = var23 + (var19 >> 1547674040 & 255);
                        var22 = var22 + (255 & var19);
                        var20 = var20 + (255 & var19 >> 1143996176);
                        var15++;
                        var13[var15] = ic.a(ic.a(eb.a(var21, 1020) << -1997852826, ic.a(eb.a(16711680, var20 << 1695055086), eb.a(1020, var23) << 847796630)), eb.a(var22 >> -1414477758, 255));
                        var27++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
    }
}
