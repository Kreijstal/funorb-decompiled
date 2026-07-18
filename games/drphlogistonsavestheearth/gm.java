/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gm extends hf {
    static he[] field_L;
    static String field_K;
    static int field_O;
    private qi field_I;
    private int field_N;
    static int field_J;
    static boolean field_M;

    final void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((gm) this).field_N = ((gm) this).field_N + 1;
              super.a(param0, param1, param2, (byte) -128);
              if (param3 < -127) {
                break L1;
              } else {
                gm.h(-80);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gm.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, float param1, String param2, boolean param3) {
        try {
            if (!(af.field_g != null)) {
                af.field_g = new tf(ng.field_c, mf.field_u);
                ng.field_c.a((byte) -111, (vg) (Object) af.field_g);
            }
            af.field_g.a(param2, param3, 6, param1);
            wj.c();
            a.a((byte) -121, true);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "gm.H(" + 32 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (!param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = null;
              String discarded$2 = gm.a((byte) -17, (od) null, 126);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("gm.M(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static String a(byte param0, od param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var3_int = param1.k(7021);
              if (var3_int <= param2) {
                break L0;
              } else {
                var3_int = param2;
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param1.field_j = param1.field_j + pa.field_e.a(var3_int, param1.field_h, 0, param1.field_j, 0, var4);
            var6 = 88 / ((param0 - 18) / 39);
            var5 = p.a(var3_int, (byte) 79, var4, 0);
            stackOut_2_0 = (String) var5;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("gm.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final String e(int param0) {
        if (param0 >= -39) {
            return null;
        }
        if (!((gm) this).field_n) {
            return null;
        }
        return ((gm) this).field_I.b(-16034);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        vh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nh var12 = null;
        nh var13 = null;
        nh var14 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param0 + ((gm) this).field_o - -(((gm) this).field_w >> 1);
              var6 = param3 - (-((gm) this).field_m - (((gm) this).field_k >> 1));
              var8 = ((gm) this).field_I.a(param2 + -12296);
              if (var8 == ai.field_A) {
                break L1;
              } else {
                if (var8 != nd.field_P) {
                  if (u.field_b == var8) {
                    var14 = ja.field_n[2];
                    var14.a(var5 + -(var14.field_y >> 1), -(var14.field_w >> 1) + var6, 256);
                    break L0;
                  } else {
                    if (var8 != ce.field_e) {
                      break L0;
                    } else {
                      var13 = ja.field_n[1];
                      var13.a(var5 - (var13.field_y >> 1), var6 - (var13.field_w >> 1), 256);
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var12 = ja.field_n[0];
                var9 = var12.field_z << 1;
                var10 = var12.field_C << 1;
                if (null == mj.field_v) {
                  break L3;
                } else {
                  if (var9 > mj.field_v.field_y) {
                    break L3;
                  } else {
                    if (mj.field_v.field_w < var10) {
                      break L3;
                    } else {
                      aj.a(mj.field_v, (byte) 91);
                      wj.c();
                      break L2;
                    }
                  }
                }
              }
              mj.field_v = new nh(var9, var10);
              aj.a(mj.field_v, (byte) 125);
              break L2;
            }
            var12.b(112, 144, var12.field_z << 4, var12.field_C << 4, -((gm) this).field_N << 10, 4096);
            cl.d((byte) -80);
            mj.field_v.a(var5 - var12.field_z, -var12.field_C + var6, 256);
            break L0;
          }
          return;
        }
    }

    gm(qi param0) {
        try {
            ((gm) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static nh a(nh param0, int param1, int param2, he param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
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
        nh var25 = null;
        nh var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param3.field_d;
              var7 = param3.field_k;
              var8 = param0.field_y;
              var9 = param0.field_w;
              if (var8 != var6_int) {
                break L1;
              } else {
                if (var7 != var9) {
                  break L1;
                } else {
                  if (var6_int * var7 > param3.field_m.length) {
                    break L1;
                  } else {
                    if (param0.field_B.length >= var8 * var9) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var25 = new nh(var6_int, var7);
            var25.c();
            param0.a(0, 0);
            lb.field_C.a(114);
            param0 = var25;
            break L0;
          }
          var26 = param0;
          var30 = var26.field_B;
          var29 = var30;
          var28 = var29;
          var27 = var28;
          var11 = var27;
          var12 = var6_int * (param2 * var7) / 10000;
          var13 = 1;
          var14 = 1;
          var15 = 0;
          L2: while (true) {
            if (var12 <= 0) {
              var15 = var6_int + 1;
              var16 = -var7 + 2;
              L3: while (true) {
                if (0 <= var16) {
                  var16 = var30.length - 1;
                  L4: while (true) {
                    if (var16 < 0) {
                      return var26;
                    } else {
                      var17 = var30[var16];
                      var18 = var17 >> 16;
                      var19 = var17 >> 8 & 255;
                      var20 = var17 & 255;
                      var11[var16] = (var20 * 63627 >> 16) + (rk.a(63627 * var19, 16711893) >> 8) + rk.a(var18 * 63627, 16711680);
                      var16--;
                      continue L4;
                    }
                  }
                } else {
                  var17 = var11[-1 + var15];
                  var18 = var30[var15];
                  var19 = var11[1 + var15];
                  var20 = -var6_int + 2;
                  L5: while (true) {
                    if (var20 >= 0) {
                      var15 += 2;
                      var16++;
                      continue L3;
                    } else {
                      var21 = var11[-var6_int + var15];
                      var22 = (65280 & var19) + (65280 & var21) + (var17 & 65280) - -(65280 & var18) >> 2;
                      var23 = (var19 & 16711935) + (var18 & 16711935) + ((var17 & 16711935) + (16711935 & var21)) >> 2;
                      var11[-var6_int + var15] = rk.a(var23, 16711935) + rk.a(var22, 65280);
                      var17 = var18;
                      var15++;
                      var18 = var19;
                      var19 = var11[1 + var15];
                      var20++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              var13 = hi.a(var6_int + -2, 4, jf.field_nb) + 1;
              var14 = hi.a(-2 + var7, 4, jf.field_nb) + 1;
              var15 = var13 + var14 * var6_int;
              if (param3.field_m[var15] != 0) {
                var12--;
                var11[var15] = li.a(param4, hi.a(255, 4, jf.field_nb) * param1);
                continue L2;
              } else {
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("gm.O(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param4 + ',' + true + ')');
        }
    }

    public static void h(int param0) {
        field_L = null;
        if (param0 > -67) {
            field_K = null;
        }
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "This game has been updated! Please reload this page.";
        field_O = 0;
        field_J = 0;
    }
}
