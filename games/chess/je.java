/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class je extends vm {
    static int field_l;
    private qn field_m;
    private qn field_n;

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
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
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        String stackOut_19_0 = null;
        String stackOut_26_0 = null;
        String stackOut_33_0 = null;
        String stackOut_29_0 = null;
        String stackOut_22_0 = null;
        String stackOut_7_0 = null;
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
            if (param1 == -9316) {
              var6 = ((je) this).field_n.field_v.toLowerCase();
              var4 = param0.toLowerCase();
              if (var4.length() != 0) {
                var5 = var4;
                if (!gl.a(0, var5)) {
                  int discarded$18 = -29;
                  if (ah.a(var5)) {
                    stackOut_11_0 = q.field_a;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    if (pd.a(var5, (byte) 90)) {
                      stackOut_15_0 = de.field_b;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (this.b((byte) -108, param0)) {
                        stackOut_19_0 = ek.field_e;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (0 < var6.length()) {
                          int discarded$19 = 0;
                          if (ml.a(var6, var5)) {
                            stackOut_26_0 = ab.field_t;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            if (!ma.a(var6, param1 ^ -9279, var5)) {
                              if (oc.a(var5, -125, var6)) {
                                stackOut_33_0 = ab.field_t;
                                stackIn_34_0 = stackOut_33_0;
                                break L0;
                              } else {
                                return kg.field_T;
                              }
                            } else {
                              stackOut_29_0 = bi.field_e;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          }
                        } else {
                          stackOut_22_0 = ao.field_f;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_7_0 = kg.field_T;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("je.D(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L1;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ')');
        }
        return stackIn_34_0;
    }

    final static hl d() {
        if (!(ic.field_e != null)) {
            ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
        }
        return ic.field_e;
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param0 < -22) {
              L1: {
                var3 = ((je) this).field_m.field_v.toLowerCase();
                var4 = param1.toLowerCase();
                if (var3.length() <= 0) {
                  break L1;
                } else {
                  if (var4.length() <= 0) {
                    break L1;
                  } else {
                    var5 = var3.lastIndexOf("@");
                    if (0 > var5) {
                      break L1;
                    } else {
                      if (var5 < var3.length() - 1) {
                        var6 = var3.substring(0, var5);
                        var7 = var3.substring(var5 - -1);
                        if (var4.indexOf(var6) >= 0) {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        } else {
                          L2: {
                            if (var4.indexOf(var7) >= 0) {
                              stackOut_14_0 = 1;
                              stackIn_15_0 = stackOut_14_0;
                              break L2;
                            } else {
                              stackOut_13_0 = 0;
                              stackIn_15_0 = stackOut_13_0;
                              break L2;
                            }
                          }
                          return stackIn_15_0 != 0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("je.C(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final mk a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        mk stackIn_3_0 = null;
        mk stackIn_7_0 = null;
        mk stackIn_10_0 = null;
        mk stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_2_0 = null;
        mk stackOut_6_0 = null;
        mk stackOut_11_0 = null;
        mk stackOut_9_0 = null;
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
            var3 = ((je) this).field_n.field_v.toLowerCase();
            var5 = -15 % ((-49 - param0) / 62);
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackOut_2_0 = qk.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!g.a(83, var3, var4)) {
                stackOut_6_0 = qk.field_b;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!this.b((byte) -94, param1)) {
                  stackOut_11_0 = oa.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = qk.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("je.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static boolean h() {
        if (il.field_a < 20) {
            return true;
        }
        if (!vd.p(-101)) {
            return true;
        }
        if (gm.field_d <= 0) {
            return false;
        }
        if (tb.a((byte) 61)) {
            return false;
        }
        return true;
    }

    je(qn param0, qn param1, qn param2) {
        super(param0);
        try {
            ((je) this).field_n = param1;
            ((je) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
