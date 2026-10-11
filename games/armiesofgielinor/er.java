/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -3) {
          field_a = 42;
        }
    }

    final static void b(int param0) {
        if (~p.field_b == param0 ||
          !du.c(10)) {
          tb.d(7);
          p.field_b = 11;
        }
        dd.field_a = true;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            if (param1 > -38) {
              er.b(-89);
            }
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (43 != var9 ||
                !param0))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param3) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param3 * var6;
                if (var10 / param3 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_40_0 = var5;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("er.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = -52 % ((param0 + 85) / 37);
        if (null != rl.field_C) {
          rl.field_C.k(0);
        }
        if (pq.field_a != null) {
          pq.field_a.i((byte) 2);
        }
        qh.a((byte) 124);
    }

    static {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_c = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
