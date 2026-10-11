/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static boolean field_a;
    static ja field_d;
    static int[] field_f;
    static String field_e;
    static int field_c;
    static ba field_b;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        String stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          var10 = new char[param3];
          var4 = var10;
          var5 = 0;
          if (param1 != -129) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var6 = 0; var6 < param3; var6++) {
            var7 = param2[param0 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = h.field_e[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var10[incrementValue$0] = (char)var7;
            }
          }
          stackIn_18_0 = new String(var10, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("ka.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var6 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (param2 >= ~var3_int &&
            var3_int <= 12) {
            var4 = r.a(param0, param2 ^ 11133);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!sf.a(var4.charAt(0), -33) &&
                !sf.a(var4.charAt(-1 + var4.length()), param2 ^ 33)) {
                var5 = 0;
                for (var6 = 0; var6 < param0.length(); var6++) {
                  var7 = param0.charAt(var6);
                  if (!sf.a((char) var7, -33)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    return false;
                  }
                }
                if (var5 <= 0) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("ka.B(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        if (!param0) {
          field_b = (ba) null;
        }
        field_d = null;
    }

    static {
        field_d = new ja();
        field_e = "Show my scores only.";
        field_b = new ba();
    }
}
