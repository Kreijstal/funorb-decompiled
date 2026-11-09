/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputShutdown {
    static LegacyBitmapFont field_a;
    static long field_b;
    static String field_d;
    static String bestHiscoresText;

    public static void releaseStatics(int guard) {
        field_d = null;
        bestHiscoresText = null;
        if (guard != -23787) {
          MouseInputShutdown.releaseMouseInput(123);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void releaseMouseInput(int guard) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (guard != 28679) {
          return;
        }
        if (ConfirmedEmailValidator.field_h == null) {
          return;
        }
        var1 = ConfirmedEmailValidator.field_h;
        synchronized (var1) {
          ConfirmedEmailValidator.field_h = null;
        }
    }

    static {
        bestHiscoresText = "BEST HISCORES";
    }
}
