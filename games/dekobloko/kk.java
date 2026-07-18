/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk implements gl {
    private int field_f;
    private int field_j;
    private int field_o;
    static int field_k;
    static String field_i;
    static int field_n;
    private int field_d;
    static um field_p;
    private int field_a;
    private int field_r;
    private int field_g;
    private int field_s;
    static int field_e;
    private mm field_h;
    private int field_c;
    private int field_m;
    private int field_b;
    static String field_q;
    static byte[] field_l;

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param2)) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (!(!param1)) {
            var4++;
        }
        return qk.field_e[var4];
    }

    final static void a(int param0, int param1, ki param2) {
        uf var5 = we.field_b;
        var5.f(param0, -4);
        var5.field_n = var5.field_n + 1;
        int var4 = var5.field_n;
        var5.a(true, 1);
        var5.a(true, param2.field_v);
        try {
            var5.a(true, param2.field_p);
            var5.a(param2.field_s, false);
            var5.a(param2.field_r, false);
            var5.a(param2.field_o, false);
            var5.a(param2.field_q, false);
            int discarded$0 = var5.a((byte) -15, var4);
            var5.b(var5.field_n - var4, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "kk.C(" + param0 + ',' + -15016 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -54) {
          field_q = null;
          field_l = null;
          field_i = null;
          field_q = null;
          field_p = null;
          return;
        } else {
          field_l = null;
          field_i = null;
          field_q = null;
          field_p = null;
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dl var11 = null;
        ce stackIn_5_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        ce stackOut_3_0 = null;
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
            L1: {
              if (param3 <= -60) {
                break L1;
              } else {
                kk.a((byte) -80);
                break L1;
              }
            }
            L2: {
              if (!(param4 instanceof dl)) {
                stackOut_4_0 = null;
                stackIn_5_0 = (ce) (Object) stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (ce) param4;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var11 = (dl) (Object) stackIn_5_0;
              if (var11 == null) {
                break L3;
              } else {
                param0 = param0 & var11.field_I;
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              hk.a(param1 + param4.field_u, param2 - -param4.field_D, param4.field_t, param4.field_y, ((kk) this).field_o);
              if (!param0) {
                break L4;
              } else {
                var7 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = param1 + param4.field_u - -((kk) this).field_s;
              var9 = param4.field_D + param2 - -((kk) this).field_j;
              hk.d(var8, var9, ((kk) this).field_m, ((kk) this).field_f, 5592405);
              hk.a(var8, var9, ((kk) this).field_m, ((kk) this).field_f, var7);
              if (var11.field_H) {
                hk.b(var8, var9, ((kk) this).field_m + var8, var9 + ((kk) this).field_f, 1);
                hk.b(var8 - -((kk) this).field_m, var9, var8, ((kk) this).field_f + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            if (((kk) this).field_h != null) {
              var10 = ((kk) this).field_m - -((kk) this).field_s + ((kk) this).field_g;
              int discarded$1 = ((kk) this).field_h.a(param4.field_E, param1 + param4.field_u - -var10, ((kk) this).field_r + param2 + param4.field_D, param4.field_t - (((kk) this).field_g + var10), -(((kk) this).field_g << 1) + param4.field_y, ((kk) this).field_d, ((kk) this).field_b, ((kk) this).field_c, ((kk) this).field_a, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("kk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    kk(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((kk) this).field_c = 1;
        ((kk) this).field_a = 1;
        try {
            ((kk) this).field_j = param6;
            ((kk) this).field_g = param1;
            ((kk) this).field_m = param8;
            ((kk) this).field_b = param4;
            ((kk) this).field_d = param3;
            ((kk) this).field_r = param2;
            ((kk) this).field_o = param9;
            ((kk) this).field_f = param7;
            ((kk) this).field_h = param0;
            ((kk) this).field_s = param5;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Hide chat";
        field_q = "<%0>: ";
        field_p = new um();
    }
}
