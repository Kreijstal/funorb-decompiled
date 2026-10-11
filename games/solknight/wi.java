/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends gg {
    static String field_k;
    static int field_l;
    static o[] field_i;
    static na field_j;
    static String field_h;

    private wi() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          if (param3 >= 2 &&
            36 >= param3) {
            var4_int = 0;
            var5 = 0;
            if (param0 != -913) {
              return true;
            }
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param3 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param3 + var9;
                if (var10 / param3 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_44_0 = var5;
            return stackIn_44_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_47_0 = var4;
          stackIn_47_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(114, param0);
        var2.c(75, 0);
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != -26923) {
          wi.b(-104, -27);
        }
        field_i = null;
        field_j = null;
        field_k = null;
    }

    final static int b(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0 ||
          param1 >= 65536) {
          var2 += 16;
          param1 = param1 >>> 16;
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param1 >= 4) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param0 < 72) {
          return -3;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return param1 + var2;
    }

    static {
        field_l = 250;
        field_k = "Type your password again to make sure it's correct";
        field_h = "Updates will sent to the email address you've given";
    }
}
