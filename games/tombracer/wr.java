/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends ela {
    static String[] field_o;

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa[] var4 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (bfa[]) null;
            this.a((bfa[]) null, -90);
          }
          stackIn_3_0 = new bfa(joa.a(param0[1].a(false), (byte) 77, (String) (param0[0].field_d)));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wr.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    wr(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(byte param0) {
        int var1 = -38 / ((-34 - param0) / 34);
        field_o = null;
    }

    static {
    }
}
