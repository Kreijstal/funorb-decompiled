/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hh extends wj {
    static int[] field_r;
    static String field_p;
    private String field_q;
    private boolean field_s;
    static gb[] field_n;
    static gg field_u;
    static String field_t;
    static volatile boolean field_o;

    final static void f(int param0) {
        ub.field_a = lc.field_f;
        lc.field_f = false;
        sl.b(true);
        oa.j(-118);
        oi.c(106);
        if (param0 != 8500) {
          hh.c(true);
          eb.m(param0 + -8377);
          return;
        } else {
          eb.m(param0 + -8377);
          return;
        }
    }

    final na a(String param0, int param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        na stackIn_2_0 = null;
        na stackIn_10_0 = null;
        na stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_9_0 = null;
        na stackOut_14_0 = null;
        na stackOut_13_0 = null;
        na stackOut_1_0 = null;
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
            var4 = (CharSequence) (Object) param0;
            if (q.a(var4, false)) {
              L1: {
                if (param1 == 3917) {
                  break L1;
                } else {
                  hh.f(-23);
                  break L1;
                }
              }
              L2: {
                if (param0.equals((Object) (Object) ((hh) this).field_q)) {
                  break L2;
                } else {
                  L3: {
                    var3 = we.b(param0, -84);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_h) {
                        ((hh) this).field_q = param0;
                        ((hh) this).field_s = var3.field_b;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_9_0 = f.field_g;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
              L4: {
                if (((hh) this).field_s) {
                  stackOut_14_0 = wj.field_i;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ol.field_h;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = ol.field_h;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("hh.B(");
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0;
    }

    hh(rj param0) {
        super(param0);
        ((hh) this).field_s = false;
    }

    final static int a(byte param0, String param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -38 / ((param0 - -45) / 58);
            if (!param2) {
              stackOut_3_0 = fe.field_a.a(param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = sl.field_o.a(param1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("hh.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    public static void e(int param0) {
        field_u = null;
        field_n = null;
        field_p = null;
        field_t = null;
        field_r = null;
    }

    final void f(byte param0) {
        ((hh) this).field_q = null;
        if (param0 > -51) {
            field_p = null;
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        cj var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_8_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
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
            var6 = (CharSequence) (Object) param1;
            var3 = pi.a((byte) 122, var6);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((hh) this).field_q)) {
                  break L1;
                } else {
                  var4 = we.b(param1, -75);
                  if (var4 != null) {
                    if (var4.field_h == null) {
                      ((hh) this).field_s = var4.field_b;
                      ((hh) this).field_q = param1;
                      break L1;
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      return (String) (Object) stackIn_9_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                if (param0 == 1) {
                  break L2;
                } else {
                  var5 = null;
                  int discarded$2 = hh.a((byte) 87, (String) null, false);
                  break L2;
                }
              }
              if (((hh) this).field_s) {
                stackOut_16_0 = ub.field_c;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = me.field_l;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("hh.A(").append(param0).append(44);
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
          throw la.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final static void c(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        vl var12 = null;
        hb var13 = null;
        k var14 = null;
        int[] var15 = null;
        Object var16 = null;
        k var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var13 = MonkeyPuzzle2.field_D;
            var2 = var13.a((byte) 114);
            if (0 == var2) {
              var11 = cj.a((byte) 108);
              var19 = var11;
              var18 = var19;
              var17 = var18;
              var15 = var17;
              var3 = var15;
              var10 = var11;
              var4 = var10;
              var5 = var13;
              var6 = ((gk) (Object) var5).a((byte) 114);
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  var16_ref = (k) (Object) cj.field_a.a((byte) -117);
                  if (var16_ref != null) {
                    var16_ref.field_e = var19[0];
                    var16_ref.field_h = var3;
                    var16_ref.field_j = true;
                    var16_ref.c(-19822);
                    break L0;
                  } else {
                    gk.a(-1);
                    return;
                  }
                } else {
                  var10[var7] = ((gk) (Object) var5).e(-127);
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (var2 == 1) {
                var12 = (vl) (Object) ob.field_s.a((byte) -117);
                if (var12 == null) {
                  gk.a(-1);
                  return;
                } else {
                  var12.c(-19822);
                  return;
                }
              } else {
                if (var2 != 2) {
                  kk.a("A1: " + bh.a((byte) -31), (byte) 101, (Throwable) null);
                  gk.a(-1);
                  return;
                } else {
                  var14 = (k) (Object) cj.field_a.a((byte) -117);
                  if (var14 == null) {
                    gk.a(-1);
                    return;
                  } else {
                    var14.field_h = cj.a((byte) 120);
                    var14.field_e = var14.field_h[0];
                    var14.field_j = true;
                    var14.c(-19822);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "hh.F(" + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Error connecting to server. Please try using a different server.";
        field_r = new int[20];
        field_t = "Achievements";
        field_o = true;
        field_n = new gb[32];
    }
}
