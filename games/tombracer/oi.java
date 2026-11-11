/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static PlatformTaskDispatcher field_a;
    static int field_b;

    final static void queueQuickChatMessage(long param0, int param1, int param2, String param3, int param4) {
        try {
          if (param2 <= 1) {
            String var7 = (String) null;
            oi.queueQuickChatMessage(-68L, 54, 86, (String) null, 2);
          }
          VerticalGradientOperator.field_n = param4;
          apa.field_a = param0;
          ConsoleTokenStream.field_b = param3;
          CharacterSelectPhase.field_q = param1;
          LegacyOpenGlTurbulentTextureEffect.field_f = true;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "oi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (param0) {
          oi.releaseStatics(false);
        }
    }

    static {
    }
}
