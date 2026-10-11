/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_d;
    static String field_b;
    static cj field_a;
    static int field_c;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var7 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (1 <= var3_int &&
            12 >= var3_int) {
            var4 = tg.a(param1, false);
            if (var4 != null &&
              var4.length() >= 1) {
              var5 = 76 % ((25 - param2) / 53);
              if (!eb.a((byte) 56, var4.charAt(0)) &&
                !eb.a((byte) 84, var4.charAt(-1 + var4.length()))) {
                var6 = 0;
                for (var7 = 0; param1.length() > var7; var7++) {
                  var8 = param1.charAt(var7);
                  if (eb.a((byte) -75, (char) var8)) {
                    var6++;
                  } else {
                    var6 = 0;
                  }
                  if (var6 >= 2 &&
                    !param0) {
                    return false;
                  }
                }
                if (0 >= var6) {
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
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("vd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
          vd.a(false, 109L);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(boolean param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0) {
          return;
        }
        if (param1 % 10L != 0L) {
          be.a(param1, true);
          return;
        }
        be.a(-1L + param1, true);
        be.a(1L, !param0 ? true : false);
    }

    static {
        field_d = 1;
        field_b = "Wise";
    }
}
