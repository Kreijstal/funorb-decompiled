/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static String field_c;
    static volatile int field_e;
    static int field_g;
    static pm[] field_b;
    static String field_f;
    static String field_h;
    static bc field_a;
    static String field_d;

    final static int a(CharSequence param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          var4 = -64 % ((-22 - param1) / 51);
          for (var5 = 0; var2_int > var5; var5++) {
            var3 = f.a(param0.charAt(var5), -8483) + ((var3 << 5) - var3);
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("mg.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_h = null;
        if (param0 <= -65) {
          field_b = null;
          return;
        }
        field_g = 27;
        field_b = null;
    }

    static {
        field_c = "Lasers";
        field_b = new pm[5];
        field_e = 0;
        field_h = "Carefully tuned to send blasts#into every corner of the tunnel,#this weapon will hit everything.";
        field_f = "This password contains your email address, and would be easy to guess";
        field_d = "Music: ";
    }
}
