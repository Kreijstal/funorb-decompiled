/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends oh {
    nc field_k;
    float field_h;
    ln field_q;
    nc field_r;
    static int field_t;
    static pf field_v;
    static int[] field_p;
    float field_o;
    ln field_u;
    float field_i;
    float field_l;
    float field_j;
    static String field_m;
    float field_s;
    static String field_n;

    final static int a(int param0) {
        if (param0 >= -77) {
          return 20;
        }
        return 1;
    }

    final static void a(nf param0, int param1) {
        int var2_int = 0;
        nf var3 = null;
        int var4 = 0;
        nf var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 2) {
            var5 = (nf) null;
            nc.a((nf) null, 0);
          }
          if (param0.field_k == null) {
            return;
          }
          if (param0.field_l != 0 ||
            param0.field_e != 0) {
            for (var2_int = 0; var2_int < da.field_g; var2_int++) {
              var3 = wm.field_d[var2_int];
              if (2 == var3.field_n &&
                param0.field_l == var3.field_l &&
                param0.field_e == var3.field_e) {
                return;
              }
            }
          }
          if (param0.field_f != null) {
            jj.field_o = param0.field_b;
            bq.field_e = param0.field_p;
            uo.field_f = param0.field_f;
            tl.field_D = param0.field_n;
          }
          ei.a((byte) 70, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("nc.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, bc param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.b((byte) 115)) {
            stackIn_2_0 = (String) (param0);
            return stackIn_2_0;
          }
          var4_int = -57 % ((-25 - param2) / 51);
          stackIn_4_0 = param3 + " - " + param1.d(100) + "%";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("nc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void d(int param0) {
        field_v = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 != -1) {
          field_t = 125;
        }
    }

    nc(ln param0, ln param1) {
        try {
          this.field_k = null;
          this.field_q = param0;
          this.field_u = param1;
          this.field_r = null;
          this.field_o = 10000.0f;
          this.field_i = (float)(-this.field_q.field_S + this.field_u.field_S);
          this.field_l = (float)(this.field_u.field_S + this.field_q.field_S) / 2.0f;
          this.field_s = (float)(this.field_q.field_A - this.field_u.field_A);
          this.field_j = -10000.0f;
          this.field_h = (float)(this.field_q.field_A + this.field_u.field_A) / 2.0f;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    nc(ln param0, nc param1, nc param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_h = (float)(param5 + param3) / 2.0f;
          this.field_j = -1.0f;
          this.field_s = (float)(-param4 + param6) / 2.0f;
          this.field_l = (float)(param4 + param6) / 2.0f;
          this.field_i = (float)(param5 - param3) / 2.0f;
          this.field_k = param2;
          this.field_o = 1.0f;
          this.field_r = param1;
          this.field_u = null;
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_v = null;
        field_p = new int[12];
        field_m = "Create your own free Jagex account";
        field_n = "You need to play <%0> more rated games to unlock this option.";
        field_t = 0;
    }
}
