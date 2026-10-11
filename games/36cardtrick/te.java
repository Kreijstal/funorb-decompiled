/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    static String field_b;
    static int field_a;

    final static kc a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Main.field_T;
        kc var6 = new kc(param0, param0);
        kc var3 = var6;
        if (param1 >= -123) {
          return (kc) null;
        }
        for (var4 = 0; var4 < var3.field_r.length; var4++) {
          var6.field_r[var4] = param2;
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 87) {
          te.a(64, 51, -77);
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (String) null;
            te.a(false, (String) null);
          }
          if (param1 != null &&
            param1.length() >= lg.field_k &&
            param1.length() <= jd.field_g) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("te.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    abstract int b(int param0);

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
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
        var11 = Main.field_T;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
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
                !param3))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param0) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var10 / param0 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (param1 > 62) {
              stackIn_43_0 = var5;
              return stackIn_43_0 != 0;
            }
            return true;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("te.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "Type your email address again to make sure it's correct";
    }
}
