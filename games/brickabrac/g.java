/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class g extends k {
    private vb field_p;
    private vb field_k;
    static String field_m;
    static mh field_n;
    static jp[] field_l;
    static String field_q;
    static int[] field_o;

    public static void b(boolean param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_n = null;
        field_m = null;
    }

    final static void e(byte param0) {
        um.field_e = false;
        qo.field_I = jl.field_e.l(255) == 0 ? true : false;
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                g.b(true);
                break L1;
              }
            }
            L2: {
              var3 = ((g) this).field_k.field_A.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if (var4.length() <= 0) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 < var3.length() - 1) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (var4.indexOf(var6) < 0) {
                        if (var4.indexOf(var7) < 0) {
                          break L2;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("g.F(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(pn param0, int param1, byte param2) {
        try {
            qa.field_t.a((nm) (Object) param0, (byte) 3);
            kp.a(param1, (byte) -99, param0);
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "g.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + -116 + 41);
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
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
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_32_0 = null;
        String stackOut_22_0 = null;
        String stackOut_26_0 = null;
        String stackOut_30_0 = null;
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
            var7 = ((g) this).field_p.field_A.toLowerCase();
            var4 = param1.toLowerCase();
            var5 = -62 % ((-16 - param0) / 50);
            if (var4.length() != 0) {
              var6 = var4;
              if (pp.a(var6, true)) {
                stackOut_5_0 = sc.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (ab.a(var6, 0)) {
                  stackOut_9_0 = fk.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (gp.a((byte) 65, var6)) {
                    stackOut_13_0 = eq.field_i;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (this.b(0, param1)) {
                      stackOut_17_0 = ni.field_Tb;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      if (var7.length() <= 0) {
                        stackOut_32_0 = l.field_k;
                        stackIn_33_0 = stackOut_32_0;
                        break L0;
                      } else {
                        if (q.a(var6, 0, var7)) {
                          stackOut_22_0 = fd.field_b;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (ll.a(var6, (byte) 125, var7)) {
                            stackOut_26_0 = ij.field_f;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            if (ep.a(var6, (byte) 73, var7)) {
                              stackOut_30_0 = fd.field_b;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            } else {
                              return sc.field_a;
                            }
                          }
                        }
                      }
                    }
                  }
                }
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
            stackOut_34_1 = new StringBuilder().append("g.C(").append(param0).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
        return stackIn_33_0;
    }

    g(vb param0, vb param1, vb param2) {
        super(param0);
        try {
            ((g) this).field_p = param1;
            ((g) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final qh a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qh stackIn_4_0 = null;
        qh stackIn_8_0 = null;
        qh stackIn_11_0 = null;
        qh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_7_0 = null;
        qh stackOut_12_0 = null;
        qh stackOut_10_0 = null;
        qh stackOut_3_0 = null;
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
              if (param1 == 106) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            var3 = ((g) this).field_p.field_A.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              if (!ab.a((byte) -120, var4, var3)) {
                stackOut_7_0 = lp.field_xb;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (!this.b(0, param0)) {
                  stackOut_12_0 = ae.field_c;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = lp.field_xb;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = lp.field_xb;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("g.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_q = "Members";
        field_o = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19};
    }
}
