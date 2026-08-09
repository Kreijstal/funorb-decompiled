/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class flb extends rqa {
    static vka field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -97);
                break L1;
              }
            }
            si.a(225, 62, param0[0].a(77));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("flb.A(");

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

    public static void a(int param0) {
        field_o = null;
        if (param0 != -26016) {
            flb.a(-2);
        }
    }

    flb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, String param1, int param2, String param3, int param4) {
        try {
            bpa.field_c.field_hb = bpa.field_c.field_hb + fgb.field_l.field_hb;
            bpa.field_c.field_Y = param4;
            bpa.field_c.field_R = param1;
            bpa.field_c.field_s = param3;
            fgb.field_l.field_L = fgb.field_l.field_L + fgb.field_l.field_hb;
            fgb.field_l.field_hb = param2;
            if (param0 != 19204) {
                flb.a(98);
            }
            bpa.field_c.field_hb = bpa.field_c.field_hb - fgb.field_l.field_hb;
            fgb.field_l.field_L = fgb.field_l.field_L - fgb.field_l.field_hb;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "flb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
    }
}
