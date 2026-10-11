/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        int var1 = -91 % ((param0 - 3) / 48);
        field_b = null;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nl var12 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            if (param1 != -44) {
              var12 = (nl) null;
              fc.a(92, (nl) null, 82);
            }
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
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
                var10 = var6 * param3 + var9;
                if (var6 != var10 / param3) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("fc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, nl param1, int param2) {
        lh var5 = null;
        int var4 = 0;
        try {
          var5 = nj.field_p;
          var5.d(param2, -18392);
          var5.field_j = var5.field_j + 1;
          var4 = var5.field_j;
          var5.c(1, (byte) -126);
          var5.c(param1.field_j, (byte) -95);
          var5.b((byte) -63, param1.field_l);
          var5.a(param1.field_h, (byte) 122);
          var5.a(param1.field_p, (byte) -2);
          if (param0 > -1) {
            fc.a(113);
          }
          var5.a(param1.field_q, (byte) -117);
          var5.a(param1.field_k, (byte) 104);
          var5.d(var4, (byte) 9);
          var5.b(var5.field_j - var4, (byte) 87);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
