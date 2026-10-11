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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(7, 62, param0[0].a(103));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bjb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (ssa.b(2)) {
          vc.a(kt.field_r, 2182, 0);
        }
        if (!vrb.a(-116)) {
          vc.a(ega.field_o, 2182, 1);
          vc.a(jmb.field_r, 2182, 2);
          vc.a(jab.field_o, 2182, 3);
          vc.a(fe.field_o, 2182, 4);
        }
        if (param0 == 15334) {
          return;
        }
        bjb.b(true);
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
