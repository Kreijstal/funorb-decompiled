/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends a {
    private el field_m;
    static int field_k;
    static java.math.BigInteger field_p;
    private boolean field_l;
    static dl field_n;
    private String field_j;
    static String[] field_o;
    static String field_r;
    static ib field_q;

    final static void a(boolean param0, int param1) {
        if (param1 > -88) {
          qa.a(true, -68);
          hl.a(false, 24574, param0);
          return;
        }
        hl.a(false, 24574, param0);
    }

    qa(vg param0, vg param1) {
        super(param0);
        this.field_j = "";
        this.field_l = false;
        try {
          this.field_m = new el(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a(param0, (byte) -127) == rg.field_f) {
            stackIn_3_0 = this.field_m.a(param0, false);
            return stackIn_3_0;
          }
          if (this.a(param0, (byte) -124) == rg.field_f) {
            stackIn_7_0 = wd.field_b;
            return stackIn_7_0;
          }
          if (param1) {
            field_n = (dl) null;
          }
          stackIn_11_0 = dc.field_l;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("qa.K(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_r = null;
        field_o = null;
        field_n = null;
        field_q = null;
        if (!param0) {
          return;
        }
        field_p = null;
    }

    final qf a(String param0, byte param1) {
        ce var3 = null;
        RuntimeException var3_ref = null;
        qf stackIn_3_0 = null;
        qf stackIn_9_0 = null;
        qf stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.a(param0, (byte) -110) == rg.field_f) {
            stackIn_3_0 = rg.field_f;
            return stackIn_3_0;
          }
          if (param1 >= -109) {
            field_k = -73;
          }
          if (!param0.equals(this.field_j)) {
            var3 = tg.a(param0, -44);
            if (!var3.a(false)) {
              stackIn_9_0 = db.field_u;
              return stackIn_9_0;
            }
            this.field_j = param0;
            this.field_l = var3.a(-15004);
          }
          if (!this.field_l) {
            stackIn_14_0 = rg.field_f;
          } else {
            stackIn_14_0 = ph.field_g;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("qa.J(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_k = 20;
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
