/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameRequestGlobals {
    static SceneWidget field_a;
    static int[] field_c;
    static String field_b;

    final static void setRequestedDisplayName(boolean param0, String param1) {
        try {
          if (param0) {
            field_a = (SceneWidget) null;
          }
          ConditionalTextValue.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "kh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        if (param0 == 21601) {
          field_b = null;
          return;
        }
        String var2 = (String) null;
        DisplayNameRequestGlobals.setRequestedDisplayName(false, (String) null);
        field_b = null;
    }

    static {
        field_c = new int[8192];
        field_b = "Rank";
    }
}
