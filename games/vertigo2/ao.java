/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends d {
    static String[] field_Q;
    static String field_P;
    int field_I;
    int field_L;
    static long field_N;
    int field_T;
    int field_S;
    static dm field_O;
    int field_M;
    int field_J;
    static int field_K;
    static int field_H;
    static String field_R;

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 113) {
            field_R = (String) null;
          }
          if (!param2) {
            stackIn_6_0 = oc.field_s.c(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = hd.field_f.c(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ao.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, r param1) {
        er var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new er(param1.a("final_frame.jpg", "", 0), (java.awt.Component) ((Object) ne.field_F));
          var3 = var2.field_y;
          var4 = var2.field_t;
          tg.a((byte) -31);
          qn.field_r = new er(var3, param0 * var4 / 4);
          qn.field_r.d();
          var2.c(0, 0);
          lr.field_O = new er(var3, -qn.field_r.field_t + var4);
          lr.field_O.d();
          var2.c(0, -qn.field_r.field_t);
          lr.field_O.field_z = qn.field_r.field_t;
          ln.d(-28558);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ao.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ao() throws Throwable {
        throw new Error();
    }

    public static void h(int param0) {
        field_O = null;
        field_P = null;
        if (param0 == 0) {
          field_R = null;
          field_Q = null;
          return;
        }
        field_O = (dm) null;
        field_R = null;
        field_Q = null;
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        r var13 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, (byte) -119, param6)) {
            if (param5 > -107) {
              var13 = (r) null;
              ao.a(41, (r) null);
            }
            return false;
          }
          var8_int = param0 - param1 - this.field_o - this.field_J;
          var9 = param6 - this.field_t + (-param2 - this.field_M);
          if (this.field_L * this.field_L > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - lb.field_g;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_S;
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_S;
              }
            }
            this.field_T = (int)((double)this.field_S * var10 / 6.283185307179586);
            while (this.field_T >= this.field_S) {
              this.field_T = this.field_T - this.field_S;
            }
            while (this.field_T < 0) {
              this.field_T = this.field_T + this.field_S;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ao.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_Q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = 3;
        field_P = "Show chat (<%0> unread messages)";
        field_R = "<col=ee9d32>The controls</col>";
    }
}
