/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static byte[][][] field_a;
    static ko field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = (byte[][][]) null;
        if (param0 != 0) {
          CharSequence var2 = (CharSequence) null;
          lp.a((CharSequence) null, (byte) 7, 'D');
        }
        field_c = null;
    }

    final static int a(CharSequence param0, byte param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          var3_int = 0;
          var4 = param0.length();
          if (param1 >= -13) {
            field_c = (String) null;
          }
          for (var5 = 0; var5 < var4; var5++) {
            if (param0.charAt(var5) == param2) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("lp.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "Aha, some rocks to kill the spider with!";
    }
}
