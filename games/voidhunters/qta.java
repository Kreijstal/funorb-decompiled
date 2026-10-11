/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qta extends rqa {
    static int[] field_o;

    final static boolean a(int param0, int param1) {
        if (param1 != 9) {
          qta.b(false);
          if (4 > param0) {
            return false;
          }
          if (13 != param0) {
            return true;
          }
          return false;
        }
        if (4 > param0) {
          return false;
        }
        if (13 != param0) {
          return true;
        }
        return false;
    }

    qta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            qta.b(true);
          }
          stackIn_3_0 = new nc(frb.a(9, 111));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qta.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
          qta.a(-80, 94);
        }
    }

    static {
    }
}
