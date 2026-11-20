/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NullUiRenderer implements UiRenderer {
    static ChatMessage[] chatMessages;
    static String field_a;

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        try {
          int var6_int = 34 % ((-27 - param0) / 35);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nrb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        chatMessages = null;
        field_a = null;
        if (param0 != 11227) {
          NullUiRenderer.clearSharedReferences(-127);
        }
    }

    static {
        TimedSpecialOrderBehaviourFactory discarded$0 = new TimedSpecialOrderBehaviourFactory();
        field_a = "Decline invitation to <%0>'s game";
    }
}
