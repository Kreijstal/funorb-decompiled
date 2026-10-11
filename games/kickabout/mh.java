/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends jd {
    static gm field_k;
    static dk field_q;
    private boolean field_n;
    static String field_l;
    private String field_m;
    private ge field_p;
    static String field_o;
    static int[] field_j;

    mh(ga param0, ga param1) {
        super(param0);
        this.field_n = false;
        this.field_m = "";
        try {
          this.field_p = new ge(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25) {
            var4 = (String) null;
            this.a((String) null, 68);
          }
          if (this.field_p.a(param1, -5) == jt.field_Bb) {
            stackIn_5_0 = this.field_p.a((byte) 25, param1);
            return stackIn_5_0;
          }
          if (this.a(param1, -5) != jt.field_Bb) {
            stackIn_10_0 = dl.field_g;
            return stackIn_10_0;
          }
          stackIn_8_0 = ql.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final rv a(String param0, int param1) {
        kw var3 = null;
        RuntimeException var3_ref = null;
        rv stackIn_2_0 = null;
        rv stackIn_8_0 = null;
        rv stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_p.a(param0, param1) == jt.field_Bb) {
            stackIn_2_0 = jt.field_Bb;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_m)) {
            var3 = kt.a(false, param0);
            if (!var3.a((byte) -80)) {
              stackIn_8_0 = en.field_p;
              return stackIn_8_0;
            }
            this.field_m = param0;
            this.field_n = var3.b((byte) -90);
          }
          if (!this.field_n) {
            stackIn_13_0 = jt.field_Bb;
          } else {
            stackIn_13_0 = he.field_yb;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mh.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_o = null;
        field_q = null;
        field_l = null;
        field_k = null;
        field_j = null;
        if (param0 != -29635) {
          field_l = (String) null;
        }
    }

    static {
        field_l = "Connection lost. <%0>";
        field_o = null;
    }
}
