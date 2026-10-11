/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends rf {
    static String field_i;
    static int field_k;
    int[] field_j;
    static String[] field_f;
    int field_g;
    static byte[][] field_h;

    final static String a(int param0) {
        if (uh.field_k == jl.field_a) {
          return wj.field_c;
        }
        if (!qa.field_a.b(false)) {
          return qa.field_a.a((byte) 2);
        }
        if (ie.field_x == jl.field_a) {
          return qa.field_a.a((byte) 2);
        }
        if (param0 != 29084) {
          CharSequence var2 = (CharSequence) null;
          we.a((byte) -46, (CharSequence) null, false, -37);
        }
        return lc.field_hb;
    }

    private we() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param3 >= 2 &&
            36 >= param3) {
            if (param0 != -108) {
              return true;
            }
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (97 > var9) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
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
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("we.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 95) {
          we.a(-107);
        }
        field_f = null;
        field_h = (byte[][]) null;
        field_i = null;
    }

    static {
        field_k = 0;
        field_f = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_h = new byte[250][];
    }
}
