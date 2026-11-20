/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IconToggleRenderer implements WidgetRenderer {
    static Sprite field_b;
    static String field_a;

    public static void clearSharedReferences(int param0) {
        if (param0 != 4) {
          IconToggleRenderer.clearSharedReferences(4);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          if (param2 >= -48) {
            IconToggleRenderer.clearSharedReferences(36);
          }
          var6_int = param3.x + param1;
          var7 = param3.y + param4;
          tn.a(var6_int, param3.width, 152, var7, param3.height);
          var8 = FullscreenFocusCanvas.field_i[1];
          if (param3 instanceof TextButton &&
            ((TextButton) (param3)).field_B) {
            var8.drawAdditive((-var8.canvasWidth + param3.width >> 1) + 1 + var6_int, (-var8.canvasHeight + param3.height >> 1) + (var7 + 1), 256);
          }
          if (!param3.isFocused((byte) -20)) {
            return;
          }
          GrowableObjectList.a(param3.height - 4, param3.width - 4, 2 + var6_int, var7 + 2, (byte) 19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = "(red)";
    }
}
