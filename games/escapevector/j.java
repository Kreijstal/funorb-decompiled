/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 26 % ((65 - param0) / 59);
    }

    final static void a(String[] args, String param1, byte param2, int param3) {
        int var5 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var6 = null;
        var5 = EscapeVector.field_A;
        try {
          dn.field_q = ia.field_y;
          if (param3 == 255) {
            stackIn_10_0 = !(13 <= gf.field_a);
            nf.field_y = fc.a(stackIn_10_0, (byte) -82);
          } else {
            if (param3 < 100) {
              nf.field_y = bm.a(param1, param3, 4);
            } else {
              if (105 < param3) {
                nf.field_y = bm.a(param1, param3, 4);
              } else {
                nf.field_y = rg.a(args, (byte) -103);
              }
            }
          }
          if (param2 == -72) {
            return;
          }
          var6 = (String) null;
          j.a((String[]) null, (String) null, (byte) -30, 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("j.A(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Creating your account";
    }
}
