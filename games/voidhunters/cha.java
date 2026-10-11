/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cha extends rqa {
    static boolean field_o;
    static int field_p;
    static dka field_q;
    static String field_r;

    cha(String param0, Class[] param1, String param2) {
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
          si.a(48, 62, param0[0].a(93));
          if (param1 >= -119) {
            field_o = false;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = 23 / ((param0 + 46) / 55);
        field_r = null;
        field_q = null;
    }

    static {
        field_o = false;
        field_p = 1024;
        field_q = new dka(0);
        field_r = "Add action (Add body info to custom variable)";
    }
}
