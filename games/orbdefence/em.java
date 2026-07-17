/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class em extends hi {
    static int[] field_s;
    private vi field_p;
    static int field_r;
    private vi field_n;
    static int field_o;
    static int field_q;

    final static void c() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var1_int = ul.field_f;
        int var2 = ul.field_l;
        for (var3 = -1 + var2 * var1_int; var3 >= 0; var3--) {
            var4 = ul.field_b[var3];
            var5 = 0;
            if ((var4 & 8388608) == 8388608) {
                var5 = var5 | var4 & 8323072;
            }
            if ((var4 & 32768) == 32768) {
                var5 = var5 | var4 & 32512;
            }
            if ((var4 & 128) == 128) {
                var5 = var5 | 127 & var4;
            }
            cg.field_d.field_v[var3] = var5 << 1;
        }
        li.field_a.d();
        try {
            int discarded$0 = 3;
            int discarded$1 = 0;
            int discarded$2 = 3;
            hm.a(cg.field_d.field_v);
            cb.field_a.a(-40);
            li.field_a.e(0, 0, 640, 480, ef.field_k);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "em.V(" + 67 + 41);
        }
    }

    final static void b() {
        if (!n.b((byte) 118)) {
          if (!pc.field_cb) {
            L0: {
              if (null == oh.field_c) {
                oh.field_c = lg.a(4, false);
                break L0;
              } else {
                break L0;
              }
            }
            if (!oh.field_c.field_g) {
              return;
            } else {
              lb.field_g = lb.field_g | oh.field_c.field_i;
              dm.field_f = dm.field_f & ~oh.field_c.field_i;
              pc.field_cb = true;
              oh.field_c = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final qd a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_2_0 = null;
        qd stackIn_6_0 = null;
        qd stackIn_10_0 = null;
        qd stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd stackOut_5_0 = null;
        qd stackOut_9_0 = null;
        qd stackOut_13_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 == -99) {
              var3 = ((em) this).field_n.field_l.toLowerCase();
              var4 = param0.toLowerCase();
              if (var4.length() == 0) {
                stackOut_5_0 = vh.field_h;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                int discarded$11 = -1;
                if (!kk.a(var3, var4)) {
                  stackOut_9_0 = vh.field_h;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (this.b(param0, (byte) -36)) {
                    stackOut_13_0 = vh.field_h;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    return nc.field_bb;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("em.C(");
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
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    public static void d() {
        field_s = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (hi.field_k == 11) {
                int discarded$0 = 32;
                md.c();
            }
            ih.a(tl.field_e, 0, q.field_b, mf.field_d);
            kg.a(0, (byte) -83, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "em.U(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    em(vi param0, vi param1, vi param2) {
        super(param0);
        try {
            ((em) this).field_n = param1;
            ((em) this).field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "em.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final boolean b(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
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
              var9 = ((em) this).field_p.field_l.toLowerCase();
              var4 = param0.toLowerCase();
              var5 = -2 % ((param1 - 37) / 51);
              if (-1 <= var9.length()) {
                break L1;
              } else {
                if (-1 < var4.length()) {
                  var6 = var9.lastIndexOf("@");
                  if (var6 < 0) {
                    break L1;
                  } else {
                    if (-1 + var9.length() <= var6) {
                      break L1;
                    } else {
                      var7 = var9.substring(0, var6);
                      var8 = var9.substring(var6 + 1);
                      if (var4.indexOf(var7) >= 0) {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0 != 0;
                      } else {
                        L2: {
                          if (var4.indexOf(var8) >= 0) {
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
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("em.D(");
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
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
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
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        String stackOut_33_0 = null;
        String stackOut_26_0 = null;
        String stackOut_31_0 = null;
        String stackOut_29_0 = null;
        String stackOut_22_0 = null;
        String stackOut_10_0 = null;
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
            var6 = ((em) this).field_n.field_l.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (param0 == -11300) {
                  break L1;
                } else {
                  ((em) this).field_p = null;
                  break L1;
                }
              }
              var5 = var4;
              int discarded$8 = 51;
              if (mm.a(var5)) {
                stackOut_7_0 = sg.field_F;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (!md.a(-20767, var5)) {
                  if (me.a(var5, (byte) -27)) {
                    stackOut_14_0 = jc.field_n;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (this.b(param1, (byte) -99)) {
                      stackOut_18_0 = pl.field_f;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      if (0 >= var6.length()) {
                        stackOut_33_0 = vc.field_b;
                        stackIn_34_0 = stackOut_33_0;
                        break L0;
                      } else {
                        if (!df.a(var5, (byte) 126, var6)) {
                          if (vh.a(false, var6, var5)) {
                            stackOut_26_0 = am.field_f;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            if (!l.a(122, var5, var6)) {
                              stackOut_31_0 = sg.field_F;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            } else {
                              stackOut_29_0 = mf.field_a;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          }
                        } else {
                          stackOut_22_0 = mf.field_a;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = ec.field_H;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
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
            stackOut_35_1 = new StringBuilder().append("em.B(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
        return stackIn_34_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_r = 0;
        field_s = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            field_s[var0] = 256 * (var0 / 3) + (var0 / 2 + var0 * 65536);
        }
    }
}
