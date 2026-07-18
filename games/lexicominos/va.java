/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class va extends tj {
    private rl field_n;
    static db field_m;
    private rl field_o;
    static String field_l;

    va(rl param0, rl param1, rl param2) {
        super(param0);
        try {
            ((va) this).field_n = param2;
            ((va) this).field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(char param0, boolean param1) {
        if (!param1) {
            return 107;
        }
        return param0 <= 0 ? -1 : param0;
    }

    public static void d() {
        field_m = null;
        field_l = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        String var7 = null;
        Object stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        String stackOut_28_0 = null;
        String stackOut_33_0 = null;
        String stackOut_31_0 = null;
        String stackOut_24_0 = null;
        String stackOut_21_0 = null;
        String stackOut_18_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              var7 = ((va) this).field_o.field_u.toLowerCase();
              if (param0 == -126) {
                break L1;
              } else {
                var6 = null;
                String discarded$22 = ((va) this).a((byte) -44, (String) null);
                break L1;
              }
            }
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (ph.a((byte) 107, var5)) {
                stackOut_7_0 = pe.field_a;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (sh.d(var5, (byte) 50)) {
                  stackOut_11_0 = rg.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  int discarded$23 = 17;
                  if (hd.a(var5)) {
                    stackOut_15_0 = td.field_b;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    int discarded$24 = 1;
                    if (!this.a(param1)) {
                      if (var7.length() > 0) {
                        if (!bi.a((byte) -124, var7, var5)) {
                          int discarded$25 = 95;
                          if (pd.a(var7, var5)) {
                            stackOut_28_0 = vf.field_s;
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0;
                          } else {
                            if (!ni.a((byte) 120, var5, var7)) {
                              stackOut_33_0 = pe.field_a;
                              stackIn_34_0 = stackOut_33_0;
                              break L0;
                            } else {
                              stackOut_31_0 = uf.field_l;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            }
                          }
                        } else {
                          stackOut_24_0 = uf.field_l;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      } else {
                        stackOut_21_0 = qb.field_a;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                    } else {
                      stackOut_18_0 = rb.field_e;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  }
                }
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("va.F(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L2;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_34_0;
    }

    private final boolean a(String param0) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((va) this).field_n.field_u.toLowerCase();
              var4 = param0.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (var4.length() > 0) {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L1;
                  } else {
                    if (-1 + var3.length() > var5) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (var4.indexOf(var6) >= 0) {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        L2: {
                          if (var4.indexOf(var7) >= 0) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            break L2;
                          } else {
                            stackOut_11_0 = 0;
                            stackIn_13_0 = stackOut_11_0;
                            break L2;
                          }
                        }
                        return stackIn_13_0 != 0;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("va.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + true + ')');
        }
        return stackIn_15_0 != 0;
    }

    final sc a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        sc stackIn_3_0 = null;
        sc stackIn_7_0 = null;
        sc stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_2_0 = null;
        sc stackOut_6_0 = null;
        sc stackOut_10_0 = null;
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
            var3 = ((va) this).field_o.field_u.toLowerCase();
            var4 = param1.toLowerCase();
            if (param0 == var4.length()) {
              stackOut_2_0 = ni.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              int discarded$13 = -118;
              if (!ui.a(var3, var4)) {
                stackOut_6_0 = ni.field_b;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                int discarded$14 = 1;
                if (this.a(param1)) {
                  stackOut_10_0 = ni.field_b;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return rh.field_p;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("va.H(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "OK";
    }
}
