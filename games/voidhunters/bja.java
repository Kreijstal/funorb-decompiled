/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bja extends rqa {
    static int[] field_p;
    static String field_o;

    public static void f(byte param0) {
        field_o = null;
        if (param0 < 74) {
          return;
        }
        field_p = null;
    }

    bja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(161, 62, param0[0].a(43));
          if (param1 <= -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bja.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int e(byte param0) {
        int var1 = 57 % ((param0 - 65) / 52);
        return tqa.e((byte) 96) - se.a(false) / 2;
    }

    static {
        field_p = new int[5];
        field_o = "Previous condition/action value";
    }
}
