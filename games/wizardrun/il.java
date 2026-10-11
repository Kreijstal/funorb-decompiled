/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static String field_d;
    static boolean field_e;
    static uk field_b;
    static int field_c;

    final static int a(int param0, byte param1, CharSequence param2, boolean param3) {
        int var8 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var9Lifetime1;
        var11 = wizardrun.field_H;
        try {
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
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
                !param3))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
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
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            var9Lifetime1 = 60 / ((54 - param1) / 63);
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_38_0 = var6;
            return stackIn_38_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("il.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, vd param1, o[] param2, byte param3, o[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, o[] param12, int param13, int param14) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        int var17 = 0;
        try {
          var17 = 116 % ((-65 - param3) / 32);
          var15_int = param1.field_B + param1.field_q;
          var16 = param1.field_q;
          we.a(480, -76, param1, param8, param2, var16, param13, param11, param1, param0, var15_int, param9, param10, param5, param14, var15_int, param6, param4, param7, param12, var16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_4_0 = var15;
          stackIn_4_1 = new StringBuilder().append("il.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (!param0) {
          o[] var2 = (o[]) null;
          il.a(38, (vd) null, (o[]) null, (byte) 32, (o[]) null, 126, -35, -34, -69, 83, 52, -119, (o[]) null, -69, -124);
        }
    }

    static {
        field_d = "Waiting for sound effects";
        field_c = 0;
    }
}
