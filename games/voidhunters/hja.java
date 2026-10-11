/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hja extends rqa {
    static String field_p;
    static byte[][] field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(21, 62, param0[0].a(10));
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 102);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hja.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = (byte[][]) null;
        if (param0 != 21) {
          hja.a(0);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static void a(int param0, int[] param1) {
        qia.a(param0 + 1, param1);
        if (param0 != 0) {
          int[] var3 = (int[]) null;
          hja.a(-95, (int[]) null);
        }
        try {
          mgb.field_o = false;
          wba.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hja.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    hja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
