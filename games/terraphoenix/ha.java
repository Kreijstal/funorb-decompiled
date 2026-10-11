/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends di {
    static String field_m;
    static int field_q;
    static int[] field_s;
    static boolean field_o;
    private boolean field_u;
    static o field_n;
    private mg field_r;
    static int field_p;
    private String field_t;

    final im b(String param0, int param1) {
        ec var3 = null;
        RuntimeException var3_ref = null;
        im stackIn_3_0 = null;
        im stackIn_9_0 = null;
        im stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r.b(param0, param1) == qf.field_d) {
            stackIn_3_0 = qf.field_d;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_t)) {
            var3 = ei.a(-110, param0);
            if (!var3.a(-72)) {
              stackIn_9_0 = oh.field_b;
              return stackIn_9_0;
            }
            this.field_t = param0;
            this.field_u = var3.a(true);
          }
          if (!this.field_u) {
            stackIn_14_0 = qf.field_d;
          } else {
            stackIn_14_0 = dg.field_c;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ha.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r.b(param0, 0) == qf.field_d) {
            stackIn_3_0 = this.field_r.a(param0, -85);
            return stackIn_3_0;
          }
          if (this.b(param0, 0) == qf.field_d) {
            stackIn_6_0 = fl.field_a;
            return stackIn_6_0;
          }
          var3_int = -41 % ((param1 - 26) / 56);
          stackIn_8_0 = vd.field_p;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ha.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(eg param0, int param1, byte param2) {
        if (param2 <= 50) {
          return;
        }
        try {
          ic.field_s.a(param0, -16611);
          qc.a(param1, param0, (byte) 118);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ha.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, uf param1, uf param2) {
        try {
          if (null != param2.field_a) {
            param2.b((byte) 12);
          }
          if (param0 <= 63) {
            field_p = 107;
          }
          param2.field_a = param1.field_a;
          param2.field_d = param1;
          param2.field_a.field_d = param2;
          param2.field_d.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ha.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ha(ej param0, ej param1) {
        super(param0);
        this.field_u = false;
        this.field_t = "";
        try {
          this.field_r = new mg(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_n = null;
        field_m = null;
        field_s = null;
        if (param0 != 0) {
          eg var2 = (eg) null;
          ha.a((eg) null, -9, (byte) -50);
        }
    }

    static {
        field_q = 0;
        field_m = "Aimed Accuracy: ";
        field_o = false;
        field_n = new o();
    }
}
