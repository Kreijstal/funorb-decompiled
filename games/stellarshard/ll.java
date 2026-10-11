/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll implements uk {
    private int field_f;
    private int field_e;
    private bd field_a;
    static int field_b;
    static hl field_c;
    static int field_d;

    final static void c(int param0) {
        String var2 = (String) null;
        mj.a((String) null, "", 99);
        if (param0 != 32270) {
          field_b = 127;
        }
    }

    public ll() {
        this.field_f = 1;
        this.field_a = si.field_V;
        this.field_e = 1;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 512) {
          ll.c(-17);
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = stellarshard.field_B;
        try {
          if (param4 != 4549) {
            return;
          }
          if (!param3.field_q &&
            !param3.e(0)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          this.field_a.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_m + "</u>", param3.field_w + param1, param3.field_k + param2, param3.field_p, param3.field_t, var6_int, -1, this.field_e, this.field_f, this.field_a.field_N + this.field_a.field_r);
          if (!param3.e(0)) {
            return;
          }
          var7 = this.field_a.b(param3.field_m);
          var8 = this.field_a.field_N + this.field_a.field_r;
          var9 = param3.field_w + param1;
          var10 = param3.field_k + param2;
          if (this.field_e == 2) {
            var9 = var9 + (-var7 + param3.field_p);
          } else {
            if (1 == this.field_e) {
              var9 = var9 + (param3.field_p - var7 >> 1);
            }
          }
          if (this.field_f != 2) {
            if (this.field_f == 1) {
              var10 = var10 + (-var8 + param3.field_t >> 1);
            }
          } else {
            var10 = var10 + (-var8 + param3.field_t);
          }
          og.a(var9 - 2, (byte) 105, 4 + var7, var8, var10 + 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ll.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    ll(bd param0, int param1, int param2) {
        try {
          this.field_f = param2;
          this.field_a = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ll.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        jg.field_pb = 512;
        if (param0 != 16) {
          field_d = 114;
          wh.field_c = 0;
          return;
        }
        wh.field_c = 0;
    }

    static {
    }
}
