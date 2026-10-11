/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kwa extends rqa {
    static asb field_o;

    public static void b(boolean param0) {
        if (!param0) {
          field_o = (asb) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static void a(String param0, int param1) {
        if (param1 > -12) {
          return;
        }
        try {
          pja.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "kwa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 62);
          }
          stackIn_3_0 = new nc(frb.a(108, 83));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kwa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    kwa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
