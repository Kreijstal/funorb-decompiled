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
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          dn.field_q = ia.field_y;
          if (param3 == 255) {
            boolean stackIn_10_0 = !(13 <= gf.field_a);
            SpriteState.field_y = fc.a(stackIn_10_0, (byte) -82);
          } else if (param3 < 100) {
            SpriteState.field_y = bm.a(param1, param3, 4);
          } else if (105 < param3) {
            SpriteState.field_y = bm.a(param1, param3, 4);
          } else {
            SpriteState.field_y = BufferedRandomAccessFile.a(args, (byte) -103);
          }
          if (param2 == -72) {
            return;
          }
          String var6 = (String) null;
          j.a((String[]) null, (String) null, (byte) -30, 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var4;
          StringBuilder stackIn_16_1 = new StringBuilder().append("j.A(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
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
