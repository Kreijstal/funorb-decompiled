/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int[] field_c;
    static String field_e;
    static double field_d;
    static String field_f;
    static int[] unlockedLevelCounts;
    static String field_a;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_a = null;
          field_e = null;
          field_f = null;
          unlockedLevelCounts = null;
          return;
        }
        unlockedLevelCounts = (int[]) null;
        field_a = null;
        field_e = null;
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
          Rasterizer2D.fillVerticalGradient(0, 0, param3.width, param3.height, um.field_u[param5], 928072);
          og.a(-124, 128, 8, param0, 16777215, (-param0.canvasWidth + param3.width) / 2, 85 + (param1 - param0.canvasHeight));
          if (param4 != -8562) {
            return;
          }
          og.a(-113, 8, 128, param6, 16777215, (param3.width - param0.canvasWidth) / 2, 480 + param1 + (-param0.canvasHeight + 60 / param2));
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
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != 29605) {
            stackIn_3_0 = -85;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (param0 > 1) {
            if (0 != (param0 & 1)) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param0 = param0 >> 1;
          }
          if (1 != param0) {
            stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          stackIn_13_0 = param2 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var3), "hh.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "+<%0>";
        field_f = "Yes";
        field_c = new int[]{12658477, 3952770, 16494651, 26679, 16711935};
        field_d = Math.atan2(1.0, 0.0);
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        unlockedLevelCounts = new int[2];
    }
}
