/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends q {
    long field_n;
    int field_j;
    static String field_l;
    static String field_m;
    byte[] field_k;

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 != 64) {
            ai.a((byte) -51);
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[] var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var47 = Torquing.field_u;
        try {
          L0: {
            var8_int = 0;
            var9 = param7;
            var10 = 0;
            var11 = param3 - param5;
            var12 = param7 + -param5;
            var13 = param3 * param3;
            var14 = param7 * param7;
            var15 = var11 * var11;
            var16 = var12 * var12;
            var17 = var14 << 1;
            var18 = var13 << 1;
            var19 = var16 << 1;
            var20 = var15 << 1;
            var21 = param7 << 1;
            var22 = var12 << 1;
            var23 = var17 + var13 * (1 + -var21);
            var24 = -((var21 + -1) * var18) + var14;
            var25 = var15 * (1 - var22) - -var19;
            var26 = var16 - var20 * (-1 + var22);
            var27 = var13 << 2;
            var28 = var14 << 2;
            var29 = var15 << 2;
            var30 = var16 << 2;
            var31 = var17 * 3;
            var32 = var18 * (-3 + var21);
            var33 = 3 * var19;
            var34 = var20 * (-3 + var22);
            var35 = var28;
            var36 = (param7 + -1) * var27;
            var37 = var30;
            var38 = (var12 + -1) * var29;
            var51 = qd.field_a[param4];
            var50 = var51;
            var49 = var50;
            var48 = var49;
            var39 = var48;
            di.a(param2 + -param3, (byte) 60, param1, var39, -var11 + param2);
            di.a(param2 - var11, (byte) 110, param0, var51, var11 + param2);
            di.a(var11 + param2, (byte) -10, param1, var51, param3 + param2);
            L1: while (true) {
              if (var9 <= 0) {
                break L0;
              } else {
                L2: {
                  if (var12 < var9) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var40 = stackIn_8_0;
                  if (var40 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (var25 < 0) {
                        L5: while (true) {
                          if (0 <= var25) {
                            break L4;
                          } else {
                            var26 = var26 + var37;
                            var25 = var25 + var33;
                            var33 = var33 + var30;
                            var37 = var37 + var30;
                            var10++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      if (0 > var26) {
                        var26 = var26 + var37;
                        var25 = var25 + var33;
                        var37 = var37 + var30;
                        var10++;
                        var33 = var33 + var30;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var25 = var25 + -var38;
                    var26 = var26 + -var34;
                    var34 = var34 - var29;
                    var38 = var38 - var29;
                    break L3;
                  }
                }
                L7: {
                  if (var23 >= 0) {
                    break L7;
                  } else {
                    L8: while (true) {
                      if (0 <= var23) {
                        break L7;
                      } else {
                        var24 = var24 + var35;
                        var23 = var23 + var31;
                        var8_int++;
                        var35 = var35 + var28;
                        var31 = var31 + var28;
                        continue L8;
                      }
                    }
                  }
                }
                L9: {
                  if (0 > var24) {
                    var24 = var24 + var35;
                    var23 = var23 + var31;
                    var31 = var31 + var28;
                    var35 = var35 + var28;
                    var8_int++;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var24 = var24 + -var32;
                var23 = var23 + -var36;
                var9--;
                var32 = var32 - var27;
                var36 = var36 - var27;
                var41 = -var9 + param4;
                var42 = param4 + var9;
                var43 = param2 - -var8_int;
                var44 = -var8_int + param2;
                if (var40 == 0) {
                  di.a(var44, (byte) 87, param1, qd.field_a[var41], var43);
                  di.a(var44, (byte) -124, param1, qd.field_a[var42], var43);
                  continue L1;
                } else {
                  var45 = param2 - -var10;
                  var46 = param2 + -var10;
                  di.a(var44, (byte) 88, param1, qd.field_a[var41], var46);
                  di.a(var46, (byte) -117, param0, qd.field_a[var41], var45);
                  di.a(var45, (byte) -106, param1, qd.field_a[var41], var43);
                  di.a(var44, (byte) 41, param1, qd.field_a[var42], var46);
                  di.a(var46, (byte) 19, param0, qd.field_a[var42], var45);
                  di.a(var45, (byte) -125, param1, qd.field_a[var42], var43);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var8, "ai.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + -128 + ',' + param7 + ')');
        }
    }

    ai(long param0, int param1, byte[] param2) {
        try {
            ((ai) this).field_k = param2;
            ((ai) this).field_j = param1;
            ((ai) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ai.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Use this alternative as your account name";
        field_m = "BEST EACH";
    }
}
