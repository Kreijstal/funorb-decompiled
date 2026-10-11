/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static String field_a;
    static double[] field_b;

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (ra.a(param0.charAt(var2_int), 252)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (ra.a(param0.charAt(var3 - 1), 252)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param1 <= 97) {
            field_b = (double[]) null;
          }
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (ik.a((char) var7, (byte) -46)) {
              var8 = ga.a((byte) 63, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (0 != var5.length()) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("hf.B(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 12) {
          field_b = null;
          field_a = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        hf.a((CharSequence) null, 79);
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new double[13];
    }
}
