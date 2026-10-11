/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends mh {
    static byte[] field_j;
    static String field_f;
    static ff field_k;
    static qi field_i;
    static int[] field_l;
    static qj field_e;
    static qk field_g;
    static String field_h;

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_h = null;
        field_e = null;
        if (param0 != 4352) {
          field_g = (qk) null;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Main.field_T;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          if (param1 != -128) {
            var7 = (CharSequence) null;
            sh.a((CharSequence) null, (byte) 31);
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (65 <= var5 &&
              var5 <= 90) {
              var3[var4] = (char)(-65 + var5 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var9);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("sh.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_j = new byte[65536];
        og.a(field_j, 0, 65536, (byte) -128);
        field_f = "More suggestions";
        field_k = null;
        field_h = "Return to game";
    }
}
