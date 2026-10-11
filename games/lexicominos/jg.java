/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends tj {
    private g field_o;
    private boolean field_l;
    private String field_n;
    static db field_m;

    jg(rl param0, rl param1) {
        super(param0);
        this.field_n = "";
        this.field_l = false;
        try {
          this.field_o = new g(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(0, param1) == ni.field_b) {
            stackIn_3_0 = this.field_o.a((byte) -126, param1);
            return stackIn_3_0;
          }
          if (this.a(param0 ^ -126, param1) == ni.field_b) {
            stackIn_6_0 = me.field_t;
            return stackIn_6_0;
          }
          if (param0 != -126) {
            this.field_n = (String) null;
          }
          stackIn_10_0 = fj.field_x;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static mb c(boolean param0) {
        if (param0) {
          return (mb) null;
        }
        if (bk.field_c == c.field_m) {
          throw new IllegalStateException();
        }
        if (c.field_o == bk.field_c) {
          bk.field_c = c.field_m;
          return li.field_T;
        }
        return null;
    }

    final static db[] a(int param0, int param1) {
        db[] var3 = new db[9];
        db[] var2 = var3;
        var3[param1] = gf.a((byte) -76, 64, param0);
        return var2;
    }

    public static void e(int param0) {
        if (param0 != -25048) {
          jg.e(-58);
          field_m = null;
          return;
        }
        field_m = null;
    }

    final sc a(int param0, String param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        sc stackIn_3_0 = null;
        sc stackIn_7_0 = null;
        sc stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(param0, param1) == ni.field_b) {
            stackIn_3_0 = ni.field_b;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_n)) {
            var3 = ua.a(param1, 99);
            if (!var3.b(12)) {
              stackIn_7_0 = be.field_q;
              return stackIn_7_0;
            }
            this.field_n = param1;
            this.field_l = var3.a(12);
          }
          if (this.field_l) {
            stackIn_12_0 = rh.field_p;
          } else {
            stackIn_12_0 = ni.field_b;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("jg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
