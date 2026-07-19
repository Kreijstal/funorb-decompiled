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
        int discarded$1 = 0;
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
        int decompiledRegionSelector0 = 0;
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
                stackIn_3_0 = (gl) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (gl) (param1);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (df) ((Object) stackIn_3_0);
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
                l.f(param1.field_w + param2, param1.field_u + param0, param1.field_p, param1.field_n, this.field_q);
                var8 = param1.field_w + (param2 + this.field_g);
                var9 = this.field_l + (param1.field_u + param0);
                l.d(var8, var9, this.field_i, this.field_e, 5592405);
                l.f(var8, var9, this.field_i, this.field_e, var7);
                if (var11.field_C) {
                  l.c(var8, var9, var8 - -this.field_i, var9 - -this.field_e, 1);
                  l.c(this.field_i + var8, var9, var8, var9 - -this.field_e, 1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (this.field_h == null) {
                  break L5;
                } else {
                  var10 = this.field_i - -this.field_g + this.field_a;
                  discarded$1 = this.field_h.a(param1.field_o, param1.field_w + param2 - -var10, this.field_b + (param0 + param1.field_u), param1.field_p + -this.field_a + -var10, param1.field_n + -(this.field_a << -781167679), this.field_p, this.field_f, this.field_c, this.field_d, 0);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("ea.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 != -20512) {
            return false;
        }
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
            throw qk.a((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = Terraphoenix.field_V;
        try {
            field_k.b(0);
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                bb.field_f[var1_int] = 0L;
            }
            if (param0 != 47) {
                field_j = true;
            }
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                jb.field_d[var1_int] = 0L;
            }
            bb.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ea.D(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_n = null;
        if (!param0) {
            field_k = (vc) null;
        }
    }

    ea(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_c = 1;
        this.field_d = 1;
        try {
            this.field_e = param7;
            this.field_l = param6;
            this.field_i = param8;
            this.field_q = param9;
            this.field_h = param0;
            this.field_f = param4;
            this.field_b = param2;
            this.field_a = param1;
            this.field_p = param3;
            this.field_g = param5;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_m = -1;
        field_j = false;
        field_o = 0;
    }
}
