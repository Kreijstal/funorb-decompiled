/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends ml {
    static bi field_p;
    static bi field_r;
    static String field_q;
    private go field_n;
    static mp field_s;
    static String field_o;
    static va field_t;

    fj(go param0, go param1) {
        super(param0);
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, qr param1) {
        qr var4 = null;
        qr var5 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = (qr) (param1.field_M.d(0));
          qr var2 = var4;
          while (var4 != null) {
            var4.field_mb = 0;
            var4.field_gb = 0;
            var4.field_w = 0;
            var4.field_db = 0;
            var5 = (qr) (param1.field_M.a((byte) -71));
            var5 = var5;
          }
          if (param0) {
            fj.d(-29);
          }
          param1.field_mb = 0;
          param1.field_w = 0;
          param1.field_db = 0;
          param1.field_gb = 0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fj.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(boolean param0, String param1) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_n instanceof ki) {
            var3 = ((ki) ((Object) this.field_n)).a((byte) 73);
            if (var3 != null) {
              if (var3.c(-126) == p.field_g &&
                !param1.equals(this.field_n.field_s)) {
                stackIn_8_0 = mh.field_a;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.a((byte) -63);
              return stackIn_10_0;
            }
          }
          if (param1.equals(this.field_n.field_s)) {
            return null;
          }
          stackIn_14_0 = mh.field_a;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final u b(int param0, String param1) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        u stackIn_5_0 = null;
        u stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof ki) {
            var3 = ((ki) ((Object) this.field_n)).a((byte) 120);
            if (var3 != null &&
              var3.c(param0 + 11321) != p.field_g) {
              stackIn_5_0 = tj.field_b;
              return stackIn_5_0;
            }
          }
          if (param0 != -11196) {
            field_r = (bi) null;
          }
          if (!param1.equals(this.field_n.field_s)) {
            stackIn_11_0 = tj.field_b;
          } else {
            stackIn_11_0 = p.field_g;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("fj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        int var1 = 92 % ((11 - param0) / 59);
        field_p = null;
        field_o = null;
        field_q = null;
    }

    static {
        field_q = "To <%0>: ";
        field_o = "VICTORY!";
    }
}
