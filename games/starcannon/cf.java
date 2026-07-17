/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cf extends qf {
    private boolean field_l;
    private vb field_o;
    static hl field_q;
    static String field_p;
    private String field_n;
    static String field_j;
    static String field_k;
    static String field_m;
    static boolean field_r;
    static String field_s;

    public static void f() {
        field_p = null;
        field_k = null;
        field_j = null;
        field_s = null;
        field_q = null;
        field_m = null;
    }

    final static ig a(boolean param0, boolean param1) {
        ig var2 = new ig(true);
        var2.field_g = param0 ? true : false;
        return var2;
    }

    cf(fe param0, fe param1) {
        super(param0);
        ((cf) this).field_l = false;
        ((cf) this).field_n = "";
        try {
            ((cf) this).field_o = new vb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final p a(String param0, int param1) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        p stackIn_5_0 = null;
        p stackIn_9_0 = null;
        p stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        p stackOut_4_0 = null;
        p stackOut_8_0 = null;
        p stackOut_13_0 = null;
        p stackOut_12_0 = null;
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
              if (param1 == -26188) {
                break L1;
              } else {
                var4 = null;
                p discarded$4 = ((cf) this).a((String) null, 74);
                break L1;
              }
            }
            if (((cf) this).field_o.a(param0, param1) == sb.field_n) {
              stackOut_4_0 = sb.field_n;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param0.equals((Object) (Object) ((cf) this).field_n)) {
                  break L2;
                } else {
                  int discarded$5 = -51;
                  var3 = ij.a(param0);
                  if (var3.b(false)) {
                    ((cf) this).field_n = param0;
                    ((cf) this).field_l = var3.b((byte) -72);
                    break L2;
                  } else {
                    stackOut_8_0 = cd.field_a;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
              L3: {
                if (((cf) this).field_l) {
                  stackOut_13_0 = bf.field_x;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = sb.field_n;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("cf.B(");
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
          throw sd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    final static void e() {
        jh.field_c[4] = new int[1];
        fg.field_a[4] = new jl(4);
        int discarded$2 = 1;
        ad.a(2, new int[4]);
        fg.field_a[2] = new jl(2);
        if (0 < u.field_d) {
          if (ha.a(100, nb.field_e)) {
            int discarded$3 = 1;
            ad.a(1, new int[7]);
            fg.field_a[1] = new jl(1);
            if (u.field_d > 0) {
              if (7 != lf.field_cb) {
                return;
              } else {
                lf.field_cb = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            if (u.field_d > 0) {
              if (7 != lf.field_cb) {
                return;
              } else {
                lf.field_cb = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (u.field_d > 0) {
            if (7 != lf.field_cb) {
              return;
            } else {
              lf.field_cb = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_1_0 = null;
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
            if (!param1) {
              if (((cf) this).field_o.a(param0, -26188) == sb.field_n) {
                stackOut_5_0 = ((cf) this).field_o.a(param0, false);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (((cf) this).a(param0, -26188) != sb.field_n) {
                  stackOut_10_0 = wi.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = hi.field_e;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
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
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("cf.A(");
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
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Connection restored.";
        field_j = "Quit";
        field_k = "Difficulty - EASY";
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_s = "That name is not available";
    }
}
