/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends pm {
    private fj field_h;
    static String field_j;
    static String field_k;
    static int field_f;
    private boolean field_i;
    private String field_g;

    final static void a(boolean param0, int param1) {
        if (param1 < 61) {
          field_f = 84;
          pn.a(false, (byte) -55, param0);
          return;
        }
        pn.a(false, (byte) -55, param0);
    }

    final static ln e(int param0) {
        if (param0 != 16516) {
          return (ln) null;
        }
        return (ln) ((Object) new ab());
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 1029) {
          lk.e(-104);
        }
    }

    final rh a(String param0, int param1) {
        tk var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_2_0 = null;
        rh stackIn_7_0 = null;
        rh stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.a(param0, param1) == uc.field_b) {
            stackIn_2_0 = uc.field_b;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_g)) {
            var3 = um.a((byte) 110, param0);
            if (!var3.a(36)) {
              stackIn_7_0 = gj.field_v;
              return stackIn_7_0;
            }
            this.field_g = param0;
            this.field_i = var3.a(false);
          }
          if (this.field_i) {
            stackIn_12_0 = mc.field_g;
          } else {
            stackIn_12_0 = uc.field_b;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("lk.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    lk(tb param0, tb param1) {
        super(param0);
        this.field_i = false;
        this.field_g = "";
        try {
          this.field_h = new fj(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -94) {
            field_k = (String) null;
          }
          if (this.field_h.a(param0, 2) == uc.field_b) {
            stackIn_4_0 = this.field_h.a(param0, (byte) -119);
            return stackIn_4_0;
          }
          if (this.a(param0, 2) != uc.field_b) {
            return sd.field_c;
          }
          stackIn_8_0 = ng.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lk.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_j = "Back";
    }
}
