/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc extends fe {
    private int field_S;
    static Random field_P;
    private ip field_N;
    static String field_Q;
    static vh field_U;
    static int field_V;
    static String field_T;
    static String field_R;
    static lr field_O;

    final static void a(boolean param0, String param1, int param2, int param3, long param4, int param5) {
        int var7_int = 0;
        try {
            ej.field_j.b(false, 14);
            ej.field_j.field_v = ej.field_j.field_v + 1;
            int var8 = 0;
            var7_int = ej.field_j.field_v;
            ej.field_j.a(param4, (byte) -79);
            ej.field_j.a(-9946, param1);
            ej.field_j.a(param2, false);
            ej.field_j.a(!param0 ? 0 : 1, false);
            ej.field_j.b(ej.field_j.field_v - var7_int, true);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 14 + ',' + param4 + ',' + -121 + ')');
        }
    }

    final String e(int param0) {
        if (!(!((lc) this).field_s)) {
            return ((lc) this).field_N.a(98);
        }
        if (param0 <= -10) {
            return null;
        }
        return null;
    }

    public static void g(byte param0) {
        field_P = null;
        field_Q = null;
        field_T = null;
        int var1 = -16;
        field_U = null;
        field_O = null;
        field_R = null;
    }

    lc(ip param0) {
        try {
            ((lc) this).field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -87 % ((param1 - -43) / 47);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("lc.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            ((lc) this).field_S = ((lc) this).field_S + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "lc.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        na var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        dd var14 = null;
        dd var15 = null;
        var12 = Pool.field_O;
        super.a(param0, (byte) -122, param2, param3);
        if (param0 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = (((lc) this).field_l >> 1) + (((lc) this).field_C + param2);
              var7 = 1 % ((-42 - param1) / 53);
              var6 = (((lc) this).field_y >> 1) + (param3 + ((lc) this).field_D);
              var9 = ((lc) this).field_N.c(-31873);
              if (ji.field_h == var9) {
                break L1;
              } else {
                if (no.field_k != var9) {
                  if (var9 == gp.field_d) {
                    var15 = bo.field_a[2];
                    var15.c(-(var15.field_z >> 1) + var5, var6 - (var15.field_A >> 1), 256);
                    break L0;
                  } else {
                    if (var9 != kr.field_e) {
                      break L0;
                    } else {
                      var14 = bo.field_a[1];
                      var14.c(-(var14.field_z >> 1) + var5, -(var14.field_A >> 1) + var6, 256);
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
                var13 = bo.field_a[0];
                var10 = var13.field_w << 1;
                var11 = var13.field_y << 1;
                if (null == sm.field_z) {
                  break L3;
                } else {
                  if (sm.field_z.field_z < var10) {
                    break L3;
                  } else {
                    if (sm.field_z.field_A < var11) {
                      break L3;
                    } else {
                      kj.a(104, sm.field_z);
                      qh.d();
                      break L2;
                    }
                  }
                }
              }
              sm.field_z = new dd(var10, var11);
              kj.a(56, sm.field_z);
              break L2;
            }
            var13.b(112, 144, var13.field_w << 4, var13.field_y << 4, -((lc) this).field_S << 10, 4096);
            oc.a(112);
            sm.field_z.c(-var13.field_w + var5, var6 + -var13.field_y, 256);
            break L0;
          }
          return;
        }
    }

    final static int a(int param0, int param1, eh param2, oj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.field_z == null) {
                  break L1;
                } else {
                  if (param3 == null) {
                    break L1;
                  } else {
                    if (param2.field_A == param3.field_l) {
                      var4_int = param3.field_z.length;
                      var5 = param2.field_z[param0].length / var4_int;
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5) {
                          stackOut_20_0 = -1;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          L3: {
                            if (param3.field_w != param2.field_q[param0][var6]) {
                              break L3;
                            } else {
                              if (or.a((byte) 3, param2.field_m[param0][var6])) {
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= var4_int) {
                                    stackOut_17_0 = var6;
                                    stackIn_18_0 = stackOut_17_0;
                                    return stackIn_18_0;
                                  } else {
                                    if (param3.field_z[var7] != param2.field_z[param0][var7 + var6 * var4_int]) {
                                      break L3;
                                    } else {
                                      var7++;
                                      continue L4;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new Random();
        field_V = 20;
        field_Q = "Go Back";
        field_T = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_R = "Unpacking models";
    }
}
