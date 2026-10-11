/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ne {
    static nn field_j;
    byte[] field_k;
    static int[] field_i;

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DungeonAssault.field_K;
        try {
          var11 = new char[param2];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          if (param0 != -24) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var6 = 0; var6 < param2; var6++) {
            var7 = 255 & param1[var6 + param3];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = mh.field_d[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_18_0 = new String(var11, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("mk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_i = (int[]) null;
        }
        field_j = null;
        field_i = null;
    }

    mk(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

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
        var9 = DungeonAssault.field_K;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = jm.a((byte) 59, param1);
          var5 = -123 / ((param2 - 13) / 43);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!jc.a(var4.charAt(0), -119) &&
              !jc.a(var4.charAt(-1 + var4.length()), -59)) {
              var6 = 0;
              for (var7 = 0; var7 < param1.length(); var7++) {
                var8 = param1.charAt(var7);
                if (!jc.a((char) var8, 68)) {
                  var6 = 0;
                } else {
                  var6++;
                }
                if (var6 >= 2 &&
                  !param0) {
                  return false;
                }
              }
              if (var6 <= 0) {
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
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    final static nh a(int param0, byte param1) {
        if (param1 != 34) {
          mk.a(109, (byte) -40);
        }
        return uo.a(false, 1, true, param0, param1 + 27813, false);
    }

    static {
        field_i = new int[4];
    }
}
