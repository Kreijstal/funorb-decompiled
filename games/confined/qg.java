/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends mf {
    private boolean field_j;
    private String field_i;
    static pm[] field_k;
    static int field_h;

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        in var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          var3 = hc.a(-24682, var5);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_i)) {
            var4 = c.a(param0, 78);
            if (var4 == null) {
              return null;
            }
            if (var4.field_f != null) {
              return null;
            }
            this.field_i = param0;
            this.field_j = var4.field_a;
          }
          if (!this.field_j) {
            stackIn_14_0 = fh.field_c;
            return stackIn_14_0;
          }
          if (!param1) {
            this.field_i = (String) null;
          }
          stackIn_18_0 = th.field_fb;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("qg.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    qg(ul param0) {
        super(param0);
        this.field_j = false;
    }

    public static void f(int param0) {
        if (param0 > -66) {
          return;
        }
        field_k = null;
    }

    final static void a(double param0, int param1, double[] param2, double param3, vg param4, dj param5, int param6) {
        double var9_double = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        try {
          var9_double = param2[9] * param5.field_C + param5.field_E;
          var11 = param5.field_C * param2[10] + param5.field_t;
          var13 = param5.field_D + param5.field_C * param2[11];
          var15 = 0.4 * param3;
          pa.a(var9_double, var15, (byte) -11, param6, var13, var11, cd.field_o[(param1 & 15) >> 1], param0, param4);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qg.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final void e(int param0) {
        this.field_i = null;
        if (param0 != 639775169) {
          dj var3 = (dj) null;
          qg.a(0.5264573121586292, 97, (double[]) null, -2.3170663679572066, (vg) null, (dj) null, -93);
        }
    }

    final fi a(byte param0, String param1) {
        in var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        CharSequence var5 = null;
        fi stackIn_4_0 = null;
        fi stackIn_11_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -44) {
            var4 = (dj) null;
            qg.a(0.033002690553074567, -88, (double[]) null, 1.6640993038654757, (vg) null, (dj) null, -56);
          }
          var5 = (CharSequence) ((Object) param1);
          if (!lc.a(var5, 13684)) {
            stackIn_4_0 = fb.field_e;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_i)) {
            var3 = c.a(param1, 117);
            if (var3 != null &&
              var3.field_f == null) {
              this.field_j = var3.field_a;
              this.field_i = param1;
            } else {
              stackIn_11_0 = qh.field_x;
              return stackIn_11_0;
            }
          }
          if (this.field_j) {
            stackIn_16_0 = nn.field_q;
          } else {
            stackIn_16_0 = fb.field_e;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("qg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_k = new pm[5];
    }
}
