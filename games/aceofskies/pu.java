/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu {
    static kp field_b;
    static int field_a;

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (bl.field_c >= 10) {
                if (uk.a((byte) -5)) {
                  if (ob.field_d != 0) {
                    hj.a(param1, -12);
                    break L1;
                  } else {
                    ul.a(param2, false, -7395);
                    ps.a(0, false, param1, 0);
                    break L1;
                  }
                } else {
                  vp.a();
                  qa.a(240, (byte) -4, 320);
                  ps.a(0, false, param1, 0);
                  break L1;
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (AceOfSkies.field_J) {
                    AceOfSkies.field_J = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                oj.a(qn.b(-115), g.field_h, 140, nk.a((byte) 68), var3_int != 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("pu.C(").append(21).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(byte param0, int param1, int param2, byte[] param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var23 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param6 <= 0) {
                break L1;
              } else {
                if (!mg.a(param6, (byte) 32)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param5 <= 0) {
                var7_int = rl.a(4, param1);
                break L2;
              } else {
                if (!mg.a(param5, (byte) 6)) {
                  throw new IllegalArgumentException("");
                } else {
                  var7_int = rl.a(4, param1);
                  break L2;
                }
              }
            }
            L3: {
              var8 = 0;
              if (param5 <= param6) {
                stackOut_13_0 = param5;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = param6;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            var9 = stackIn_14_0;
            var10 = param6 >> 1;
            var11 = param5 >> 1;
            var12 = param3;
            var13 = new byte[var10 * (var11 * var7_int)];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param4, var8, param2, param6, param5, 0, param1, 5121, var12, 0);
              if (var9 > 1) {
                var16 = var7_int * param6;
                var17 = 0;
                L5: while (true) {
                  if (var17 >= var7_int) {
                    var14 = var13;
                    var13 = var12;
                    var12 = var14;
                    param5 = var11;
                    param6 = var10;
                    var8++;
                    var9 = var9 >> 1;
                    var11 = var11 >> 1;
                    var10 = var10 >> 1;
                    continue L4;
                  } else {
                    var18 = var17;
                    var19 = var17;
                    var20 = var16 + var19;
                    var21 = 0;
                    L6: while (true) {
                      if (var21 >= var11) {
                        var17++;
                        continue L5;
                      } else {
                        var22 = 0;
                        L7: while (true) {
                          if (var22 >= var10) {
                            var20 = var20 + var16;
                            var19 = var19 + var16;
                            var21++;
                            continue L6;
                          } else {
                            var15 = param3[var19];
                            var19 = var19 + var7_int;
                            var15 = var15 + param3[var19];
                            var15 = var15 + param3[var20];
                            var19 = var19 + var7_int;
                            var20 = var20 + var7_int;
                            var15 = var15 + param3[var20];
                            var13[var18] = (byte)(var15 >> 2);
                            var20 = var20 + var7_int;
                            var18 = var18 + var7_int;
                            var22++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var7;
            stackOut_28_1 = new StringBuilder().append("pu.B(").append(-55).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kp();
    }
}
