/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleEvaluationException extends Exception {
    static String field_d;
    String diagnostic;
    static ClientUiComponent field_c;
    static MusicTrack[] field_a;

    public static void a(int param0) {
        field_d = null;
        int var1 = -112 / ((param0 - 70) / 54);
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, RgbSprite param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        try {
          var6_int = TriangleRasterizer.projectionCenterX;
          var7 = TriangleRasterizer.projectionCenterY;
          var8 = TriangleRasterizer.sineTable[150];
          var9 = TriangleRasterizer.cosineTable[150];
          var10 = param5 * var9 - param0 * var8 >> 16;
          int var12 = 69 % ((-24 - param3) / 46);
          var11 = param5 * var8 + var9 * param0 >> 16;
          if (var11 > 0) {
            var13 = var6_int + (param4 << 9) / var11;
            var14 = (var10 << 9) / var11 + var7;
            param1.drawAdditive(var13, var14, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    ConsoleEvaluationException(String diagnostic) {
        try {
          this.diagnostic = diagnostic;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cb.<init>(" + (diagnostic != null ? "{...}" : "null") + ')');
        }
    }

    final static RgbSprite[] a(boolean param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        RgbSprite[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        RgbSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (RgbSprite[]) null;
            return stackIn_2_0;
          }
          if (kp.decodeSpriteSheetFromArchive(param0, param2, param1, param3)) {
            stackIn_7_0 = ParasiteEvent.buildDecodedRgbSprites(122);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (RgbSprite[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = "Options";
        field_a = new MusicTrack[6];
    }
}
