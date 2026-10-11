/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends vg {
    static li field_u;
    static ej field_v;
    static int field_w;
    static String field_x;

    final static void a(int param0, String param1) {
        try {
          if (param0 != 7110) {
            String var3 = (String) null;
            il.a(-21, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "il.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    il(int param0) {
        this(si.field_V, param0);
    }

    final String b(rj param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = la.a(124, '*', param0.field_m.length());
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("il.JA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private il(bd param0, int param1) {
        super(param0, param1);
    }

    final static boolean e(int param0) {
        if (param0 != 32525) {
          field_x = (String) null;
          if (eg.field_d < 10) {
            return false;
          }
          if (!cg.field_a) {
            return !ih.b(12871) ? true : false;
          }
          return false;
        }
        if (eg.field_d < 10) {
          return false;
        }
        if (!cg.field_a) {
          return !ih.b(12871) ? true : false;
        }
        return false;
    }

    public static void d(int param0) {
        if (param0 == -5758) {
          field_x = null;
          field_u = null;
          field_v = null;
          return;
        }
        field_w = -104;
        field_x = null;
        field_u = null;
        field_v = null;
    }

    static {
        field_u = new li(2, 4, 4, 0);
        field_x = "Quit";
    }
}
