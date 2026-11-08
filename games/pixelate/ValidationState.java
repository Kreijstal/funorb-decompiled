/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationState {
    static boolean field_c;
    static SceneWidget field_a;
    static int[] field_b;

    final static void a(byte param0, BitmapFont param1, BitmapFont param2, int param3) {
        try {
          if (param0 >= -98) {
            BitmapFont var5 = (BitmapFont) null;
            ValidationState.a((byte) -124, (BitmapFont) null, (BitmapFont) null, -15);
          }
          MouseInputHandler.field_c = param3;
          StatusBar.field_j = param2;
          ScoreMarkerBar.field_y = param1;
          OptionsScreen.setLegacyMenuCentre(SoftwareRasterizer.field_d / 2, SoftwareRasterizer.field_j / 2, true);
          BackgroundScene.setLegacyMenuFontMetrics(param2.maxDescent + param2.field_D, false, param1.field_D, param2.field_D, param1.field_D + param1.maxDescent);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "dj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, Sprite[] param2, int param3) {
        try {
          NodeHashTable.field_c = new sb(param2);
          AudioService.field_d = param1;
          MouseWheelHandler.field_d = param0;
          ValidationState.a(param3);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "dj.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var1Lifetime1;
        int var2Lifetime1;
        if (param0 == -1501881951) {
          var1 = ResizableModalPanel.getLegacyMenuHeight(param0 + 1501881973);
          var2 = EmailCredentials.c(107);
          NodeHashTable.field_c.a(-AudioService.field_d + ce.field_c, (AudioService.field_d << 1) + var2, param0 + 1501881950, (MouseWheelHandler.field_d << 1) + var1, -MouseWheelHandler.field_d + qn.field_o);
          GzipDecoder.a(88);
          return;
        }
        ValidationState.releaseStatics(-112);
        var1Lifetime1 = ResizableModalPanel.getLegacyMenuHeight(param0 + 1501881973);
        var2Lifetime1 = EmailCredentials.c(107);
        NodeHashTable.field_c.a(-AudioService.field_d + ce.field_c, (AudioService.field_d << 1) + var2Lifetime1, param0 + 1501881950, (MouseWheelHandler.field_d << 1) + var1Lifetime1, -MouseWheelHandler.field_d + qn.field_o);
        GzipDecoder.a(88);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 > -113) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = new int[8192];
    }
}
