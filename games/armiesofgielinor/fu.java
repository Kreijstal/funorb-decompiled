/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu {
    static int field_d;
    String field_i;
    private static long[] field_f;
    static String field_b;
    wk field_h;
    String field_c;
    static String field_a;
    static wk field_e;
    static af field_g;

    final static void a(int param0, jd param1, vh param2) {
        try {
            bu.a(0, param1, 2, param2);
            if (param0 != 29712) {
                field_f = (long[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 < 124) {
            field_a = (String) null;
        }
        field_e = null;
    }

    final static void a(String param0, int param1, long param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        vl.field_n.h(param3 ^ 3982, param5);
        vl.field_n.field_q = vl.field_n.field_q + 1;
        if (param3 != 29231) {
            return;
        }
        try {
            var7_int = vl.field_n.field_q;
            vl.field_n.a(param2, param3 ^ 38346879);
            vl.field_n.b(param0, param3 ^ 17460);
            vl.field_n.b(1, param1);
            vl.field_n.b(param3 + -29230, param4 ? 1 : 0);
            vl.field_n.e(-var7_int + vl.field_n.field_q, 5930);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fu.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    fu(int[] param0, int param1, int param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                this.field_h = pl.field_x[param0[0]];
                break L1;
              } else {
                if ((param1 ^ -1) == 0) {
                  if (-1 > (param2 ^ -1)) {
                    this.field_h = lf.field_h[161];
                    break L1;
                  } else {
                    this.field_h = null;
                    break L1;
                  }
                } else {
                  this.field_h = lf.field_h[uc.field_d[param1][2]];
                  break L1;
                }
              }
            }
            L2: {
              if (param0 != null) {
                this.field_c = dn.field_Pb[param0[0]];
                this.field_i = ut.field_cb[param0[0]];
                break L2;
              } else {
                if (-1 == param1) {
                  if ((param2 ^ -1) < -1) {
                    this.field_c = dj.a(6609, hf.field_b, "<MANA>", Integer.toString(param2));
                    this.field_i = hw.field_D;
                    break L2;
                  } else {
                    this.field_c = null;
                    this.field_i = null;
                    break L2;
                  }
                } else {
                  this.field_c = fq.field_f[param1];
                  this.field_i = mn.field_l[param1];
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("fu.<init>(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_f = new long[256];
            field_b = "Stock";
            var2 = 0;
            L0: while (true) {
              if (var2 >= 256) {
                field_a = "Email is valid";
                field_g = null;
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (8 <= var3) {
                    field_f[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((var0 & 1L) != 1L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = -3932672073523589310L ^ var0 >>> 500927041;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
