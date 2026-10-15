/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int[] volcanicBackgroundColors;
    static String positiveBoardResultFormat;
    static double field_d;
    static String field_f;
    static int[] unlockedLevelCounts;
    static String field_a;

    public static void a(boolean param0) {
        volcanicBackgroundColors = null;
        if (param0) {
          field_a = null;
          positiveBoardResultFormat = null;
          field_f = null;
          unlockedLevelCounts = null;
          return;
        }
        unlockedLevelCounts = (int[]) null;
        field_a = null;
        positiveBoardResultFormat = null;
        field_f = null;
        unlockedLevelCounts = null;
    }

    final static void a(RgbSprite param0, int param1, int param2, RasterCacheSurface param3, int param4, int param5, RgbSprite param6) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-72, param3.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param3.width, param3.height, TextWidgetRenderer.underwaterBackgroundColors[param5], 928072);
          QuickChatMenu.a(-124, 128, 8, param0, 16777215, (-param0.canvasWidth + param3.width) / 2, 85 + (param1 - param0.canvasHeight));
          if (param4 != -8562) {
            return;
          }
          QuickChatMenu.a(-113, 8, 128, param6, 16777215, (param3.width - param0.canvasWidth) / 2, 480 + param1 + (-param0.canvasHeight + 60 / param2));
          sc.popRaster(-90);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("hh.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int integerPower(int exponent, int obfuscationGuard, int base) {
        int product = 0;
        RuntimeException failure = null;
        int unusedGameFlag = 0;
        int invalidGuardResult = 0;
        int finalProduct = 0;
        int nonpositiveProduct = 0;
        RuntimeException caughtFailure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 29605) {
            invalidGuardResult = -85;
            return invalidGuardResult;
          }
          product = 1;
          while (exponent > 1) {
            if (0 != (exponent & 1)) {
              product = product * base;
            }
            base = base * base;
            exponent = exponent >> 1;
          }
          if (1 != exponent) {
            nonpositiveProduct = product;
            return nonpositiveProduct;
          }
          finalProduct = base * product;
          return finalProduct;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "hh.A(" + exponent + ',' + obfuscationGuard + ',' + base + ')');
        }
    }

    static {
        positiveBoardResultFormat = "+<%0>";
        field_f = "Yes";
        volcanicBackgroundColors = new int[]{12658477, 3952770, 16494651, 26679, 16711935};
        field_d = Math.atan2(1.0, 0.0);
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        unlockedLevelCounts = new int[2];
    }
}
