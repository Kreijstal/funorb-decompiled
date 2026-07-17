/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea implements cj {
    private int field_a;
    private int field_e;
    private int field_l;
    static boolean field_j;
    private pk field_h;
    private int field_b;
    private int field_p;
    private int field_i;
    private int field_c;
    static int field_m;
    private int field_d;
    private int field_g;
    private int field_f;
    static int field_o;
    static vc field_k;
    private int field_q;
    static String field_n;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        df var11 = null;
        gl stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        gl stackOut_1_0 = null;
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
              if (!(param1 instanceof df)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (gl) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (gl) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (df) (Object) stackIn_3_0;
              if (var11 != null) {
                param4 = param4 & var11.field_A;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = 5592405;
            if (param3 == -24381) {
              L3: {
                if (!param4) {
                  break L3;
                } else {
                  var7 = 16777215;
                  break L3;
                }
              }
              L4: {
                l.f(param1.field_w + param2, param1.field_u + param0, param1.field_p, param1.field_n, ((ea) this).field_q);
                var8 = param1.field_w + (param2 + ((ea) this).field_g);
                var9 = ((ea) this).field_l + (param1.field_u + param0);
                l.d(var8, var9, ((ea) this).field_i, ((ea) this).field_e, 5592405);
                l.f(var8, var9, ((ea) this).field_i, ((ea) this).field_e, var7);
                if (var11.field_C) {
                  l.c(var8, var9, var8 - -((ea) this).field_i, var9 - -((ea) this).field_e, 1);
                  l.c(((ea) this).field_i + var8, var9, var8, var9 - -((ea) this).field_e, 1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (((ea) this).field_h == null) {
                  break L5;
                } else {
                  var10 = ((ea) this).field_i - -((ea) this).field_g + ((ea) this).field_a;
                  int discarded$1 = ((ea) this).field_h.a(param1.field_o, param1.field_w + param2 - -var10, ((ea) this).field_b + (param0 + param1.field_u), param1.field_p + -((ea) this).field_a + -var10, param1.field_n + -(((ea) this).field_a << 1), ((ea) this).field_p, ((ea) this).field_f, ((ea) this).field_c, ((ea) this).field_d, 0);
                  break L5;
                }
              }
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
            stackOut_16_1 = new StringBuilder().append("ea.E(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean a(int param0) {
        if (ab.field_b == null) {
            return false;
        }
        if (!ab.field_b.c(7468)) {
            return false;
        }
        return true;
    }

    final static void a(java.math.BigInteger param0, dh param1, int param2, java.math.BigInteger param3, dh param4) {
        try {
            ia.a(param2, param4, (byte) -75, param3, param0, param1.field_k, param1.field_i);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ea.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = Terraphoenix.field_V;
        try {
            field_k.b(0);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                bb.field_f[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                jb.field_d[var1_int] = 0L;
            }
            bb.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ea.D(" + 47 + 41);
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_n = null;
    }

    ea(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ea) this).field_c = 1;
        ((ea) this).field_d = 1;
        try {
            ((ea) this).field_e = param7;
            ((ea) this).field_l = param6;
            ((ea) this).field_i = param8;
            ((ea) this).field_q = param9;
            ((ea) this).field_h = param0;
            ((ea) this).field_f = param4;
            ((ea) this).field_b = param2;
            ((ea) this).field_a = param1;
            ((ea) this).field_p = param3;
            ((ea) this).field_g = param5;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ea.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_j = false;
        field_o = 0;
    }
}
