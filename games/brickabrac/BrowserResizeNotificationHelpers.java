/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrowserResizeNotificationHelpers {
    static PlatformTask field_d;
    static String field_b;
    static int field_a;
    static String field_e;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -100) {
          field_b = (String) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final static void notifyBrowserResize(int obfuscationGuard, int mode) {
        try {
          Throwable caughtFailure = null;
          int guardCalculation = 0;
          Throwable ignoredBridgeFailure = null;
          guardCalculation = 25 / ((42 - obfuscationGuard) / 40);
          try {
            AppletJavaScriptBridge.callFunction(new Object[]{new Integer(mode)}, 78, EmailConfirmationValidator.e((byte) -82), "resizing");
          } catch (java.lang.Throwable caughtBridgeFailure) {
            caughtFailure = caughtBridgeFailure;
            ignoredBridgeFailure = caughtFailure;
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    static {
        field_b = "Send private Quick Chat to <%0>";
        field_e = "Loading extra data";
        field_c = "Accept unrated rematch";
    }
}
