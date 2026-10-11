/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt {
    static String field_b;
    static String field_c;
    static be[] field_a;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -53) {
          field_c = (String) null;
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oq.field_b != null) {
            oq.field_b.p(param2 - 85);
          }
          ola.field_e = new ph(param0, param1, false, true, true);
          kka.field_l.e(ola.field_e, param2 + 24);
          if (param2 == 9) {
            return;
          }
          field_a = (be[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rt.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1, ht param2) {
        oea.field_p = new jp();
        if (param1 < 73) {
          return;
        }
        try {
          oea.field_p.a(128, (byte) 39, 9);
          lfa.a(22050, param2, true, (byte) 107, oea.field_p, (java.awt.Component) ((Object) param0));
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rt.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "<%0> is already on your friend list.";
        field_b = "Open in popup window";
        field_a = new be[71];
    }
}
