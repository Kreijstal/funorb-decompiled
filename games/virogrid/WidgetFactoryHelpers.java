/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetFactoryHelpers {
    static String field_b;
    static int field_c;
    static int[] field_a;
    static String textFullscreenToggle;

    public static void releaseStatics(byte param0) {
        textFullscreenToggle = null;
        field_b = null;
        field_a = null;
        if (param0 != -13) {
          field_c = 58;
        }
    }

    final static SpriteWidget createThemedWidget(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, BitmapFont param8, int param9, int param10, int param11, int param12) {
        SpriteWidget var13 = null;
        RuntimeException var13_ref = null;
        SpriteWidget stackIn_2_0 = null;
        SpriteWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new SpriteWidget(0L, (SpriteWidget) null);
          var13.field_vb = EditableTextWidget.createSolidFrameSprites((byte) 60, param11, param3);
          var13.field_x = EditableTextWidget.createSolidFrameSprites((byte) -111, param6, param4);
          var13.field_T = EditableTextWidget.createSolidFrameSprites((byte) 37, param7, param2);
          if (param1 != -4841) {
            stackIn_2_0 = (SpriteWidget) null;
            return stackIn_2_0;
          }
          var13.field_cb = EditableTextWidget.createSolidFrameSprites((byte) -89, param0, param12);
          var13.field_L = EditableTextWidget.createSolidFrameSprites((byte) -86, param9, param10);
          var13.field_E = param5;
          var13.field_C = param8;
          stackIn_4_0 = var13;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_7_0 = var13_ref;
          stackIn_7_1 = new StringBuilder().append("rb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    static int bitAnd(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_b = "Accept <%0> into this game";
        textFullscreenToggle = "Toggle fullscreen mode";
    }
}
