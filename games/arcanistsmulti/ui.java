/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ui extends rl {
    static String field_u;
    private rn field_t;
    static String field_q;
    private rn field_r;
    static boolean field_v;
    static boolean field_s;
    static String field_w;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_31_0 = null;
        String stackOut_21_0 = null;
        String stackOut_25_0 = null;
        String stackOut_29_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var6 = ((ui) this).field_t.field_g.toLowerCase();
              var4 = param0.toLowerCase();
              if (param1 <= -114) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            if (0 != var4.length()) {
              var5 = var4;
              if (bd.a((byte) -68, var5)) {
                stackOut_7_0 = ji.field_i;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (!ko.a(-128, var5)) {
                  if (!e.b(-12055, var5)) {
                    if (!this.a(52, param0)) {
                      if (var6.length() <= 0) {
                        stackOut_31_0 = hk.field_r;
                        stackIn_32_0 = stackOut_31_0;
                        break L0;
                      } else {
                        int discarded$16 = -1;
                        if (hm.a(var5, var6)) {
                          stackOut_21_0 = rg.field_f;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        } else {
                          if (sm.a(22230, var5, var6)) {
                            stackOut_25_0 = cj.field_e;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          } else {
                            int discarded$17 = 0;
                            if (w.a(var6, var5)) {
                              stackOut_29_0 = rg.field_f;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            } else {
                              return ji.field_i;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_16_0 = wj.field_c;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = ko.field_g;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = cm.field_h;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("ui.A(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L2;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 41);
        }
        return stackIn_32_0;
    }

    final static void a(int param0, boolean param1) {
        mn.a(param1, param0 + -95);
        le.c(param0 ^ 1, param1);
        if (param0 != 0) {
            ui.a(115, false);
        }
    }

    public static void d() {
        field_u = null;
        field_w = null;
        field_q = null;
    }

    ui(rn param0, rn param1, rn param2) {
        super(param0);
        try {
            ((ui) this).field_t = param1;
            ((ui) this).field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final eh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        eh stackIn_2_0 = null;
        eh stackIn_5_0 = null;
        eh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        eh stackOut_8_0 = null;
        eh stackOut_4_0 = null;
        eh stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var3_int = -18 / ((-50 - param1) / 36);
            var4 = ((ui) this).field_t.field_g.toLowerCase();
            var5 = param0.toLowerCase();
            if (var5.length() != 0) {
              if (dd.a(99, var5, var4)) {
                if (this.a(49, param0)) {
                  stackOut_8_0 = ra.field_k;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return nn.field_s;
                }
              } else {
                stackOut_4_0 = ra.field_k;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ra.field_k;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ui.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
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
        int stackOut_9_0 = 0;
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
              var4 = -117 % ((5 - param0) / 36);
              var3 = ((ui) this).field_r.field_g.toLowerCase();
              var5 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if (var5.length() > 0) {
                  var6 = var3.lastIndexOf("@");
                  if (var6 < 0) {
                    break L1;
                  } else {
                    if (var6 >= -1 + var3.length()) {
                      break L1;
                    } else {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 - -1);
                      if (-1 < var5.indexOf(var7)) {
                        L2: {
                          if (-1 <= var5.indexOf(var8)) {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            break L2;
                          } else {
                            stackOut_9_0 = 0;
                            stackIn_11_0 = stackOut_9_0;
                            break L2;
                          }
                        }
                        return stackIn_11_0 != 0;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ui.D(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param1.length();
            var6 = param0.length();
            if (var5 == 0) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (0 != var8) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param3.indexOf(param1, var9_int);
                    if (var9_int >= 0) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param3.indexOf(param1, var10);
                if (0 > var11) {
                  StringBuilder discarded$3 = var9.append(param3.substring(var10));
                  stackOut_13_0 = var9.toString();
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  StringBuilder discarded$4 = var9.append(param3.substring(var10, var11));
                  var10 = var5 + var11;
                  StringBuilder discarded$5 = var9.append(param0);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ui.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(-38).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Rating";
        field_s = true;
        field_u = "Only two targets left! Destroy the target at the base of the cliff to the left first.";
        field_w = "<%0> has withdrawn the request to join.";
    }
}
