/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb implements uk {
    private int field_r;
    private int field_j;
    private int field_p;
    static String[] field_k;
    private int field_o;
    private int field_e;
    private int field_a;
    static int field_d;
    static String field_h;
    private int field_q;
    private int field_b;
    private bd field_g;
    static li field_m;
    private int field_n;
    private int field_i;
    static String field_l;
    static String field_f;
    private int field_c;

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        field_l = null;
        field_k = null;
        if (param0) {
            bb.a(true);
            field_m = null;
            return;
        }
        field_m = null;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        rj stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nd var11 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof nd)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (rj) (param3);
                break L1;
              }
            }
            L2: {
              var11 = (nd) ((Object) stackIn_3_0);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_E;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param0) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              ti.f(param3.field_w + param1, param3.field_k + param2, param3.field_p, param3.field_t, this.field_i);
              var8 = param1 + (param3.field_w + this.field_e);
              if (param4 == 4549) {
                break L4;
              } else {
                field_h = (String) null;
                break L4;
              }
            }
            L5: {
              var9 = param2 + (param3.field_k - -this.field_j);
              ti.e(var8, var9, this.field_b, this.field_r, 5592405);
              ti.f(var8, var9, this.field_b, this.field_r, var7);
              if (var11.field_z) {
                ti.a(var8, var9, var8 + this.field_b, var9 - -this.field_r, 1);
                ti.a(var8 + this.field_b, var9, var8, this.field_r + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_g == null) {
                break L6;
              } else {
                var10 = this.field_q + (this.field_e + this.field_b);
                this.field_g.a(param3.field_m, param1 - (-param3.field_w - var10), param2 - -param3.field_k - -this.field_c, param3.field_p - (var10 + this.field_q), -(this.field_q << -1731581439) + param3.field_t, this.field_o, this.field_a, this.field_n, this.field_p, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("bb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final static nf a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        nf var9 = null;
        RuntimeException var9_ref = null;
        nf stackIn_2_0 = null;
        nf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new nf(param0, param6, param3, param1, param8, param2, param5);
            wb.field_f.b(-113, var9);
            if (param7 == 0) {
              ea.a(param4, var9, (byte) 80);
              stackIn_4_0 = (nf) (var9);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9_ref);

            stackIn_7_1 = new StringBuilder().append("bb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    bb(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_p = 1;
        this.field_n = 1;
        try {
            this.field_e = param5;
            this.field_r = param7;
            this.field_a = param4;
            this.field_g = param0;
            this.field_i = param9;
            this.field_j = param6;
            this.field_q = param1;
            this.field_c = param2;
            this.field_b = param8;
            this.field_o = param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_h = "Orb points: <%0>";
        field_l = "Cancel";
        field_m = new li(8, 0, 4, 1);
        field_f = "Press escape for menu";
    }
}
