/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw extends gn {
    static double field_f;
    static int field_i;
    static boolean field_k;
    byte[] field_g;
    private static int[] field_h;
    private static int[] field_e;
    static float field_j;

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 <= 83) {
          field_e = (int[]) null;
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = mo.a(0, param0);
            if (var4 != null &&
              1 <= var4.length()) {
              if (ca.a(false, var4.charAt(0))) {
                return false;
              }
              if (ca.a(false, var4.charAt(-1 + var4.length()))) {
                return false;
              }
              if (param1 != -26200) {
                return false;
              }
              var5 = 0;
              for (var6 = 0; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (!ca.a(false, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("hw.B(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ki a(int param0, int param1, int param2, byte param3, byte param4) {
        int var5 = -103 / ((-46 - param2) / 36);
        return new ki(2, param0, param1, param4, param3);
    }

    hw(byte[] param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_f = 16384.0;
        field_i = (int)field_f >> 3;
        field_h = new int[255];
        for (var0 = 0; 255 > var0; var0++) {
          field_h[var0] = hf.a(var0 << 16, var0 << 8);
        }
        field_e = new int[255];
        for (var0Lifetime1 = 0; var0Lifetime1 < 255; var0Lifetime1++) {
          field_e[var0Lifetime1] = hf.a(var0Lifetime1 << 16, var0Lifetime1);
        }
    }
}
