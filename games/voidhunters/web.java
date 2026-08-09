/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class web extends rqa {
    static String field_p;
    static no field_o;

    final static void a(int param0) {
        vpa var1 = null;
        faa var2 = null;
        if (param0 > -20) {
            web.e((byte) 50);
            if (!(unb.field_o)) {
                return;
            }
            var1 = pba.b(false);
            var2 = new faa(1048576);
            var2.q(-122);
            var1.b(var2, -110);
            var2.r(32712);
            asb.a(var2.field_e, "missions.dat", var2.field_h, -107, "");
            nkb.a(false, "Saved out mission list");
            return;
        }
        if (!(unb.field_o)) {
            return;
        }
        var1 = pba.b(false);
        var2 = new faa(1048576);
        var2.q(-122);
        var1.b(var2, -110);
        var2.r(32712);
        asb.a(var2.field_e, "missions.dat", var2.field_h, -107, "");
        nkb.a(false, "Saved out mission list");
    }

    web(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 < 100) {
            return;
        }
        field_p = null;
        field_o = null;
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
                web.e((byte) 42);
                break L1;
              }
            }
            si.a(91, 62, param0[0].a(107));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("web.A(");

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
        field_p = "Try changing the '<%0>' setting.";
    }
}
