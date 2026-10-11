/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements ch {
    static String field_d;
    static int field_f;
    static rh field_e;
    static String[] field_a;
    static vc field_c;
    static long field_b;

    final static int a(int param0, int param1) {
        if (param1 <= 113) {
          field_e = (rh) null;
        }
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return param0 >= 2048 ? dk.field_D[4096 - param0] : dk.field_D[param0];
        }
        return param0 < 6144 ? -dk.field_D[-4096 + param0] : -dk.field_D[8192 - param0];
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -37) {
          jc.a(84, 50);
        }
        field_e = null;
        field_c = null;
        field_a = null;
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        dd var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = param1 + param3.field_y;
          if (param0 >= -36) {
            return;
          }
          var7 = param3.field_z + param4;
          pj.a((byte) 127, param3.field_u, var7, var6_int, param3.field_j);
          var8 = t.field_h[1];
          if (param3 instanceof bb &&
            ((bb) (param3)).field_G) {
            var8.a(var6_int + (1 + (param3.field_u - var8.field_x >> 1)), (-var8.field_r + param3.field_j >> 1) + (var7 + 1), 256);
          }
          if (param3.e(1)) {
            ek.a(param3.field_j - 4, 2 + var6_int, 2 + var7, 1, -4 + param3.field_u);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("jc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_7_0 = 0;
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
        var11 = fleas.field_A ? 1 : 0;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            if (param1 <= 104) {
              stackIn_7_0 = 51;
              return stackIn_7_0;
            }
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
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
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param0) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var10 / param0 != var6) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("jc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
        field_c = null;
        field_f = 0;
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
