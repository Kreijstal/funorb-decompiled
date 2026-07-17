/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bf extends al {
    private ba field_l;
    private ba field_n;
    static boolean field_k;
    static eh field_p;
    static String[] field_m;
    static int[] field_j;
    static tg field_o;

    public static void d(int param0) {
        field_j = null;
        field_o = null;
        field_p = null;
        field_m = null;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((bf) this).field_n.field_h.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (var4.length() > 0) {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L1;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (var4.indexOf(var6) < 0) {
                        if (var4.indexOf(var7) >= 0) {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        } else {
                          break L1;
                        }
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var5 = -116 / ((param0 - 29) / 40);
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("bf.E(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        String stackOut_27_0 = null;
        String stackOut_32_0 = null;
        String stackOut_30_0 = null;
        String stackOut_23_0 = null;
        String stackOut_20_0 = null;
        String stackOut_13_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            var6 = ((bf) this).field_l.field_h.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              var5 = var4;
              if (!hc.b(var5, param1 ^ -114)) {
                if (!nd.a(var5, param1 + 183)) {
                  if (param1 == -114) {
                    if (!ab.a(var5, (byte) -12)) {
                      if (this.a(param1 ^ 65, param0)) {
                        stackOut_17_0 = bd.field_m;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        if (var6.length() > 0) {
                          if (!pf.a(128, var5, var6)) {
                            if (ee.a(-1, var6, var5)) {
                              stackOut_27_0 = kk.field_t;
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0;
                            } else {
                              if (!ah.a(var5, var6, (byte) 8)) {
                                stackOut_32_0 = ve.field_b;
                                stackIn_33_0 = stackOut_32_0;
                                break L0;
                              } else {
                                stackOut_30_0 = ll.field_J;
                                stackIn_31_0 = stackOut_30_0;
                                return stackIn_31_0;
                              }
                            }
                          } else {
                            stackOut_23_0 = ll.field_J;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        } else {
                          stackOut_20_0 = lk.field_s;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    } else {
                      stackOut_13_0 = mb.field_k;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (String) (Object) stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = ef.field_d;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ve.field_b;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("bf.C(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L1;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param1 + 41);
        }
        return stackIn_33_0;
    }

    bf(ba param0, ba param1, ba param2) {
        super(param0);
        try {
            ((bf) this).field_l = param1;
            ((bf) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "bf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final vf b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_2_0 = null;
        vf stackIn_5_0 = null;
        vf stackIn_8_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vf stackOut_11_0 = null;
        vf stackOut_7_0 = null;
        vf stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == 54) {
              var3 = ((bf) this).field_l.field_h.toLowerCase();
              var4 = param0.toLowerCase();
              if (var4.length() != 0) {
                if (qb.a(param1 + -177, var4, var3)) {
                  if (this.a(77, param0)) {
                    stackOut_11_0 = a.field_e;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    return mc.field_a;
                  }
                } else {
                  stackOut_7_0 = a.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = a.field_e;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("bf.B(");
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
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_p = new eh(13, 0, 1, 0);
        field_j = new int[]{100, 200, 500, 100, 100, 200, 200, 200, 500, 1000};
    }
}
