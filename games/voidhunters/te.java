/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends rqa {
    static dja field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (Object) null;
            te.a(27, (Object) null, (Object) null);
          }
          stackIn_3_0 = new nc(frb.a(0, 86));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("te.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, Object param1, Object param2) {
        try {
          if (param0 != 29786) {
            field_o = (dja) null;
          }
          System.out.println("before=" + param2 + ", now=" + param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "te.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
          field_o = (dja) null;
        }
    }

    te(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = (dja) ((Object) new wqa());
    }
}
