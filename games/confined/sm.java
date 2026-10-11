/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends rl {
    static mn field_y;
    ae field_B;
    static od field_A;
    int field_z;
    byte[] field_C;

    final static boolean a(int param0, hb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -87 / ((param0 + 63) / 59);
          stackIn_3_0 = (1 == param1.g(1, 0));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param4 != 87) {
            field_y = (mn) null;
          }
          while (true) {
            param3--;
            if (0 > param3) {
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param2;
            var7 = param1;
            var9[var6] = var7 + (va.a(var9[var6], 16711422) >> 1);
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("sm.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final byte[] e(byte param0) {
        if (this.field_v) {
          throw new RuntimeException();
        }
        if (param0 < 82) {
          return (byte[]) null;
        }
        return this.field_C;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, boolean param3) {
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
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = param1 ? 1 : 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (43 != var9 ||
                !param3))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param2) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param2 + var9;
                if (var6 != var10 / param2) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_41_0 = var5;
            return stackIn_41_0 != 0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("sm.G(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int f(byte param0) {
        if (this.field_v) {
          return 0;
        }
        if (param0 != 100) {
          this.field_z = 27;
          return 100;
        }
        return 100;
    }

    public static void g(byte param0) {
        field_A = null;
        field_y = null;
        if (param0 == 81) {
          return;
        }
        field_A = (od) null;
    }

    sm() {
    }

    static {
        field_y = new mn();
    }
}
