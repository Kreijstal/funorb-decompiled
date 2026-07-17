/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static volatile int field_f;
    int field_e;
    int field_g;
    int field_b;
    static bk field_c;
    static int field_d;
    int field_a;

    public static void a() {
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var25 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              jk.a(2, param5);
              var7_int = 0;
              var8 = param5 - param6;
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param5;
            var10 = -param5;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            var14 = -1;
            var35 = vl.field_e[param3];
            var16 = param1 + -var8;
            ki.a(-90, -param5 + param1, var35, var16, param2);
            var17 = var8 + param1;
            ki.a(-101, var16, var35, var17, param0);
            ki.a(-116, var17, var35, param5 + param1, param2);
            L2: while (true) {
              if (var7_int >= var9) {
                break L0;
              } else {
                L3: {
                  var14 += 2;
                  var13 += 2;
                  var10 = var10 + var13;
                  var12 = var12 + var14;
                  if (var12 < 0) {
                    break L3;
                  } else {
                    if (var11 < 1) {
                      break L3;
                    } else {
                      jo.field_h[var11] = var7_int;
                      var11--;
                      var12 = var12 - (var11 << 1);
                      break L3;
                    }
                  }
                }
                L4: {
                  var7_int++;
                  if (var10 >= 0) {
                    L5: {
                      var9--;
                      if (var8 > var9) {
                        var29 = vl.field_e[var9 + param3];
                        var30 = vl.field_e[-var9 + param3];
                        var20 = jo.field_h[var9];
                        var21 = var7_int + param1;
                        var22 = param1 + -var7_int;
                        var23 = var20 + param1;
                        var24 = param1 + -var20;
                        ki.a(-110, var22, var29, var24, param2);
                        ki.a(-117, var24, var29, var23, param0);
                        ki.a(-127, var23, var29, var21, param2);
                        ki.a(-122, var22, var30, var24, param2);
                        ki.a(-114, var24, var30, var23, param0);
                        ki.a(-103, var23, var30, var21, param2);
                        break L5;
                      } else {
                        var27 = vl.field_e[var9 + param3];
                        var28 = vl.field_e[-var9 + param3];
                        var20 = param1 - -var7_int;
                        var21 = param1 - var7_int;
                        ki.a(-81, var21, var27, var20, param2);
                        ki.a(-93, var21, var28, var20, param2);
                        break L5;
                      }
                    }
                    var10 = var10 - (var9 << 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var31 = vl.field_e[param3 + var7_int];
                var32 = vl.field_e[-var7_int + param3];
                var20 = param1 - -var9;
                var21 = -var9 + param1;
                if (var8 > var7_int) {
                  L6: {
                    if (var7_int <= var11) {
                      stackOut_21_0 = var11;
                      stackIn_22_0 = stackOut_21_0;
                      break L6;
                    } else {
                      stackOut_20_0 = jo.field_h[var7_int];
                      stackIn_22_0 = stackOut_20_0;
                      break L6;
                    }
                  }
                  var22 = stackIn_22_0;
                  var23 = param1 - -var22;
                  var24 = param1 - var22;
                  ki.a(-97, var21, var31, var24, param2);
                  ki.a(-111, var24, var31, var23, param0);
                  ki.a(-107, var23, var31, var20, param2);
                  ki.a(-108, var21, var32, var24, param2);
                  ki.a(-124, var24, var32, var23, param0);
                  ki.a(-125, var23, var32, var20, param2);
                  continue L2;
                } else {
                  ki.a(-86, var21, var31, var20, param2);
                  ki.a(-109, var21, var32, var20, param2);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var7, "cl.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + -40 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int[] param4, int param5, int param6) {
        try {
            oj.field_O[param6] = param4;
            oj.field_M[param6] = param3;
            oj.field_I[param6] = param5;
            oj.field_F[param6] = param0;
            if (param2 < 77) {
                Object var8 = null;
                cl.a(-33, 95, (byte) -63, -17, (int[]) null, -84, 85);
            }
            oj.field_H[param6] = param1;
            oj.field_Q[param6] = true;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "cl.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
