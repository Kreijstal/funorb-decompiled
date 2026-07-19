/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cca extends ana {
    static String field_w;
    static eaa field_v;
    private jaa field_x;

    final boolean c(byte param0) {
        uea var2_ref_uea = null;
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!((fieldTemp$0 ^ -1) >= -1)) {
            if (25 == this.field_l) {
                jja.a(256, -1, 26);
                var2_ref_uea = new uea(this.field_q, this.field_x.field_t, this.field_x.field_r, 16777215);
                ((kj) ((Object) var2_ref_uea)).a(0);
                return false;
            }
            return false;
        }
        int var2 = -29 / ((71 - param0) / 47);
        this.e((byte) -64);
        return true;
    }

    private final void e(byte param0) {
        if (param0 != -64) {
          field_v = (eaa) null;
          this.field_x.a(this.field_q.field_h, false);
          return;
        } else {
          this.field_x.a(this.field_q.field_h, false);
          return;
        }
    }

    final static n b(int param0, String param1) {
        n discarded$2 = null;
        RuntimeException var2 = null;
        String var3 = null;
        n stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -26869) {
                break L1;
              } else {
                var3 = (String) null;
                discarded$2 = cca.b(84, (String) null);
                break L1;
              }
            }
            L2: {
              if (!ut.field_m.a(false)) {
                break L2;
              } else {
                if (param1.equals(ut.field_m.b(param0 ^ -2930))) {
                  break L2;
                } else {
                  ut.field_m = ida.a(param1, param0 ^ 26686);
                  break L2;
                }
              }
            }
            stackOut_5_0 = ut.field_m;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("cca.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(lu param0, int param1, byte param2, int param3, int param4) {
        try {
            param0.d(12, 0);
            int var5_int = 51 / ((param2 - -3) / 61);
            param0.b(17, -114);
            param0.b(param4, -119);
            param0.b(param1, -117);
            param0.d(param3, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cca.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    cca(gj param0, jaa param1) {
        super(param0, param1);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 < 71) {
            return;
        }
        field_v = null;
        field_w = null;
    }

    static {
        field_w = "Stamina</col>";
    }
}
