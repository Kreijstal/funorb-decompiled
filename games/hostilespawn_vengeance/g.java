/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class g extends ph {
    int field_Q;
    int field_J;
    int field_I;
    static bd[] field_G;
    static String field_N;
    static String field_O;
    int field_H;
    static String field_R;
    static jf field_M;
    static String field_K;
    int field_L;
    int field_P;

    public static void j() {
        field_G = null;
        field_M = null;
        field_R = null;
        field_N = null;
        field_O = null;
        field_K = null;
    }

    final static void a(m param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          wk.field_g.a((am) (Object) param0, 124);
          int discarded$2 = 1;
          fj.a(6, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("g.B(");
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
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 6 + 44 + -7347 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        dn.field_a = param1;
        int var2 = -94 / ((-70 - param0) / 46);
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -((g) this).field_v + -param1 + (-((g) this).field_P + param0);
              var9 = -((g) this).field_Q - (param2 - (-((g) this).field_m + param3));
              if (((g) this).field_J * ((g) this).field_J > var9 * var9 + var8_int * var8_int) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - he.field_r;
                  if (0.0 > var10) {
                    var10 = var10 - 3.141592653589793 / (double)((g) this).field_I;
                    break L1;
                  } else {
                    if (0.0 >= var10) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((g) this).field_I;
                      break L1;
                    }
                  }
                }
                ((g) this).field_H = (int)((double)((g) this).field_I * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((g) this).field_I > ((g) this).field_H) {
                    L3: while (true) {
                      if (((g) this).field_H >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        ((g) this).field_H = ((g) this).field_H + ((g) this).field_I;
                        continue L3;
                      }
                    }
                  } else {
                    ((g) this).field_H = ((g) this).field_H - ((g) this).field_I;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("g.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param5 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param6 + 41);
        }
        return stackIn_15_0 != 0;
    }

    final static java.awt.Frame a(int param0, int param1, byte param2, fd param3, int param4, int param5) {
        RuntimeException var6 = null;
        ak[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ak[] var10 = null;
        kk var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        java.awt.Frame stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_33_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_28_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param3.a(true)) {
              L1: {
                if (0 == param4) {
                  int discarded$1 = 2;
                  var10 = je.a(param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_22_0 = null;
                          stackIn_23_0 = stackOut_22_0;
                          return (java.awt.Frame) (Object) stackIn_23_0;
                        }
                      } else {
                        L3: {
                          if (param5 != var10[var8].field_d) {
                            var8++;
                            break L3;
                          } else {
                            if (param0 != var10[var8].field_k) {
                              var8++;
                              break L3;
                            } else {
                              L4: {
                                if (var7_int == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_e <= param4) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var10[var8].field_e;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param3.a(false, param5, 0, param0, param4);
              L5: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_c;
                  if (var7 != null) {
                    if (2 != var11.field_f) {
                      stackOut_33_0 = (java.awt.Frame) var7;
                      stackIn_34_0 = stackOut_33_0;
                      break L0;
                    } else {
                      sd.a(param3, -125, var7);
                      stackOut_31_0 = null;
                      stackIn_32_0 = stackOut_31_0;
                      return (java.awt.Frame) (Object) stackIn_32_0;
                    }
                  } else {
                    stackOut_28_0 = null;
                    stackIn_29_0 = stackOut_28_0;
                    return (java.awt.Frame) (Object) stackIn_29_0;
                  }
                } else {
                  vj.a(10L, (byte) -49);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("g.D(").append(param0).append(44).append(0).append(44).append(30).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_34_0;
    }

    private g() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Achieved";
        field_R = "Passwords can only contain letters and numbers";
        field_O = "Find more ammo for the rocket launcher to destroy the turrets blocking the lift. Otherwise, find an alternative way out.";
        field_K = "Doors open when you get close to them.";
        field_M = new jf();
    }
}
