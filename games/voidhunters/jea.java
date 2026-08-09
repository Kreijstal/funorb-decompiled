/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jea extends rqa {
    static String field_o;
    static String field_q;
    static int field_p;

    jea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        if (param0 != -20005) {
            field_p = 75;
            field_q = null;
            field_o = null;
            return;
        }
        field_q = null;
        field_o = null;
    }

    final static void a(int param0) {
        java.awt.Canvas var1;
        L0: {
          if (!upa.field_a) {
            upa.field_a = true;
            var1 = df.e((byte) 106);
            pk.field_o = kc.field_b;
            noa.field_q = uia.field_b;
            bm.field_o.a((java.awt.Component) ((Object) var1), stb.field_p, uqb.field_h, 14);
            bm.field_o.a((java.awt.Component) ((Object) var1), false, (byte) -106);
            uia.field_b = stb.field_p;
            kc.field_b = uqb.field_h;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 6045) {
          field_p = 95;
          return;
        } else {
          return;
        }
    }

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
              si.a(108, 62, param0[0].a(57));
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, 3);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jea.A(");

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

    static {
        field_o = "Show all private chat";
        field_q = "Add condition (Variable at least x)";
    }
}
