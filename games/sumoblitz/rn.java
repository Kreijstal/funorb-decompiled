/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static String unfortunatelyYouAreNotText;

    final static void postHudMessage(String text, int x, int y, int color, int guard) {
        try {
          ig.hudMessages.addLast((IntrusiveNode) (new HudMessage(text, color, x, y)), (byte) 39);
          if (guard != 28807) {
            rn.releaseStatics(16);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rn.B(" + (text != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + color + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int param0) {
        unfortunatelyYouAreNotText = null;
        if (param0 != 13921) {
          String var2 = (String) null;
          rn.postHudMessage((String) null, 84, 7, -70, 53);
        }
    }

    static {
        unfortunatelyYouAreNotText = "Unfortunately you are not eligible to create an account.";
    }
}
