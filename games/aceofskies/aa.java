/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static MenuScreen[] field_b;
    static int[] field_c;
    static String field_d;
    static RenderSprite[] field_a;

    protected aa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == 0) {
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
        aa.b(-69);
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void b(int param0) {
        String var2 = (String) null;
        ub.a(rt.field_e, (String) null, -117);
        if (param0 != 87) {
          field_d = (String) null;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, byte param3) {
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
        var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (2 <= param1 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            if (param3 != -43) {
              field_c = (int[]) null;
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
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param0))) {
                if (var9 >= 48 &&
                  57 >= var9) {
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
                if (param1 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param1 * var6 + var9;
                if (var6 != var10 / param1) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_40_0 = var5;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("aa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = new MenuScreen[8];
        field_d = "Account created successfully!";
    }
}
