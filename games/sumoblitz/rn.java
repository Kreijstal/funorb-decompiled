/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static String unfortunatelyYouAreNotText;

    final static void a(String param0, int param1, int param2, int param3, int param4) {
        try {
          ig.hudMessages.addLast((IntrusiveNode) (new HudMessage(param0, param3, param1, param2)), (byte) 39);
          if (param4 != 28807) {
            rn.releaseStatics(16);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        unfortunatelyYouAreNotText = null;
        if (param0 != 13921) {
          String var2 = (String) null;
          rn.a((String) null, 84, 7, -70, 53);
        }
    }

    static {
        unfortunatelyYouAreNotText = "Unfortunately you are not eligible to create an account.";
    }
}
