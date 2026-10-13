/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static ResourceArchive field_c;
    static String field_b;
    static RgbSprite[][] field_a;

    final static void a(int param0, int param1, int param2, int param3, TextFont param4, int param5, int param6, int param7, int param8, int param9, RgbSprite[] param10, TextFont param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, RgbSprite[] param19, RgbSprite[] param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (param7 != -111) {
            field_a = (RgbSprite[][]) null;
          }
          pa.a(param6, param18, param15, param4, param3, param5, param13, new ta(param10), param1, param14, param12, param9, param0, new ta(param19), param2, param8, param11, new ta(param20), param16, param17, 10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("ja.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param11 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param20 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 2) {
          field_b = null;
          field_c = null;
          field_a = (RgbSprite[][]) null;
          return;
        }
        field_a = (RgbSprite[][]) null;
        field_b = null;
        field_c = null;
        field_a = (RgbSprite[][]) null;
    }

    final static void a(byte param0, RgbSprite param1, int param2, int param3, PlayerBoard param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        RgbSprite var9 = null;
        int var10 = 0;
        try {
          if (param0 > -13) {
            return;
          }
          var5_int = param4.stateTicks;
          stackIn_5_0 = (var5_int >= 96) ? 96 : var5_int;
          var6 = stackIn_5_0;
          var5_int -= 50;
          Rasterizer2D.fillRectangleAlpha(7, 7, param2, param3, 0, var6);
          if (var5_int <= 0) {
            return;
          }
          var7 = 250.0 * Math.abs(Math.cos((double)var5_int * 0.1)) * Math.exp((double)(-var5_int) / 40.0);
          if (var5_int >= 110) {
            var7 = 0.0;
          }
          var9 = nl.field_b;
          var9.drawTransparent((-var9.canvasWidth + param2) / 2 + 7, -(int)var7 + 125);
          if (var5_int > 95) {
            var10 = -95 + var5_int;
            if (96 < var10) {
              var10 = 96;
            }
            param1.b(7 + (-param1.canvasWidth + param2) / 2, 260, var10 * 256 / 96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ja.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int a(int param0, LevelSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            stackIn_4_0 = ln.a(param1.pack, param0, true, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = -123;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ja.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static GameClock createGameClock(byte obfuscationGuard) {
        if (obfuscationGuard >= 105) {
          return (GameClock) ((Object) new NanoGameClock());
        }
        LevelSequence var2 = (LevelSequence) null;
        ja.a(64, (LevelSequence) null, 69, false);
        return (GameClock) ((Object) new NanoGameClock());
    }

    static {
        field_b = "Try again";
    }
}
