/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static ok field_c;
    static he field_b;
    static he[] field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (!param0) {
          field_a = (he[]) null;
        }
    }

    final static String[] a(byte param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param2);
          var3_int = tf.a(var10, param1, 16752);
          if (param0 > -79) {
            field_b = (he) null;
          }
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2.charAt(var8) != param1; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = 1 + var8;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ki.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
    }
}
