/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as {
    static String field_b;
    static kv[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 < 117) {
          field_b = (String) null;
        }
    }

    final static short[] a(short[] param0, int param1, pf param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BachelorFridge.field_y;
        try {
          var4_int = param2.d(param3, (byte) -125);
          if (0 == var4_int) {
            return null;
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          var5 = param2.d(4, (byte) 102);
          var6 = (short)param2.d(16, (byte) 115);
          if (param1 <= 58) {
            field_b = (String) null;
          }
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(var6 + param2.d(var5, (byte) 65));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("as.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "Cancel unrated rematch";
    }
}
