/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ai {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -28739) {
          return;
        }
        field_a = null;
    }

    final static w a(String param0, byte param1) {
        String stackIn_21_2 = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            int var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              w stackIn_8_0 = nh.field_f;
              return stackIn_8_0;
            }
            String var3 = param0.substring(0, var2_int);
            String var4 = param0.substring(var2_int + 1);
            w var5 = ds.a(false, var3);
            if (var5 != null) {
              w stackIn_12_0 = var5;
              return stackIn_12_0;
            }
            if (param1 == 12) {
              w stackIn_17_0 = in.a(126, var4);
              return stackIn_17_0;
            }
            w stackIn_15_0 = (w) null;
            return stackIn_15_0;
          }
          w stackIn_4_0 = mo.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var2;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ai.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10);

    static {
        field_b = "Updates will sent to the email address you've given";
    }
}
