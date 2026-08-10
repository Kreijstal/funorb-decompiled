/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends br {
    int field_k;
    int field_f;
    static String field_o;
    int field_n;
    int field_l;
    static bo field_h;
    static ja[] field_g;
    wi field_i;
    static String field_p;
    int field_j;
    static String field_m;

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 2) {
                break L1;
              } else {
                field_h = (bo) null;
                break L1;
              }
            }
            stackIn_3_0 = eq.a(param0, 0, 4, param0.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("wi.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_h = null;
        field_p = null;
        if (param0 != 0) {
          field_m = (String) null;
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, ld param1) {
        if (param1 == null) {
            return;
        }
        try {
            mj.field_Ib = param1;
            rp.field_l.field_Cb.e(-30986);
            rp.field_l.a((byte) 50, mj.field_Ib);
            ee.field_b = true;
            if (param0 != 4) {
                wi.a(-50);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    wi(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = param2;
        this.field_j = param3;
        this.field_n = param4;
        this.field_l = param0;
        this.field_k = param1;
    }

    static {
        field_o = "Time elapsed: <%0>";
        field_p = "Mastery of technology is not far away.";
        field_m = "Quake";
        field_h = new bo("");
    }
}
