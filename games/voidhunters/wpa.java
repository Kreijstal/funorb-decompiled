/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpa extends rqa {
    static Object field_q;
    static int field_r;
    static String field_o;
    static int field_p;

    wpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_r = 64;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(79, 124));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wpa.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_q = null;
        if (!param0) {
            field_o = (String) null;
        }
    }

    final static String a(int param0) {
        if (dw.field_c == dn.field_r) {
            return bfa.field_p;
        }
        if (!wba.field_p.a(4)) {
            return wba.field_p.b(4);
        }
        if (param0 != 52) {
            wpa.b(true);
            if (!(dw.field_c != lrb.field_b)) {
                return wba.field_p.b(4);
            }
            return qsb.field_d;
        }
        if (!(dw.field_c != lrb.field_b)) {
            return wba.field_p.b(4);
        }
        return qsb.field_d;
    }

    static {
        field_o = "More suggestions";
        field_r = 87;
        field_p = 52;
    }
}
