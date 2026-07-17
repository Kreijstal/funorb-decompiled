/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ota {
    static cn field_b;
    static String[] field_a;
    static int field_c;

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
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var47 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8_int = 0;
            var9 = param1;
            var10 = 0;
            var11 = -param0 + param2;
            var12 = param1 - param0;
            var13 = param2 * param2;
            var14 = param1 * param1;
            var15 = var11 * var11;
            var16 = var12 * var12;
            var17 = var14 << 1;
            var18 = var13 << 1;
            var19 = var16 << 1;
            var20 = var15 << 1;
            var21 = param1 << 1;
            var22 = var12 << 1;
            var23 = var17 + (-var21 + 1) * var13;
            var24 = -((var21 + -1) * var18) + var14;
            var25 = (-var22 + 1) * var15 - -var19;
            var26 = var16 + -(var20 * (-1 + var22));
            var27 = var13 << 2;
            var28 = var14 << 2;
            var29 = var15 << 2;
            var30 = var16 << 2;
            var31 = var17 * 3;
            var32 = (var21 + -3) * var18;
            var33 = 3 * var19;
            var34 = (-3 + var22) * var20;
            var35 = var28;
            var36 = var27 * (-1 + param1);
            var37 = var30;
            var38 = (-1 + var12) * var29;
            var51 = vaa.field_a[param7];
            var50 = var51;
            var49 = var50;
            var48 = var49;
            var39 = var48;
            nra.a((byte) -55, param3, param4 + -var11, var39, -param2 + param4);
            nra.a((byte) -55, param6, param4 + var11, var39, param4 + -var11);
            nra.a((byte) -55, param3, param2 + param4, var51, param4 + var11);
            L1: while (true) {
              if (var9 <= 0) {
                break L0;
              } else {
                L2: {
                  if (var12 < var9) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var40 = stackIn_6_0;
                  if (0 <= var23) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (0 <= var23) {
                        break L3;
                      } else {
                        var24 = var24 + var35;
                        var23 = var23 + var31;
                        var35 = var35 + var28;
                        var8_int++;
                        var31 = var31 + var28;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var40 != 0) {
                    L6: {
                      if (var25 < 0) {
                        L7: while (true) {
                          if (var25 >= 0) {
                            break L6;
                          } else {
                            var26 = var26 + var37;
                            var25 = var25 + var33;
                            var33 = var33 + var30;
                            var37 = var37 + var30;
                            var10++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      if (var26 < 0) {
                        var26 = var26 + var37;
                        var25 = var25 + var33;
                        var10++;
                        var37 = var37 + var30;
                        var33 = var33 + var30;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var25 = var25 + -var38;
                    var26 = var26 + -var34;
                    var38 = var38 - var29;
                    var34 = var34 - var29;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L9: {
                  if (var24 < 0) {
                    var23 = var23 + var31;
                    var24 = var24 + var35;
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
                var41 = -var9 + param7;
                var42 = var9 + param7;
                var43 = param4 + var8_int;
                var44 = -var8_int + param4;
                if (var40 != 0) {
                  var45 = param4 + var10;
                  var46 = param4 + -var10;
                  nra.a((byte) -55, param3, var46, vaa.field_a[var41], var44);
                  nra.a((byte) -55, param6, var45, vaa.field_a[var41], var46);
                  nra.a((byte) -55, param3, var43, vaa.field_a[var41], var45);
                  nra.a((byte) -55, param3, var46, vaa.field_a[var42], var44);
                  nra.a((byte) -55, param6, var45, vaa.field_a[var42], var46);
                  nra.a((byte) -55, param3, var43, vaa.field_a[var42], var45);
                  continue L1;
                } else {
                  nra.a((byte) -55, param3, var43, vaa.field_a[var41], var44);
                  nra.a((byte) -55, param3, var43, vaa.field_a[var42], var44);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var8, "ota.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + -1923382751 + 44 + param6 + 44 + param7 + 41);
        }
    }

    protected ota() throws Throwable {
        throw new Error();
    }

    final static boolean a(long param0, byte param1, String param2) {
        mu var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4 = wp.a(126, param2);
              if (var4 == null) {
                break L1;
              } else {
                if (null != var4.field_Cb) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (null == uu.field_a) {
                  break L3;
                } else {
                  if (null == vba.a((byte) -40, param0)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("ota.C(").append(param0).append(44).append(13).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            ota.a(1);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
