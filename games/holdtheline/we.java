/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends hl {
    int field_m;
    int field_i;
    static float field_n;
    int field_u;
    int[] field_k;
    int field_q;
    int field_s;
    static String field_t;
    static int field_j;
    static hj field_o;
    int field_r;
    static go field_p;
    static int field_l;

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_m = param5;
        this.field_u = param0;
        this.field_i = param1;
        this.field_k = param2;
        this.field_s = param7;
        if (param4 != -1) {
          return;
        }
        try {
          this.field_q = param3;
          this.field_r = param6;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "we.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_p = null;
        field_t = null;
        if (param0 < 22) {
          field_l = -106;
        }
    }

    final static lc a(byte param0, String param1) {
        RuntimeException var2 = null;
        lc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fj.field_o.a(250) &&
            !param1.equals(fj.field_o.b((byte) 66))) {
            fj.field_o = qn.a(param1, -7079);
          }
          if (param0 != -85) {
            field_l = 85;
          }
          stackIn_6_0 = fj.field_o;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("we.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    we() {
    }

    static {
        field_n = 260.0f / (float)(-1.0 + Math.exp(10.0));
        field_l = 250;
        field_t = "Connection lost - attempting to reconnect";
    }
}
