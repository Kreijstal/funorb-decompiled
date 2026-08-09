/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bjb extends rqa {
    static int field_o;
    static String field_q;
    static qsa[] field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(7, 62, param0[0].a(103));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bjb.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        L0: {
          if (ssa.b(2)) {
            vc.a(kt.field_r, 2182, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!vrb.a(-116)) {
            vc.a(ega.field_o, 2182, 1);
            vc.a(jmb.field_r, 2182, 2);
            vc.a(jab.field_o, 2182, 3);
            vc.a(fe.field_o, 2182, 4);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 15334) {
          bjb.b(true);
          return;
        } else {
          return;
        }
    }

    bjb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
            bjb.b(false);
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        field_o = -2;
        field_q = "Asking for or providing contact information";
    }
}
