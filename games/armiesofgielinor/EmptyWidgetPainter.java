/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmptyWidgetPainter implements WidgetPainter {
    static boolean field_a;
    static volatile int keyboardIdleTicks;
    static String field_c;

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        try {
          if (obfuscationGuard >= -79) {
            keyboardIdleTicks = 123;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fc.C(" + (widget != null ? "{...}" : "null") + ',' + originX + ',' + obfuscationGuard + ',' + renderFlag + ',' + originY + ')');
        }
    }

    public static void releaseStatics(int obfuscationGuard) {
        if (obfuscationGuard >= -86) {
          EmptyWidgetPainter.releaseStatics(115);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = "This cannon can only use fire weapons.";
        keyboardIdleTicks = 0;
    }
}
