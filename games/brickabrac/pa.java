/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends NineSliceFrame {
    static RgbSprite[] field_l;
    static QuickChatParameterType field_k;
    static RgbSprite[] field_h;
    static RgbSprite[] field_m;
    static int[] field_i;
    static RgbSprite field_j;
    static int field_n;

    final static void a(int param0, int param1, int param2, TextFont param3, int param4, int param5, int param6, NineSliceFrame param7, int param8, int param9, int param10, int param11, int param12, NineSliceFrame param13, int param14, int param15, TextFont param16, NineSliceFrame param17, int param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          Mesh3D.a(param6, param16, param3, true);
          MusicCrossfadeStream.a(param11, param14, 256, param18, param0);
          pp.a(param5, param4, (byte) 19);
          WidgetLayerStack.a(param15, param2, param13, 73, param17, param19);
          hd.a(117, param7, param10, param1);
          LegacyUtf8Decoder.a(param12, param9, false, param8);
          if (param20 != 10) {
            pa.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param17 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void paintFrame(int width, int height, int x, boolean obfuscationGuard, int y) {
        Rasterizer2D.fillRectangleAlpha(x + 1, 1 + y, width - 2, height - 2, 0, 128);
        super.paintFrame(width, height, x, obfuscationGuard, y);
    }

    final static void a(boolean param0) {
        if (param0) {
          ed.a(0, 0);
          return;
        }
        NineSliceFrame var2 = (NineSliceFrame) null;
        pa.a(-2, -34, -105, (TextFont) null, -37, -46, -79, (NineSliceFrame) null, 96, 79, -47, -14, 91, (NineSliceFrame) null, -22, -64, (TextFont) null, (NineSliceFrame) null, 77, -115, -55);
        ed.a(0, 0);
    }

    pa(RgbSprite[] param0) {
        super(param0);
    }

    public static void c(int param0) {
        field_m = null;
        field_i = null;
        field_k = null;
        field_h = null;
        field_j = null;
        if (param0 != 5) {
          return;
        }
        field_l = null;
    }

    static {
        field_i = new int[1500];
        field_k = new QuickChatParameterType(10, 2, 2, 0);
        field_n = 5;
    }
}
