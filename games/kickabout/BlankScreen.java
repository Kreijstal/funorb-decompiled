/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlankScreen extends AppScreen {
    static String field_g;
    static hd field_h;

    final void drawScreen(int param0, boolean param1) {
        SoftwareRasterizer.fillRect(0, 0, 640, 480, 65793);
        if (param0 != -5) {
          field_h = (hd) null;
        }
    }

    final void updateScreen(byte param0, boolean param1) {
        int var3 = -97 % ((38 - param0) / 60);
    }

    final boolean handleKey(int param0, int param1, char param2) {
        if (param1 > -5) {
          BlankScreen.a(114);
          return false;
        }
        return false;
    }

    final void setTransitionProgress(int param0, boolean param1, int param2, AppScreen param3) {
        try {
          if (param2 > -28) {
            BlankScreen.a(-50);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 <= 32) {
          return;
        }
        field_g = null;
    }

    BlankScreen() {
        super(-4);
    }

    static {
        field_g = "Start Game";
    }
}
