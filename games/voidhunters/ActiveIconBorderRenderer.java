/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ActiveIconBorderRenderer implements UiRenderer {
    static int field_b;
    static int[] field_a;
    static AccountRequestPhase pendingAccountRequest;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        pendingAccountRequest = null;
        if (param0 < 113) {
          field_a = (int[]) null;
        }
    }

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        int var9 = 0;
        try {
          var6_int = param1.x + param2;
          var7 = param3 + param1.y;
          ServerTickFactory.drawGradientBorder(var7, (byte) 115, param1.height, param1.width, var6_int);
          var8 = ByteStorage.field_a[1];
          if (param1 instanceof UiFocusableComponent &&
            ((UiFocusableComponent) (param1)).active) {
            var8.drawAdditive((-var8.paddedWidth + param1.width >> 1) + (1 + var6_int), 1 + (var7 + (-var8.paddedHeight + param1.height >> 1)), 256);
          }
          if (param1.hasFocus((byte) -120)) {
            SetCountermeasureLauncherRandomness.drawDottedFocusRectangle(var7 + 2, param1.width - 4, var6_int + 2, -4 + param1.height, (byte) -62);
          }
          var9 = -1 / ((-27 - param0) / 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("dw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = 10;
        pendingAccountRequest = new AccountRequestPhase();
    }
}
