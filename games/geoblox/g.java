/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class g extends q {
    static int field_j;
    static String field_m;
    private dj field_k;
    static String field_l;
    static dm field_i;
    private dj field_n;

    g(dj param0, dj param1, dj param2) {
        super(param0);
        try {
            ((g) this).field_n = param2;
            ((g) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_18_0 = null;
        String stackOut_25_0 = null;
        String stackOut_29_0 = null;
        String stackOut_33_0 = null;
        String stackOut_21_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_1_0 = null;
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
            var6 = ((g) this).field_k.field_s.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (em.a(var5, param0 + -344)) {
                stackOut_5_0 = ji.field_d;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (ak.a(var5, (byte) -120)) {
                  stackOut_9_0 = ai.field_h;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!ra.a(param0 + 18303, var5)) {
                    L1: {
                      if (param0 == 422) {
                        break L1;
                      } else {
                        g.g(119);
                        break L1;
                      }
                    }
                    if (this.a(param1, -29267)) {
                      stackOut_18_0 = uf.field_i;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      if (0 < var6.length()) {
                        if (ak.a(var5, var6, -98)) {
                          stackOut_25_0 = gf.field_e;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          if (uk.a(8, var6, var5)) {
                            stackOut_29_0 = gg.field_c;
                            stackIn_30_0 = stackOut_29_0;
                            return stackIn_30_0;
                          } else {
                            if (wc.a(var5, var6, (byte) -96)) {
                              stackOut_33_0 = gf.field_e;
                              stackIn_34_0 = stackOut_33_0;
                              break L0;
                            } else {
                              return ji.field_d;
                            }
                          }
                        }
                      } else {
                        stackOut_21_0 = ii.field_j;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                    }
                  } else {
                    stackOut_12_0 = gg.field_a;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("g.A(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_34_0;
    }

    private final boolean a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
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
            L1: {
              var3 = ((g) this).field_n.field_s.toLowerCase();
              var4 = param0.toLowerCase();
              if (0 >= var3.length()) {
                break L1;
              } else {
                if (var4.length() <= 0) {
                  break L1;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L1;
                  } else {
                    if (var3.length() + -1 <= var5) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (-1 < var4.indexOf(var6)) {
                        if (-1 > var4.indexOf(var7)) {
                          break L1;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        }
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        return stackIn_6_0 != 0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("g.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + -29267 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final lh a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        lh stackIn_5_0 = null;
        lh stackIn_8_0 = null;
        lh stackIn_11_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_4_0 = null;
        lh stackOut_12_0 = null;
        lh stackOut_10_0 = null;
        lh stackOut_7_0 = null;
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
              if (param0 == -257) {
                break L1;
              } else {
                ((g) this).field_k = null;
                break L1;
              }
            }
            var3 = ((g) this).field_k.field_s.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackOut_4_0 = si.field_m;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (dd.a(var4, var3, -25321)) {
                if (!this.a(param1, -29267)) {
                  stackOut_12_0 = kk.field_w;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = si.field_m;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = si.field_m;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("g.D(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    public static void g(int param0) {
        if (param0 >= -90) {
            return;
        }
        field_i = null;
        field_m = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Email address is unavailable";
        field_l = "Service unavailable";
        field_j = 0;
    }
}
