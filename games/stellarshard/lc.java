/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lc extends lk {
    static pb field_k;
    static String field_m;
    static String field_o;
    private ae field_n;
    private ae field_l;
    static String field_p;

    final cg a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        cg stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        cg stackIn_10_0 = null;
        cg stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_2_0 = null;
        cg stackOut_9_0 = null;
        cg stackOut_13_0 = null;
        Object stackOut_5_0 = null;
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
            var3 = ((lc) this).field_l.field_m.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackOut_2_0 = qj.field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 > 10) {
                if (!rd.a(true, var4, var3)) {
                  stackOut_9_0 = qj.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (this.a(-1, param1)) {
                    stackOut_13_0 = qj.field_c;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    return lg.field_c;
                  }
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (cg) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("lc.A(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final static boolean a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 53;
            stackOut_0_0 = sk.a(false, 0, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lc.G(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 72 + 41);
        }
        return stackIn_1_0;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
              var3 = ((lc) this).field_n.field_m.toLowerCase();
              var4 = param1.toLowerCase();
              if (0 >= var3.length()) {
                break L1;
              } else {
                if (var4.length() > 0) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L1;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (0 <= var4.indexOf(var6)) {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        L2: {
                          if (var4.indexOf(var7) >= 0) {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            break L2;
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_12_0 = stackOut_10_0;
                            break L2;
                          }
                        }
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
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
            stackOut_15_1 = new StringBuilder().append("lc.C(").append(-1).append(44);
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
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    lc(ae param0, ae param1, ae param2) {
        super(param0);
        try {
            ((lc) this).field_n = param2;
            ((lc) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static li[] e() {
        return new li[]{ua.field_a, de.field_d, il.field_u, g.field_z, g.field_A, ok.field_c, bb.field_m, va.field_b, kf.field_a, ef.field_n, ui.field_C, s.field_f, be.field_c, tf.field_b};
    }

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param1) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L0: {
              if (2048 <= param0) {
                stackOut_18_0 = -fh.field_h[-2048 + param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = fh.field_h[-param0 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (6144 > param0) {
                stackOut_14_0 = -fh.field_h[6144 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = fh.field_h[param0 - 6144];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_k = null;
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L2: {
              if (2048 <= param0) {
                stackOut_8_0 = -fh.field_h[-2048 + param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = fh.field_h[-param0 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (6144 > param0) {
                stackOut_4_0 = -fh.field_h[6144 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = fh.field_h[param0 - 6144];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
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
        String stackOut_8_0 = null;
        String stackOut_12_0 = null;
        String stackOut_16_0 = null;
        String stackOut_26_0 = null;
        String stackOut_31_0 = null;
        String stackOut_29_0 = null;
        String stackOut_22_0 = null;
        String stackOut_19_0 = null;
        String stackOut_4_0 = null;
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
            var3_int = 23 / ((param0 - 20) / 40);
            var4 = ((lc) this).field_l.field_m.toLowerCase();
            var5 = param1.toLowerCase();
            if (var5.length() != 0) {
              var6 = var5;
              if (!rd.a(var6, -121)) {
                if (lg.a(-124, var6)) {
                  stackOut_8_0 = pk.field_f;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  int discarded$8 = 19;
                  if (fl.a(var6)) {
                    stackOut_12_0 = pe.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (this.a(-1, param1)) {
                      stackOut_16_0 = el.field_H;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (0 < var4.length()) {
                        if (!rb.a(var6, -85, var4)) {
                          if (ji.a(var6, 95, var4)) {
                            stackOut_26_0 = ge.field_l;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            if (!mb.a(var6, (byte) 118, var4)) {
                              stackOut_31_0 = wi.field_b;
                              stackIn_32_0 = stackOut_31_0;
                              break L0;
                            } else {
                              stackOut_29_0 = vf.field_D;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          }
                        } else {
                          stackOut_22_0 = vf.field_D;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      } else {
                        stackOut_19_0 = k.field_e;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  }
                }
              } else {
                stackOut_4_0 = wi.field_b;
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
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("lc.D(").append(param0).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_32_0;
    }

    public static void f(int param0) {
        field_k = null;
        field_p = null;
        if (param0 != 3988) {
          lc.f(16);
          field_m = null;
          field_o = null;
          return;
        } else {
          field_m = null;
          field_o = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_o = "This entry doesn't match";
    }
}
