/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ec extends mg {
    static String field_n;
    private boolean field_s;
    static int field_t;
    static String field_m;
    static int field_r;
    static java.awt.Canvas field_u;
    static tf field_q;
    private String field_p;
    static String field_o;

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        id var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
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
            var5 = (CharSequence) (Object) param1;
            var3 = sn.a(var5, 0);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 <= -76) {
                  break L1;
                } else {
                  int discarded$2 = ec.a(true, 49, -104);
                  break L1;
                }
              }
              L2: {
                if (param1.equals((Object) (Object) ((ec) this).field_p)) {
                  break L2;
                } else {
                  var4 = ig.a(200, param1);
                  if (var4 != null) {
                    if (var4.field_c == null) {
                      ((ec) this).field_p = param1;
                      ((ec) this).field_s = var4.field_g;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((ec) this).field_s) {
                stackOut_16_0 = vi.field_L;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = ek.field_e;
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
            stackOut_18_1 = new StringBuilder().append("ec.E(").append(param0).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final void f(int param0) {
        ((ec) this).field_p = null;
        int var2 = -118 / ((param0 - -56) / 56);
    }

    ec(c param0) {
        super(param0);
        ((ec) this).field_s = false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = ce.field_c;
            L1: while (true) {
              if (var3_int >= pl.field_J.length) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    int discarded$2 = ec.a(true, 50, 69);
                    break L2;
                  }
                }
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  var5 = uf.field_e[var3_int];
                  if (var5 >= 0) {
                    var6 = jp.a(pl.field_J[var3_int], 8192, true);
                    var4 = var4 + ki.field_e;
                    var7 = bq.field_d + -(var6 >> 1);
                    if (!mn.a(param1, var4, 59, (lf.field_b << 1) + dk.field_d, -uf.field_a + var7, param2, (uf.field_a << 1) + var6)) {
                      var4 = var4 + ((lf.field_b << 1) - -ki.field_e + dk.field_d);
                      break L3;
                    } else {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  } else {
                    var4 = var4 + da.field_m;
                    break L3;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ec.C(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    final static void a(boolean param0, fm param1) {
        tf var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new tf(param1.a((byte) 24, "", "final_frame.jpg"), (java.awt.Component) (Object) field_u);
            var3 = var2.field_F;
            var4 = var2.field_E;
            ti.a(param0);
            th.field_b = new tf(var3, 3 * var4 / 4);
            th.field_b.c();
            var2.f(0, 0);
            in.field_s = new tf(var3, var4 + -th.field_b.field_E);
            in.field_s.c();
            var2.f(0, -th.field_b.field_E);
            in.field_s.field_y = th.field_b.field_E;
            ia.a((byte) 92);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ec.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_n = null;
        field_u = null;
        field_m = null;
        field_o = null;
    }

    final dj a(String param0, boolean param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        dj stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        dj stackIn_12_0 = null;
        dj stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_11_0 = null;
        dj stackOut_16_0 = null;
        dj stackOut_15_0 = null;
        Object stackOut_4_0 = null;
        dj stackOut_1_0 = null;
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
            var4 = (CharSequence) (Object) param0;
            if (fm.a((byte) 63, var4)) {
              if (param1) {
                L1: {
                  if (!param0.equals((Object) (Object) ((ec) this).field_p)) {
                    L2: {
                      var3 = ig.a(200, param0);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null != var3.field_c) {
                          break L2;
                        } else {
                          ((ec) this).field_p = param0;
                          ((ec) this).field_s = var3.field_g;
                          break L1;
                        }
                      }
                    }
                    stackOut_11_0 = tg.field_j;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (((ec) this).field_s) {
                    stackOut_16_0 = qk.field_g;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = sk.field_a;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (dj) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = sk.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ec.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Checking";
        field_n = "Hide game chat";
        field_o = "Close";
    }
}
