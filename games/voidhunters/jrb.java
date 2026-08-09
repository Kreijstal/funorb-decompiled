/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jrb extends rqa {
    static String field_p;
    static int field_o;

    final static llb a(int param0) {
        if (param0 != 0) {
            return (llb) null;
        }
        return rga.field_f.field_wb;
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 != -2326) {
            field_p = (String) null;
        }
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
                jrb.a(24);
                break L1;
              }
            }
            jw.field_c = param0[0].a(false);
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jrb.A(");

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

    jrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static llb b(boolean param0) {
        if (param0) {
            jrb.a(45);
            return rgb.field_f.field_wb;
        }
        return rgb.field_f.field_wb;
    }

    static {
        field_p = "Security";
    }
}
