/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sab extends rqa {
    static int field_o;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        var47 = VoidHunters.field_G;
        try {
          L0: {
            var8_int = 0;
            var9 = param1;
            var10 = 0;
            var11 = param2 + -param5;
            var12 = param1 + -param5;
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
            var23 = var17 + var13 * (1 - var21);
            var24 = -((-1 + var21) * var18) + var14;
            var25 = var19 + var15 * (1 - var22);
            var26 = -(var20 * (var22 + -1)) + var16;
            var27 = var13 << 2;
            var28 = var14 << 2;
            var29 = var15 << 2;
            var30 = var16 << 2;
            var31 = 3 * var17;
            var32 = var18 * (var21 + -3);
            var33 = 3 * var19;
            var34 = (var22 + -3) * var20;
            var35 = var28;
            var36 = var27 * (-1 + param1);
            var37 = var30;
            var38 = (var12 - 1) * var29;
            var51 = rba.field_b[param3];
            var50 = var51;
            var49 = var50;
            var48 = var49;
            var39 = var48;
            ww.a(param6, -var11 + param4, var39, (byte) 75, param4 + -param2);
            ww.a(param0, param4 + var11, var51, (byte) 75, param4 - var11);
            ww.a(param6, param4 + param2, var51, (byte) 75, param4 + var11);
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
                  if (var23 < 0) {
                    L4: while (true) {
                      if (var23 >= 0) {
                        break L3;
                      } else {
                        var23 = var23 + var31;
                        var24 = var24 + var35;
                        var35 = var35 + var28;
                        var31 = var31 + var28;
                        var8_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var40 == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (0 > var25) {
                        L7: while (true) {
                          if (0 <= var25) {
                            break L6;
                          } else {
                            var25 = var25 + var33;
                            var26 = var26 + var37;
                            var37 = var37 + var30;
                            var10++;
                            var33 = var33 + var30;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      if (var26 >= 0) {
                        break L8;
                      } else {
                        var26 = var26 + var37;
                        var25 = var25 + var33;
                        var10++;
                        var33 = var33 + var30;
                        var37 = var37 + var30;
                        break L8;
                      }
                    }
                    var25 = var25 + -var38;
                    var26 = var26 + -var34;
                    var38 = var38 - var29;
                    var34 = var34 - var29;
                    break L5;
                  }
                }
                L9: {
                  if (var24 >= 0) {
                    break L9;
                  } else {
                    var23 = var23 + var31;
                    var24 = var24 + var35;
                    var31 = var31 + var28;
                    var35 = var35 + var28;
                    var8_int++;
                    break L9;
                  }
                }
                var23 = var23 + -var36;
                var24 = var24 + -var32;
                var36 = var36 - var27;
                var9--;
                var32 = var32 - var27;
                var41 = -var9 + param3;
                var42 = param3 + var9;
                var43 = param4 - -var8_int;
                var44 = param4 - var8_int;
                if (var40 != 0) {
                  var45 = var10 + param4;
                  var46 = -var10 + param4;
                  ww.a(param6, var46, rba.field_b[var41], (byte) 75, var44);
                  ww.a(param0, var45, rba.field_b[var41], (byte) 75, var46);
                  ww.a(param6, var43, rba.field_b[var41], (byte) 75, var45);
                  ww.a(param6, var46, rba.field_b[var42], (byte) 75, var44);
                  ww.a(param0, var45, rba.field_b[var42], (byte) 75, var46);
                  ww.a(param6, var43, rba.field_b[var42], (byte) 75, var45);
                  continue L1;
                } else {
                  ww.a(param6, var43, rba.field_b[var41], (byte) 75, var44);
                  ww.a(param6, var43, rba.field_b[var42], (byte) 75, var44);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var8, "sab.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + 21601 + ')');
        }
    }

    final static boolean e(byte param0) {
        int var1 = 26 % ((-51 - param0) / 45);
        int discarded$7 = 114;
        if (!(gpb.a("jaclib"))) {
            return false;
        }
        int discarded$8 = 114;
        return gpb.a("hw3d");
    }

    final static boolean[] a(boolean[] param0, int param1, boolean[] param2) {
        RuntimeException var3 = null;
        boolean[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_6_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param2.length != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new boolean[param2.length];
                break L1;
              }
              cua.a(param2, 0, param0, 0, param2.length);
              stackOut_6_0 = (boolean[]) param0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("sab.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(-31567).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_7_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = -92;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(23, 118));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sab.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    sab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
