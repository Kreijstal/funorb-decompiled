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

    public static void a(byte param0) {
        if (param0 != 124) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var7 = 0;
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
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var25 = Vertigo2.field_L ? 1 : 0;
          jk.a(2, param5);
          var7 = 0;
          var8 = param5 - param6;
          if (var8 < 0) {
            var8 = 0;
            break L0;
          } else {
            break L0;
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
        if (param4 == -40) {
          var17 = var8 + param1;
          ki.a(param4 + -61, var16, var35, var17, param0);
          ki.a(param4 + -76, var17, var35, param5 + param1, param2);
          L1: while (true) {
            if (var7 >= var9) {
              return;
            } else {
              L2: {
                var14 += 2;
                var13 += 2;
                var10 = var10 + var13;
                var12 = var12 + var14;
                if ((var12 ^ -1) > -1) {
                  break L2;
                } else {
                  if (var11 < 1) {
                    break L2;
                  } else {
                    jo.field_h[var11] = var7;
                    var11--;
                    var12 = var12 - (var11 << 468080673);
                    break L2;
                  }
                }
              }
              L3: {
                var7++;
                if (var10 >= 0) {
                  L4: {
                    var9--;
                    if (var8 > var9) {
                      var29 = vl.field_e[var9 + param3];
                      var30 = vl.field_e[-var9 + param3];
                      var20 = jo.field_h[var9];
                      var21 = var7 + param1;
                      var22 = param1 + -var7;
                      var23 = var20 + param1;
                      var24 = param1 + -var20;
                      ki.a(param4 + -70, var22, var29, var24, param2);
                      ki.a(param4 ^ 83, var24, var29, var23, param0);
                      ki.a(param4 ^ 89, var23, var29, var21, param2);
                      ki.a(-122, var22, var30, var24, param2);
                      ki.a(-114, var24, var30, var23, param0);
                      ki.a(-103, var23, var30, var21, param2);
                      break L4;
                    } else {
                      var27 = vl.field_e[var9 + param3];
                      var28 = vl.field_e[-var9 + param3];
                      var20 = param1 - -var7;
                      var21 = param1 - var7;
                      ki.a(-81, var21, var27, var20, param2);
                      ki.a(-93, var21, var28, var20, param2);
                      break L4;
                    }
                  }
                  var10 = var10 - (var9 << -796740799);
                  break L3;
                } else {
                  break L3;
                }
              }
              var31 = vl.field_e[param3 + var7];
              var32 = vl.field_e[-var7 + param3];
              var20 = param1 - -var9;
              var21 = -var9 + param1;
              if (var8 > var7) {
                L5: {
                  if (var7 <= var11) {
                    stackOut_20_0 = var11;
                    stackIn_21_0 = stackOut_20_0;
                    break L5;
                  } else {
                    stackOut_19_0 = jo.field_h[var7];
                    stackIn_21_0 = stackOut_19_0;
                    break L5;
                  }
                }
                var22 = stackIn_21_0;
                var23 = param1 - -var22;
                var24 = param1 - var22;
                ki.a(-97, var21, var31, var24, param2);
                ki.a(-111, var24, var31, var23, param0);
                ki.a(-107, var23, var31, var20, param2);
                ki.a(param4 + -68, var21, var32, var24, param2);
                ki.a(-124, var24, var32, var23, param0);
                ki.a(-125, var23, var32, var20, param2);
                continue L1;
              } else {
                ki.a(-86, var21, var31, var20, param2);
                ki.a(param4 ^ 75, var21, var32, var20, param2);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int[] param4, int param5, int param6) {
        Object var8 = null;
        oj.field_O[param6] = param4;
        oj.field_M[param6] = param3;
        oj.field_I[param6] = param5;
        oj.field_F[param6] = param0;
        if (param2 < 77) {
          var8 = null;
          cl.a(-33, 95, (byte) -63, -17, (int[]) null, -84, 85);
          oj.field_H[param6] = param1;
          oj.field_Q[param6] = true;
          return;
        } else {
          oj.field_H[param6] = param1;
          oj.field_Q[param6] = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
