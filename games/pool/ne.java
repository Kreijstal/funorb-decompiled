/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ig {
    static int field_w;
    static int field_q;
    static int field_v;
    static ko field_r;
    private sl field_p;
    static int field_s;
    static volatile int field_o;
    static int field_m;
    static od field_u;
    static dd[] field_t;
    static int field_n;

    final na a(String param0, boolean param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_6_0 = null;
        na stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.field_p = (sl) null;
          }
          if (this.field_p instanceof sc) {
            var3 = ((sc) ((Object) this.field_p)).a(83);
            if (var3 != null &&
              var3.c(-31873) != kr.field_e) {
              stackIn_6_0 = gp.field_d;
              return stackIn_6_0;
            }
          }
          if (param0.equals(this.field_p.field_m)) {
            stackIn_10_0 = kr.field_e;
          } else {
            stackIn_10_0 = gp.field_d;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ne.K(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_u = null;
        if (param0 != 15) {
          field_q = 105;
          field_r = null;
          field_t = null;
          return;
        }
        field_r = null;
        field_t = null;
    }

    final String a(String param0, int param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_p instanceof sc) {
            var3 = ((sc) ((Object) this.field_p)).a(-11);
            if (var3 != null) {
              if (var3.c(-31873) == kr.field_e &&
                !param0.equals(this.field_p.field_m)) {
                stackIn_10_0 = rk.field_i;
                return stackIn_10_0;
              }
              stackIn_12_0 = var3.a(73);
              return stackIn_12_0;
            }
          }
          if (param0.equals(this.field_p.field_m)) {
            return null;
          }
          stackIn_16_0 = rk.field_i;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ne.L(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    ne(sl param0, sl param1) {
        super(param0);
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = 12;
        field_s = 0;
        field_o = 0;
        field_r = new ko();
        field_m = -1;
        field_n = -1;
    }
}
