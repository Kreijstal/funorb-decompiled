/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tb extends ph {
    private df field_O;
    int field_G;
    static int field_N;
    static vi field_M;
    static int[] field_K;
    int field_H;
    static bd field_I;
    static bd field_L;
    private int field_J;
    static int field_P;

    final int a(byte param0) {
        if (param0 != 65) {
            return 117;
        }
        return ((tb) this).field_O.b(-25);
    }

    final int j(int param0) {
        if (param0 != 11884) {
            field_I = null;
            return ((tb) this).field_J;
        }
        return ((tb) this).field_J;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_28_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_9_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = mf.a(false, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (rg.a((byte) -109, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (param0.length() <= var6) {
                                    if (var5 > 0) {
                                      stackOut_33_0 = ui.field_g;
                                      stackIn_34_0 = stackOut_33_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param0.charAt(var6);
                                      if (!rg.a((byte) -109, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var5 < 2) {
                                        break L6;
                                      } else {
                                        if (param2) {
                                          break L6;
                                        } else {
                                          stackOut_28_0 = mm.field_k;
                                          stackIn_29_0 = stackOut_28_0;
                                          return stackIn_29_0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_19_0 = ui.field_g;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_14_0 = hm.field_n;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_9_0 = hm.field_n;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              stackOut_4_0 = hm.field_n;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("tb.B(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + -24224 + 44 + param2 + 41);
        }
        return stackIn_34_0;
    }

    private tb() throws Throwable {
        throw new Error();
    }

    final static void f(byte param0) {
        if (null != wa.field_q) {
          v.a(8, (java.awt.Canvas) (Object) wa.field_q);
          wa.field_q.a(true, gf.field_b);
          if (param0 >= -84) {
            L0: {
              tb.e((byte) -36);
              wa.field_q = null;
              if (ie.field_c != null) {
                ie.field_c.c(73);
                break L0;
              } else {
                break L0;
              }
            }
            se.field_h.requestFocus();
            return;
          } else {
            L1: {
              wa.field_q = null;
              if (ie.field_c != null) {
                ie.field_c.c(73);
                break L1;
              } else {
                break L1;
              }
            }
            se.field_h.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_K = null;
        field_I = null;
        field_L = null;
        field_M = null;
        if (param0 <= 47) {
            field_L = null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((tb) this).field_G + (-param1 + param0);
                var9 = ((tb) this).field_s + -(((tb) this).field_G * 2);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 <= var8_int) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * ((tb) this).field_J / var9;
                if (param6 != 1) {
                  if (param6 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((tb) this).field_O.b(-25) <= var12) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((tb) this).field_O.a(var11, (byte) 35);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = ((tb) this).field_O.a(var12, -2262) - var8_int;
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
                            var12++;
                            break L5;
                          } else {
                            var12++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ((tb) this).field_O.b(true, var8_int);
                  break L3;
                }
              }
              stackOut_22_0 = 1;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("tb.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param5 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param6 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final int a(int param0, int param1) {
        if (0 <= param0) {
          if (((tb) this).field_O.b(param1 + 24559) > param0) {
            if (param1 != -24584) {
              field_L = null;
              return ((tb) this).field_O.a(param0, param1 ^ 26834);
            } else {
              return ((tb) this).field_O.a(param0, param1 ^ 26834);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_K = new int[8192];
    }
}
