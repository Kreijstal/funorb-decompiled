/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends IntrusiveNode {
    int field_g;
    static String field_l;
    static te field_k;
    static int field_h;
    int field_i;
    static boolean field_j;

    public static void d(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 29152) {
          field_l = (String) null;
        }
    }

    final static void e(int param0) {
        if (mj.field_d == 0) {
          sj.a(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (param0 != -46) {
          rl.e(-10);
        }
        if (20 <= mj.field_d) {
          IntValueNode.field_j = false;
        }
        if (mj.field_d < 1000) {
          mj.field_d = mj.field_d + 1;
        }
        da.field_c.a((byte) -75);
    }

    final static boolean a(int param0, byte param1, boolean param2, CharSequence param3) {
        String stackIn_49_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            boolean var4_int = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = param3.length();
            for (int var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              int var9 = param3.charAt(var8);
              if (var8 == 0 &&
                var9 == 45) {
                var4_int = true;
                decompiledFrameRemainder0 = false;
              }
              if (decompiledFrameRemainder0 && (var8 != 0 || (var9 != 43 ||
                !param2))) {
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
                if (var9 >= param0) {
                  return false;
                }
                if (var4_int) {
                  var9 = -var9;
                }
                int var10 = var6 * param0 + var9;
                if (var10 / param0 != var6) {
                  return false;
                }
                var5 = true;
                var6 = var10;
              }
            }
            if (param1 > 20) {
              boolean stackIn_45_0 = var5;
              return (stackIn_45_0);
            }
            return false;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_48_0 = var4;
          StringBuilder stackIn_48_1 = new StringBuilder().append("rl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        field_l = "Out of fuel!";
        field_j = false;
    }
}
