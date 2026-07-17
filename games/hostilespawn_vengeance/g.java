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

    public static void j(int param0) {
        if (param0 >= -119) {
            return;
        }
        field_G = null;
        field_M = null;
        field_R = null;
        field_N = null;
        field_O = null;
        field_K = null;
    }

    final static void a(m param0, int param1, int param2) {
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
          fj.a(param1, param0, true);
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
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + -7347 + 41);
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
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_38_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_31_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param3.a(true)) {
              L1: {
                if (0 == param4) {
                  var10 = je.a(param3, 2);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_25_0 = null;
                          stackIn_26_0 = stackOut_25_0;
                          return (java.awt.Frame) (Object) stackIn_26_0;
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
                                if (0 == param1) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_j != param1) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_e <= param4) {
                                    break L3;
                                  } else {
                                    break L5;
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
              var11 = param3.a(false, param5, param1, param0, param4);
              L6: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_c;
                  if (var7 != null) {
                    L7: {
                      if (param2 >= 11) {
                        break L7;
                      } else {
                        field_N = null;
                        break L7;
                      }
                    }
                    if (2 != var11.field_f) {
                      stackOut_38_0 = (java.awt.Frame) var7;
                      stackIn_39_0 = stackOut_38_0;
                      break L0;
                    } else {
                      sd.a(param3, -125, var7);
                      stackOut_36_0 = null;
                      stackIn_37_0 = stackOut_36_0;
                      return (java.awt.Frame) (Object) stackIn_37_0;
                    }
                  } else {
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
                    return (java.awt.Frame) (Object) stackIn_32_0;
                  }
                } else {
                  vj.a(10L, (byte) -49);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var6;
            stackOut_40_1 = new StringBuilder().append("g.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L8;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_39_0;
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
