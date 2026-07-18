/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.awt.Frame;

final class ga extends ip {
    static cn[] field_o;
    static int field_p;
    private be field_q;
    private String field_m;
    static int field_n;
    static cn field_r;
    private boolean field_s;

    public static void d() {
        field_r = null;
        field_o = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((ga) this).field_q.a(param1, 65) == pd.field_J) {
              stackOut_2_0 = ((ga) this).field_q.a((byte) 96, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((ga) this).a(param1, 60) != pd.field_J) {
                L1: {
                  if (param0 >= 44) {
                    break L1;
                  } else {
                    var4 = null;
                    String discarded$2 = ((ga) this).a((byte) 49, (String) null);
                    break L1;
                  }
                }
                stackOut_9_0 = sh.field_b;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_5_0 = pj.field_n;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ga.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        me var4 = null;
        od stackIn_2_0 = null;
        od stackIn_7_0 = null;
        od stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_6_0 = null;
        od stackOut_11_0 = null;
        od stackOut_10_0 = null;
        od stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3_int = -10 / ((5 - param1) / 44);
            if (((ga) this).field_q.a(param0, 104) != pd.field_J) {
              L1: {
                if (!param0.equals((Object) (Object) ((ga) this).field_m)) {
                  var4 = gk.a(-115, param0);
                  if (var4.b(36)) {
                    ((ga) this).field_m = param0;
                    ((ga) this).field_s = var4.a((byte) 109);
                    break L1;
                  } else {
                    stackOut_6_0 = oc.field_A;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (((ga) this).field_s) {
                  stackOut_11_0 = c.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = pd.field_J;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = pd.field_J;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ga.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final static java.awt.Frame a(qg param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        ki[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki[] var10 = null;
        pn var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0.a(50)) {
              L1: {
                if (param2 == 0) {
                  var10 = kc.a(param0, 10);
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
                          if (param1 != var10[var8].field_g) {
                            var8++;
                            break L3;
                          } else {
                            if (var10[var8].field_d != param5) {
                              var8++;
                              break L3;
                            } else {
                              L4: {
                                if (param3 == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_a != param3) {
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
                                  if (var10[var8].field_b > param2) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param2 = var10[var8].field_b;
                              var7_int = 1;
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
              var11 = param0.a((byte) -102, param3, param1, param2, param5);
              L6: while (true) {
                if (var11.field_c != 0) {
                  var7 = (java.awt.Frame) var11.field_f;
                  if (var7 != null) {
                    if (2 != var11.field_c) {
                      stackOut_36_0 = (java.awt.Frame) var7;
                      stackIn_37_0 = stackOut_36_0;
                      break L0;
                    } else {
                      ng.a(param0, 48, var7);
                      stackOut_34_0 = null;
                      stackIn_35_0 = stackOut_34_0;
                      return (java.awt.Frame) (Object) stackIn_35_0;
                    }
                  } else {
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
                    return (java.awt.Frame) (Object) stackIn_32_0;
                  }
                } else {
                  pj.a(0, 10L);
                  continue L6;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var6;
            stackOut_38_1 = new StringBuilder().append("ga.B(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L7;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 122 + ',' + param5 + ')');
        }
        return stackIn_37_0;
    }

    ga(rm param0, rm param1) {
        super(param0);
        ((ga) this).field_m = "";
        ((ga) this).field_s = false;
        try {
            ((ga) this).field_q = new be(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 250;
        field_n = 1;
    }
}
